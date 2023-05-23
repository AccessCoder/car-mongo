package com.example.carmongo.controller;

import com.example.carmongo.model.Car;
import com.example.carmongo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @GetMapping
    public List<Car> getAllCars(){
        return service.getAllCars();
    }

    @PostMapping(path = "{key}")
    public Car saveCar(@PathVariable String key, @RequestBody Car car){
        return service.saveCar(car);
    }


}
