package com.learning.database.mysqldatabase.service.impl;

import com.learning.database.mysqldatabase.entity.City;
import com.learning.database.mysqldatabase.repository.CityRepo;
import com.learning.database.mysqldatabase.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepo cityRepo;

    @Override
    public City getCountry(Integer id) {
        return null;
    }

    @Override
    public List<City> getAllCities() {
        return cityRepo.findAll();
    }
}
