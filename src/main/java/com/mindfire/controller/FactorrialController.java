package com.mindfire.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindfire.service.FactorialService;

@RestController
public class FactorrialController {
	
	@Autowired
	private FactorialService factorialService;
	
	@RequestMapping
	(value = "/API/factorial", method = RequestMethod.GET)
	public ResponseEntity<Integer> getFactorialValue(@RequestHeader(value="username") String username, @RequestHeader(value="password") String password,@PathParam("number") String number) {	
		System.out.println("Value"+number);	
		System.out.println("value"+username);
		System.out.println("value"+password);
		Integer val=0;
		if(username.equals("Rajesh")&& password.equals("Rajesh")) {
		Integer numberOne = Integer.valueOf(number);
		 val = factorialService.getFactorialValue(numberOne);
		}
		return ResponseEntity.ok(val);
		
	}

}
