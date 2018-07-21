package org.spring.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
@RequestMapping(value = "springBoot")
public class CityRestController {

    @Autowired
    private CityService cityService;
    private Logger LOG =LoggerFactory.getLogger(CityRestController.class);
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List findOneCity(@RequestParam(value = "cityName", required = false) String cityName) {
        LOG.info(cityService.findCityByName(cityName)+"1111");
        return cityService.findCityByName(cityName);
    }

}
