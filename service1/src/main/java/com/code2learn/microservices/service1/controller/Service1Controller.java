package com.code2learn.microservices.service1.controller;

import org.springframework.http.ResponseEntity;

public interface Service1Controller {
	ResponseEntity<String> service1(String name);
}
