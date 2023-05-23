package com.example.carmongo.repo;


import com.example.carmongo.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//MongoRepository <{Was wird gespeichert?}, {Datentyp der ID?}>
@Repository
public interface CarRepo extends MongoRepository<Car, String> {


}
