package com.gd.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.gd.hr.vo.Location;


public interface ILocationService {
	
	//주 목록보기
	List<Map<String,Object>> getLocationList(); 
	
	int addLocation(Location location);
	
	Map<String,Object> addLocationForm(); // regionList를 리턴할거임
	

}
