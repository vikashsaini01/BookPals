package com.kws.bookpals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kws.bookpals.dao.CityDAO;
import com.kws.bookpals.entity.City;

@Service
public class MultipleServiceImpl implements CityService {

	@Autowired
	private CityDAO cityDAO;

	@Autowired
	public void setCityDAO(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	@Override
	@Transactional
	public List<City> getAllCities() {
		return this.cityDAO.getAllCities();
	}

}
