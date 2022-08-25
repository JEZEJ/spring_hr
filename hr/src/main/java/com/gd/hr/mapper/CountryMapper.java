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

}
