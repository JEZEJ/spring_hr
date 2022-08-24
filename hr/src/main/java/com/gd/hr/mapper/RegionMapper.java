package com.gd.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Region;

@Mapper // --> @Repository public class XXX implements RegionMapper {...}
public interface RegionMapper {
	
	List<Region> selectRegionList(); //Select쿼리를 만들어줄거임
	int insertRegion(Region region);
	int deleteRegion(int regionId);
	int updateRegion(Region region);
}
