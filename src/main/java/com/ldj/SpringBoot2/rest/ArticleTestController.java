package com.ldj.SpringBoot2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArticleTestController {
	
	@Autowired
	RestTemplateTest test;
	
	@RequestMapping(value="/rest/init", method=RequestMethod.GET)
	public String init(Model model){
		
		return "/html/init.html";
	}
	
	@RequestMapping(value="/rest/articles", method=RequestMethod.GET)
	public String index(Model model){
		String result = test.requestIndex();
		
		model.addAttribute("result", result);
		
		return "rest";
	}
	
	@RequestMapping(value="/rest/articleCreate", method=RequestMethod.GET)
	public String create(Model model){
		String result = test.requestCreate();
		
		model.addAttribute("result", result);
		
		return "rest";
	}
	
	
	@RequestMapping(value="/rest/articleDelete", method=RequestMethod.GET)
	public String destroy(Model model){
		String result = test.requestDelete();
		
		model.addAttribute("result", result);
		
		return "rest";
	}
	
	@RequestMapping(value="/rest/articlePut", method=RequestMethod.GET)
	public String update(Model model){
		String result = test.requestPut();
		
		model.addAttribute("result", result);
		
		return "rest";
	}
	
	
}
