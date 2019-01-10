package com.luv2code.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	@RequestMapping("/")
 public String showpage() {
	 return"Main-menu";
 }
}
