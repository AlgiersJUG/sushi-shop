package org.jug.algeria.sushi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SushiController  {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sayHello(){
		return "Hello There !";
	}
}