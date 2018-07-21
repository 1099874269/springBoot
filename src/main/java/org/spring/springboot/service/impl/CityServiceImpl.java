package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    public CityDao cityDao;

    public List<Map<String,Object>> findCityByName(String cityName) {
        List<Map<String,Object>> list = cityDao.findByName(cityName);
        return list;
    }

}
