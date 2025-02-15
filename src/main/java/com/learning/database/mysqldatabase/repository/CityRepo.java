package com.learning.database.mysqldatabase.repository;

import com.learning.database.mysqldatabase.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository <City, Integer>{
}
