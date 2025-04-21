package com.itp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itp.model.Student;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		//String name="Alice";
		Student s1=new Student(101,"Ben",78.5);
		model.addAttribute("student",s1);
		return "virat";
	}
	
	@RequestMapping("/newhome")
	public String home1(ModelMap model)
	{
		//String name="Alice";
		Student s1=new Student(102,"Chris",88.5);
		model.addAttribute("student",s1);
		return "virat";
	}
	
	@RequestMapping("/test")
	public ModelAndView home2()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("virat");
		Student s1=new Student(104,"David",98.5);
		mav.addObject("student",s1);
		
		return mav;
	}

}
