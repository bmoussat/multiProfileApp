package com.app.profiles.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.profiles.service.AppService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ApplicationController {
	@Autowired
	private AppService service;

	@GetMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("items", service.getItems());
		return "home";
	}

}
