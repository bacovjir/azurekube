package com.bacovjir.kube.integration;

import java.util.List;

import com.bacovjir.kube.dto.DataDto;

public interface DataService {

	List<DataDto> findData();

	String ping(String hostname);

}
