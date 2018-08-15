package com.princeli.demo.mvc.service.impl;


import com.princeli.demo.mvc.service.IDemoService;
import com.princeli.spring.annotation.Service;

@Service
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name;
	}

}
