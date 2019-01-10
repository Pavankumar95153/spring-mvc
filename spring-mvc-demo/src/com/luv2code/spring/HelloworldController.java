package com.luv2code.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
@RequestMapping("/showform")
	public String showform() {
		return "helloworld-form";
		
	}

@RequestMapping("/processform")
public String processform() {
	return "Lastpage";
	
}
//@RequestMapping("/processformversion")
//public String processformversionthree(@Requestparam )




}
