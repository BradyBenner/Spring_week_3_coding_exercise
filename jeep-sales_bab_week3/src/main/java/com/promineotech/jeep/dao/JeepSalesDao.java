/**
 * 
 */
package com.promineotech.jeep.dao;

import java.util.List;

import com.promineotech.entity.Jeep;
import com.promineotech.entity.JeepModel;

/**
 * @author bbenner
 *
 */
public interface JeepSalesDao {
	List<Jeep> fetchJeeps(JeepModel model, String trim);
 }
