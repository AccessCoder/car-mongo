package com.example.carmongo.service;

import com.example.carmongo.model.Car;
import com.example.carmongo.repo.CarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepo repo;
    public List<Car> getAllCars() {
        return repo.findAll(); //Die Namen ändern sich, da wir die Mongo Funktionen benutzen.
    }

    public Car saveCar(Car car) {
        return repo.save(car); //Die Namen ändern sich, da wir die Mongo Funktionen benutzen.
    }


}
