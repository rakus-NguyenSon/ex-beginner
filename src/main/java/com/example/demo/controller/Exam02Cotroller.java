package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Cotroller {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("/submit")
	public String submit(Integer num1, Integer num2) {
		
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("res", num1 + num2);
		return "redirect:/exam02/page1";
	}

	@RequestMapping("/page1")
	public String page1() {
		return "exam02-result";
	}

	@RequestMapping("/page2")
	public String page2() {
		return "exam02-result2";
	}
}
