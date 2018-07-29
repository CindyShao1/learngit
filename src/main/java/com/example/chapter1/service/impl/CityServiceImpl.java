package com.example.chapter1.service.impl;

import com.example.chapter1.DAO.CityMapper;
import com.example.chapter1.domain.City;
import com.example.chapter1.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public int add(City city) {
        return cityMapper.add(city);
    }

    @Override
    public City queryCityById(String id) {
        return cityMapper.queryCityById(id);
    }
}
