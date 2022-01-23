package com.promineotech.jeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.entity.Jeep;
import com.promineotech.entity.JeepModel;
import com.promineotech.jeep.dao.JeepSalesDao;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultJeepSalesService implements JeepSalesService {

	//@Override
	@Autowired
	private JeepSalesDao jeepSalesDao;
	public List<Jeep> fetchJeeps(JeepModel model, String trim) {
		log.info("Service: model= {}, trim = {} ", model, trim);
		return jeepSalesDao.fetchJeeps(model, trim);
	}

}