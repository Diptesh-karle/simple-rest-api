package com.example.simplerestapis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplerestapis.models.SampleResponse;

@RestController
public class WebController {

	@RequestMapping("/sample")
	public SampleResponse sample(@RequestParam(value="name",defaultValue = "Robot") String name) {
		
		SampleResponse sampleResponse = new SampleResponse();
		sampleResponse.setId(1);
		sampleResponse.setMessage("your name is "+name);
		return sampleResponse;
	}
	
	
	
} // end of class
