package com.gd.hr.service;

import java.util.List;
import java.util.Map;

import com.gd.hr.vo.Country;
import com.gd.hr.vo.Region;

public interface ICountryService {

	// 나라목록
	List<Map<String,Object>> getCountryList(); //mapper랑 다른이름으로 주기

	// 나라추가 (region빼주기)
	List<Region> addCountryForm();

	// 나라추가
	int addCountryAction(Country country);

	//수정 action
	int modifyCountry(Country country);
	
	//수정 form
	Country getCountry(String countryId);
		
	//삭제
	int removeCountry(String countryId);
	
	List<Country> getCountryIdAndNameList(int regionId);

}