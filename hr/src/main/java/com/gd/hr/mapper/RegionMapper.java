package com.gd.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Region;

@Mapper // --> @Repository public class XXX implements RegionMapper {...}
public interface RegionMapper {
	
	// 지역목록
	List<Region> selectRegionList(); 
	// 지역추가
	int insertRegion(Region region); 
	// 지역삭제
	int deleteRegion(int regionId); 
	// 지역수정
	int updateRegion(Region region); 
	
}
