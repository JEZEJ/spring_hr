package com.gd.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gd.hr.service.IRegionService;
import com.gd.hr.vo.Region;

@Controller
public class RegionController { // controller - service - mapper

	@Autowired
	IRegionService regionService; // <-- new 인터페이스의 자식인 regionService가 주입

	// 대륙관리 action이 없기때문에 GetMapper만줘도됨
	@GetMapping("/regionList") // return type이 String이면 view리턴 -- ModelAndView는 모델과 뷰 리턴
	public String regionList(Model model) { //list기때문에 model로 파라미터 받아주기

		List<Region> list = regionService.getRegionList(); //service에서 쿼리 실행시켜서 나온값을 list에 저장해줌
		model.addAttribute("list", list); // model안에 넣어주기 request.setAttribute("list",list);

		// 디버깅
		System.out.println(list);
		return "regionList"; // ("regionList").forward(request, response);
		// regionList redirect
	}
	//Form
	@GetMapping("/addRegion") // 톰캣이 오류나면 맵핑이 중복됬는지 확인해줘야함
	public String addRegion() {
		return "addRegion";
	}

	@PostMapping("/addRegion") // Action
	public String addRegion(Region region) { // vo객체 넣어줌
		// @RequestParam(value = "regionId", defaultValue = "1") int regionId)
		// int regionId = requset.getParameter("regionId") - int라서
		// Integer.parseInt형변환해줘야하는데 Spring은 알아서 해줌
		System.out.println(region);

		int row = regionService.addRegion(region);
		System.out.println(row);

		return "redirect:/regionList";
	} // 여기까지 실행되면 컨트롤러로 돌아오고 redirect해주기

	@GetMapping("/removeRegion")
	public String removeRegion(@RequestParam(value = "regionId") int regionId) {
		
		int row = regionService.removeRegion(regionId);
		System.out.println(row);

		return "redirect:/regionList";
	}
	
	//Form
	@GetMapping("/modifyRegion")
	public String modifyRegion(Model model, Region region ) {
		model.addAttribute("list",region );
		return "modifyRegion"; // forward
	}
	
	@PostMapping("/modifyRegion")
	public String modifyRegion(Region region) {
		
		int row = regionService.modifyRegion(region);
		System.out.print("row : " + row); //row가 0이면 실패
		
		return "redirect:/regionList";
	}
}
