package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Entity.Student;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/studentForm")
	public ModelAndView helloWorld() {
		ModelAndView mav=new ModelAndView("studentForm");
		Student student = new Student();
		student.setAge(100);
		student.setName("Ajay");
		mav.addObject("student", student);
		return mav;
	}

}
