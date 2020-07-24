package com.boot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/frx")
@RefreshScope
public class FranceConfigController {

	@Value("${demo.api.key}")
	String demoApiKey;
	
	@Value("${database.name}")
	String databaseName;
	
	@RequestMapping("/home")
	public String getHomepage(Model model)
	{
		model.addAttribute("lableText", "Demo API Key");
		model.addAttribute("demoApiKey", demoApiKey);
		model.addAttribute("databaseName", databaseName);
		
		return "homepage";
	}
}
