package com.bxz.dao;

import com.bxz.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * Created by SQ_BXZ on 2018-09-18.
 */
public interface CityDao {
	/**
	 * 根据城市名称，查询城市信息
	 *
	 * @param cityName 城市名
	 */
	City findByName(@Param("cityName") String cityName);
}
