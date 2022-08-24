package com.gd.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gd.hr.mapper.RegionMapper;
import com.gd.hr.vo.Region;

@Service
@Transactional // 오류가 발생하면 다 취소한다 exception
public class RegionService implements IRegionService{
	// DI : 객체를 직접 생성하지않고 프레임워크를 통해 (bean객체) 주입
	// Interface 타입을 사용
	@Autowired private RegionMapper regionMapper; // 쿼리가 있는 mapper을 받는다
	
	@Override
	public List<Region> getRegionList() {
		
		return regionMapper.selectRegionList();
	} //쿼리 실행

	@Override
	public int addRegion(Region region) {
		
		return regionMapper.insertRegion(region);
	}

	@Override
	public int removeRegion(int regionId) {
		// TODO Auto-generated method stub
		return regionMapper.deleteRegion(regionId);
	}

	@Override
	public int modifyRegion(Region region) {
		System.out.println("RegionService에 modifyRegion안에 regionId 값 : "+region);
		return regionMapper.updateRegion(region);
	}

}
