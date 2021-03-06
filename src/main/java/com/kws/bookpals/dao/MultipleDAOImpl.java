package com.kws.bookpals.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kws.bookpals.entity.CityE;

@Repository
public class MultipleDAOImpl implements CityDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(MultipleDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<CityE> getAllCities() {
		Session session = this.sessionFactory.getCurrentSession();
		List<CityE> cities = session.createQuery(" from CityE").list();
		return cities;
	}

}
