package com.gd.hr.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gd.hr.service.ICountryService;
import com.gd.hr.service.IRegionService;
import com.gd.hr.vo.Country;
import com.gd.hr.vo.Region;

@Controller
public class CountryController {

	@Autowired ICountryService countryService; // 서비스
	@Autowired IRegionService regionService; // add에서 region을 가져올거기때문에

	// 나라목록
	@GetMapping("/countryList")
	public String countryList(Model model) { // join된 쿼리

		System.out.println("디버깅// CountryController 실행");

		List<Map<String, Object>> countryList = countryService.getCountryList();

		model.addAttribute("countryList", countryList);
		System.out.println("디버깅// CountryController countryList 값 : " + countryList);

		return "countryList";
	}
	
	// 나라추가 Form - region_id값 꺼내오기
	@GetMapping("/addCountry")
	public String addCountry(Model model) {
		List<Region> regionList = countryService.addCountryForm();

		model.addAttribute("regionList", regionList);
		return "addCountry"; // <select><c:foreach var="region" items="${regionList}">

	}
	
	// 나라추가 Action
	@PostMapping("/addCountry")
	public String addCountry(Country country) {
		
		System.out.println(country);
		int row = countryService.addCountryAction(country);
		System.out.println("row : " + row);
		
		
		return "redirect:/countryList";
	}
	
	// 나라수정 Form 값을 빼오려면 model로 주기
	@GetMapping("/modifyCountry")
	public String modifyCountry(Model model,Country country) {
		model.addAttribute("list",country);
		return "modifyCountry";
	}
	
	// 나라수정 Action
	@PostMapping("/modifyCountry")
	public String modifyCountry(Country country) {
		
		int row = countryService.addCountryAction(country);
		System.out.println("row : " + row);

		return "redirect:/countryList";
	}

}
