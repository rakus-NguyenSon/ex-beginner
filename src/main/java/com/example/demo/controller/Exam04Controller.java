package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	@Autowired
	private HttpSession session;

	@ModelAttribute
	public UserForm SetupForm() {
		return new UserForm();
	}

	@RequestMapping("")
	public String index(Model model) {
		return "exam04";
	}

	@RequestMapping("/register")
	public String register(@Validated UserForm form, BindingResult result, Model model) {

		if (result.hasErrors()) {
			System.out.println("Errors");
			return index(model);
		}

		User user = new User();
		user.setName(form.getName());
		user.setAge(form.getAge());
		user.setComment(form.getComment());
		session.setAttribute("user", user);
		return "redirect:/exam04/result";
	}

	@RequestMapping("/result")
	public String result() {
		return "exam04-result";
	}
}
