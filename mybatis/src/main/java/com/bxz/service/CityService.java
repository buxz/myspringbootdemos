package com.bxz.service;

import com.bxz.domain.City;

/**
 * Created by SQ_BXZ on 2018-09-18.
 */
public interface CityService {

	/**
	 * 根据城市名称，查询城市信息
	 * @param cityName
	 */
	City findCityByName(String cityName);

}
