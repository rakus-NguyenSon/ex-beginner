package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/buy")
	public String buyOnClicked(Integer item1, Integer item2, Integer item3, Model model) {
		Integer totalPrice = item1 + item2 + item3;
		model.addAttribute("notaxPrice", totalPrice);
		Integer taxIncludedPrice = (int) (totalPrice*1.1);
		model.addAttribute("taxIncludedPrice", taxIncludedPrice);
		return "exam03-result";
	}
}
