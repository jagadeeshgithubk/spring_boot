package com.jaggu.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jaggu.spring.models.Customer;
import com.jaggu.spring.service.TestSpringBootService;

@RestController
public class TestSpringBootRestController {

	@Autowired
	private TestSpringBootService bootService;
	
	@RequestMapping(method=RequestMethod.GET, path="/{pathVariable}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer getDetails(@PathVariable("pathVariable") String pathString){
		System.out.println("...........path values......."+pathString);
		return bootService.getDetails();
	}
	
}
