package com.princeli.demo.mvc.action;

import com.princeli.demo.mvc.service.IDemoService;
import com.princeli.spring.annotation.Autowried;
import com.princeli.spring.annotation.Controller;
import com.princeli.spring.annotation.RequestMapping;

@Controller
public class MyAction {

		@Autowried
		IDemoService demoService;
	
		@RequestMapping("/index.html")
		public void query(){

		}
	
}
