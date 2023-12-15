package com.mymeal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mymeal.services.MealListServiceImpl;

@Controller
public class MealListController {
	private MealListServiceImpl meallistservicimpl;

	@Autowired
	public MealListController(MealListServiceImpl meallistservicimpl) {
		this.meallistservicimpl = meallistservicimpl;
	}

	@GetMapping("/menuList/listofitems")
	public String menuList(Model model) {
		model.addAttribute("menulist", meallistservicimpl.getMenuItems());
		return "start";
	}
}
