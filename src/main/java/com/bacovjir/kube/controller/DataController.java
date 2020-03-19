package com.bacovjir.kube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacovjir.kube.dto.DataDto;
import com.bacovjir.kube.integration.DataService;
import com.bacovjir.kube.repository.DataRepository;

@RestController
public class DataController {

	@Autowired
	private DataService dataService;
	@Autowired
	private DataRepository dataRepository;

	@GetMapping("/api/data")
	public List<DataDto> findData(){
		return dataService.findData();
	}
	
	@GetMapping("/api/v2/data")
	public List<DataDto> findDataV2(){
		return dataRepository.findData();
	}
}
