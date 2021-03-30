package info.code2learn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${welcome.message}")
	private String message;
	
	@RequestMapping("/message")
	public ResponseEntity<String> message(String name) {
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
}