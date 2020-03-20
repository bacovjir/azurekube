package com.bacovjir.kube.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.bacovjir.kube.dto.DataDto;

import lombok.extern.slf4j.Slf4j;

//https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html
@FeignClient(name = "azurekubebackend", url = "${feign.azurekubebackend.url}", fallback = DataRepositoryFallback.class)
public interface DataRepository {

	@GetMapping("/api/data")
	public List<DataDto> findData();
}

@Slf4j
@Component
class DataRepositoryFallback implements  DataRepository {

	@Override
	public List<DataDto> findData() {
		log.info("Returning default data");
		List<DataDto> datas = new ArrayList<>();
		datas.add(DataDto.builder().id(11111).value("SOME DEFATUL").build());
		return datas;
	}
	
}