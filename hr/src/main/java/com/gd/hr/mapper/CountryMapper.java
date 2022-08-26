package com.gd.hr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gd.hr.vo.Country;

@Mapper
public interface CountryMapper {

	// 나라목록
	List<Map<String,Object>> selectCountryList();

	// 나라입력
	int insertCountry(Country country);

	// 나라수정
	int updateCountry(Country country);
	
	// 나라삭제
	int deleteCountry(String countryId);
	
	// 수정하려면 폼이 있어야함
	Country selectCountryOne(String countryId);
	
	//
	List<Country> selectCountryIdAndNameList(int regionId); // 오버로딩

}