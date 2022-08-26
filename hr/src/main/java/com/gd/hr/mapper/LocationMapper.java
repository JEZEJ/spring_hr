package com.gd.hr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Location;

@Mapper
public interface LocationMapper {
	
	// List목록
	List<Map<String,Object>> selectLocationList(); 
	
	// add location
	int insertLocation(Location location);
	
	
	

}
