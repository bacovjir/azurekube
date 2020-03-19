package com.bacovjir.kube;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String hello() {
		return new Date().toString();
	}
	
	@GetMapping("/readinesprobe")
	public String readinesprobe() {
		return "I`am ready";
	}
	
	@GetMapping("/version")
	public String version() {
		return "v02";
	}
	
	Map<String, String> data = new HashMap<String, String>();

	@GetMapping("/data")
	public List<String> listData() {
		return new ArrayList(data.values());
	}

	@PostMapping("/data")
	public String createData(@RequestBody String value) {
		return data.put(UUID.randomUUID().toString(), value);
	}

	@GetMapping("/data/{id}")
	public String getData(@PathVariable("id") String key) {
		return data.get(key);
	}
	@GetMapping("/")
	public String index() {
		return "kube";
	}

}
