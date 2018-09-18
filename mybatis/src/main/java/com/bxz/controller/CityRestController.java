package com.bxz.controller;

import com.bxz.domain.City;
import com.bxz.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SQ_BXZ on 2018-09-18.
 */
@RestController
public class CityRestController {
	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/api/city", method = RequestMethod.GET)
	public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
		return cityService.findCityByName(cityName);
	}

}
