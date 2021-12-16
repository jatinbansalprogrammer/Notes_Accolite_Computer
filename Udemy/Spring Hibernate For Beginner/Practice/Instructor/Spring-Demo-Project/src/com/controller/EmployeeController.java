package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.EmployeeFormObject;

@Controller
public class EmployeeController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/employeeForm")
	public String getEmployeeForm(Model model) {
		//model.addAttribute("employee", new EmployeeFormObject());
		model.addAttribute("employee", new EmployeeFormObject());
		model.addAttribute("theCountryOptions", countryOptions);
		return "employeeForm";
	}
	@RequestMapping("/processEmployee")
	public String processEmployeeForm(@ModelAttribute("employee") EmployeeFormObject employeeFormObject) {
		employeeFormObject.setName("Jatin");
		return "employeeForm";
	}
	
}
