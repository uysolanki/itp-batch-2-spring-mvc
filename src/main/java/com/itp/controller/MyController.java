package com.itp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itp.model.Student;

@Controller
public class MyController {
	
	@RequestMapping("/")
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
	
	@RequestMapping(value={"/hello","/index","/test"})
	public ModelAndView home2()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("virat");
		Student s1=new Student(104,"David",98.5);
		mav.addObject("student",s1);
		
		return mav;
	}

	@RequestMapping("/viratKohli")
	public String home3(ModelMap model)
	{
		//String name="Alice";
		Student s1=new Student(102,"Chris",88.5);
		model.addAttribute("student",s1);
		return "virat";
	}
	
	@RequestMapping("/addstudentform")
	public String addStudentForm(ModelMap model)
	{
		Student s1=new Student(7,"Dhoni",98.7);
		model.addAttribute("student",s1);
		return "add-student-form";
	}
	
	@RequestMapping("/saveStudentDetails")
	public String saveStudentDetails(@ModelAttribute Student s1,Model model)
	{
		model.addAttribute("student",s1);
		return "virat";
	}
}
