package com.learning.database.mysqldatabase.service;

import com.learning.database.mysqldatabase.entity.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
     City getCountry (Integer id);
     List<City> getAllCities();
}
