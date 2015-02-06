package org.jug.algeria.sushi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SushiController  {

	@RequestMapping(value="/hello", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello(){
		return "Hello There !";
	}
}