package com.example.chapter1.service;

import com.example.chapter1.domain.City;

public interface CityService {
    int add(City city);
    City queryCityById(String id);
}
