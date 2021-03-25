package com.code2learn.microservices.service1.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code2learn.microservices.service1.controller.Service1Controller;

@RestController
public class Service1ControllerImpl implements Service1Controller {

	@Override
	@GetMapping(value = {"/service1"})
	public ResponseEntity<String> service1(String name) {
		return new ResponseEntity<String>("Welcome to service1.", HttpStatus.OK);
	}

}
