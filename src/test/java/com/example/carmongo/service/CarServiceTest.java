package com.example.carmongo.service;

import com.example.carmongo.model.Car;
import com.example.carmongo.repo.CarRepo;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarServiceTest {

    CarRepo repo = mock(CarRepo.class);
    CarService service = new CarService(repo);

    @Test
    void getAllCars() {
        //GIVEN
        when(repo.findAll()).thenReturn(List.of());
        //WHEN
        List<Car> actual = service.getAllCars();
        //THEN
        assertEquals(List.of(), actual);
        verify(repo).findAll();
    }

    @Test
    @DirtiesContext
    void saveCar() {
        //GIVEN
        Car testCar = Car.builder()
                .id("1")
                .build();

        when(repo.save(testCar)).thenReturn(testCar);
        //WHEN
        Car actual = service.saveCar(testCar);
        //THEN
        assertEquals(testCar, actual);
        verify(repo).save(testCar);
    }
}