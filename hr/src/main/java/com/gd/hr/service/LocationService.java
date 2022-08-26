package com.gd.hr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.hr.mapper.LocationMapper;
import com.gd.hr.mapper.RegionMapper;
import com.gd.hr.vo.Location;
import com.gd.hr.vo.Region;

@Service
public class LocationService implements ILocationService{
	
	//어노테이션 주석
	@Autowired LocationMapper locationMapper;
	@Autowired RegionMapper regionMapper;
	
	@Override
	public List<Map<String, Object>> getLocationList() {
	
	return locationMapper.selectLocationList();
	}

	@Override
	public int addLocation(Location location) {
		
		int row = locationMapper.insertLocation(location); 
		
		return row;
	}

	@Override
	public Map<String, Object> addLocationForm() {
		Map<String, Object> resultMap = new HashMap<>();
		
		List<Region> regionList = regionMapper.selectRegionList();
		resultMap.put("regionList", regionList);
		
		return resultMap;
	}



}
