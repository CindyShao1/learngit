package com.example.chapter1.DAO;

import com.example.chapter1.domain.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Mapper
public interface CityMapper {
   // @Insert("insert into city(id,province_id,city_name,description) values(#{id},#{province_id},#{city_name},#{description})")
    int add(City city);

    City queryCityById(String id);
}
