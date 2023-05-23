package com.example.carmongo.controller;

import com.example.carmongo.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class CarControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void getAllCars() throws Exception {
        //GIVEN

        //WHEN&THEN
        mvc.perform(MockMvcRequestBuilders.get(""))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    void saveCar() throws Exception {
        //GIVEN
        Car car = Car.builder()
                .id("1")
                .brand("BMW")
                .model("3")
                .year(1999)
                .build();
        //WHEN&THEN
        mvc.perform(MockMvcRequestBuilders.post("/"+car.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                        "id": "1",
                        "brand": "BMW",
                        "model": "3",
                        "year": 1999
                        }
                        """))
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        {
                        "id": "1",
                        "brand": "BMW",
                        "model": "3",
                        "year": 1999
                        }
                        """));
    }
}