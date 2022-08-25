package com.gd.hr.service;

import java.util.List;

import com.gd.hr.vo.Region;

public interface IRegionService {
	
	//지역목록
	List<Region> getRegionList();
	
	//지역추가
	int addRegion(Region region);
	
	//지역지우기
	int removeRegion(int regionId);
	
	//지역수정
	int modifyRegion(Region region);
	
}
