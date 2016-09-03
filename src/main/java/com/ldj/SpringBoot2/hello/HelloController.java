package com.ldj.SpringBoot2.hello;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
	@RequestMapping("/admin")
    public String admin(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
	
	@RequestMapping("/modal")
    public String modal(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "modal";
    }
	@RequestMapping("/varWidth")
	public String varWidth(Model model, @RequestParam HashMap<String, Object> params){
		System.out.println(params.toString());
		
		return "varWidth";
	}
}
