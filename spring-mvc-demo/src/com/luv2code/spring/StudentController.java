package com.luv2code.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student")
public class StudentController {
	@RequestMapping("/showform")
	
	public String showform(Model themodel) {
		
		//Create a student object
		Student thestudent = new Student();
		
		//add Student object to the model
		
	themodel.addAttribute("student",thestudent);
		return "Student-form";
		
	}

	
public String processform(@ModelAttribute("student") Student thestudent) {
	
	System.out.println("thestudent:"+ thestudent.getFirstName()+ "" +thestudent.getFirstName());
	return "Confirmation";
	
}
}
