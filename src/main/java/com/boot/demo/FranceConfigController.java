package com.boot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/frx")
public class FranceConfigController {
	
	@RequestMapping("/home")
	public String getHomepage(Model model)
	{
		model.addAttribute("lableText", "Demo API Key");
		
		return "homepage";
	}
}
