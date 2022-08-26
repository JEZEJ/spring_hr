package com.gd.hr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gd.hr.service.ILocationService;
import com.gd.hr.service.IRegionService;
import com.gd.hr.vo.Location;

@Controller
public class LocationController {

	@Autowired ILocationService locationService;

	// location목록뽑기
	@GetMapping("/locationList")
	public String locationList(Model model) {

		List<Map<String,Object>> list = locationService.getLocationList();
		
		model.addAttribute("list",list);
		
		return "locationList";
	}
	
	@GetMapping("/addLocation")
	public String addLocation(Model model) {
		Map<String, Object> map = locationService.addLocationForm();
		model.addAttribute("regionList", map.get("regionList"));
		
		return "addLocation";
	}

}
