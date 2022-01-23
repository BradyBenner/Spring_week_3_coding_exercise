/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;

import com.promineotech.entity.Jeep;
import com.promineotech.entity.JeepModel;

/**
 * @author bbenner
 *
 */
public interface JeepSalesService {

	List<Jeep> fetchJeeps(JeepModel model, String trim);

}
