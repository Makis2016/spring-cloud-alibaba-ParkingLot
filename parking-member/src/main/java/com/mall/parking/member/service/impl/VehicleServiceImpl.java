package com.mall.parking.member.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.mall.parking.common.exception.BusinessException;
import com.mall.parking.member.entity.Vehicle;
import com.mall.parking.member.entity.VehicleExample;
import com.mall.parking.member.mapper.VehicleMapper;
import com.mall.parking.member.service.VehicleService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 公众号：歪脖贰点零 See more at : https://xiaozhuanlan.com/msa-practice
 *
 */
@Service
@Slf4j
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleMapper vehicleMapper;
	
	@Override
	public int addVehicle(String json) throws BusinessException{
		Vehicle vehicle = JSONObject.parseObject(json, Vehicle.class);
		return vehicleMapper.insertSelective(vehicle);
	}

	@Override
	public Vehicle getVehicle(String vehicleNo) throws BusinessException{
		VehicleExample example = new VehicleExample();
		example.createCriteria().andPlateNoEqualTo(vehicleNo.trim());
		List<Vehicle> vehicles = vehicleMapper.selectByExample(example);
		Vehicle vehicle = null;
		if (CollectionUtils.isEmpty(vehicles)) {
			log.info("VehicleNo = " + vehicleNo + " is temporary ! ");
			return vehicle;
		}else {
			vehicle = vehicles.get(0);
		}
		
		return vehicle;
	}

}
