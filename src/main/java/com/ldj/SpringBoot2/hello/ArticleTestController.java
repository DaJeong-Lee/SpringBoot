package com.ldj.SpringBoot2.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ldj.SpringBoot2.rest.RestTemplateTest;

@Controller
public class ArticleTestController {
	
	@Autowired
	RestTemplateTest test;
	
	@RequestMapping(value="/rest/articles", method=RequestMethod.GET)
	public String index(Model model){
		test.requestIndex();
		
		return "rest";
	}
}
