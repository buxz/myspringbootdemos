package com.bxz.service.impl;

import com.bxz.dao.CityDao;
import com.bxz.domain.City;
import com.bxz.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SQ_BXZ on 2018-09-18.
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	public City findCityByName(String cityName) {
		return cityDao.findByName(cityName);
	}
}
