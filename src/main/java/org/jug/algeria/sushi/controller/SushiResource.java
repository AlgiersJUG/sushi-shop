package org.jug.algeria.sushi.controller;

import org.jug.algeria.sushi.domain.Sushi;
import org.jug.algeria.sushi.repository.SushiRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * please consider this <a href="https://github.com/spring-projects/spring-boot/issues/1929">using @Repository with a Mongo configuration</a>
 */
@RestController
@RequestMapping(value = "/api/sushi", produces = MediaType.APPLICATION_JSON_VALUE)
public class SushiResource {

    @Inject
    SushiRepository sushiRepository;

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(){
		return "Hello There !";
	}


    @RequestMapping(value = "/{name}", method = RequestMethod.POST)
    public Sushi createSushi(@PathVariable String name){
        final Sushi savedSushi = sushiRepository.save(new Sushi(name));
        return savedSushi;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Sushi> findAllSushi(){
        return sushiRepository.findAll();
    }

}