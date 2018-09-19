package com.bxz.controller;

import com.bxz.domain.City;
import com.bxz.property.HomeProperties;
import com.bxz.property.UserProperties;
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
@RequestMapping("/property")
public class PropertyRestController {


	@Autowired
	private HomeProperties homeProperties;

	@Autowired
	private UserProperties userProperties;


	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return homeProperties.toString();
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return userProperties.toString();
	}

}
