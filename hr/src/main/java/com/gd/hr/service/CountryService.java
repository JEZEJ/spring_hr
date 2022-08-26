package com.gd.hr.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gd.hr.mapper.CountryMapper;
import com.gd.hr.mapper.RegionMapper;
import com.gd.hr.vo.Country;
import com.gd.hr.vo.Region;

@Service
@Transactional // 예외처리
public class CountryService implements ICountryService{

	@Autowired private RegionMapper regionMapper;
	@Autowired private CountryMapper countryMapper; //interfacemapper가져오기

	// 나라 목록
	@Override
	public List<Map<String, Object>> getCountryList() { //controller에서 넘어옴

		System.out.println("디버깅// CountryService.getCountry 실행");

		return countryMapper.selectCountryList();
	}

	// 나라 추가에서 region_id값 빼오기
	@Override
	public List<Region> addCountryForm() { // 폼에다가 입력

		List<Region> regionList = regionMapper.selectRegionList();

		return regionList;
	}

	// 나라 추가
	@Override
	public int addCountryAction(Country country) {

		return countryMapper.insertCountry(country);
	}
	
	//수정 action
	@Override
	public int modifyCountry(Country country) {
		return countryMapper.updateCountry(country);
	}
	
	//수정 form
	@Override
	public Country getCountry(String countryId) {
		return countryMapper.selectCountryOne(countryId);
	}
		
	//삭제
	@Override
	public int removeCountry(String countryId) {
		return countryMapper.deleteCountry(countryId);
	}

	@Override
	public List<Country> getCountryIdAndNameList(int regionId) {
		System.out.println("CountryService : " + regionId);
		List<Country> list = countryMapper.selectCountryIdAndNameList(regionId);
		return list;
	}

}