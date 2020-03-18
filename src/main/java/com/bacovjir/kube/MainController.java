package com.bacovjir.kube;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String hello() {
		return new Date().toString();
	}
	
	@GetMapping("/")
	public String index() {
		return "kube";
	}
}
