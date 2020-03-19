package com.bacovjir.kube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacovjir.kube.dto.DataDto;
import com.bacovjir.kube.integration.DataService;

@RestController
public class DataController {

	@Autowired
	private DataService dataRepository;

	@GetMapping("/api/data")
	public List<DataDto> findData(){
		return dataRepository.findData();
	}
}
