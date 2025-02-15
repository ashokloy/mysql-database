package com.learning.database.mysqldatabase.controller;

import com.learning.database.mysqldatabase.entity.City;
import com.learning.database.mysqldatabase.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/get")
    ResponseEntity<City> getCity(@RequestParam Integer id){
        return ResponseEntity.ok(cityService.getCountry(id));
    }

    @GetMapping("/getAll")
    ResponseEntity<List<City>> getAllCities(){
        return ResponseEntity.ok(cityService.getAllCities());
    }
}
