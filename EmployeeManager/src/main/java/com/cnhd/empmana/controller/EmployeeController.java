package com.cnhd.empmana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cnhd.empmana.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	String viewHomePage(Model model) {
		model.addAttribute("empList", employeeService.getAllEmployees());
		return "index";
	}
}
