package com.bacovjir.kube.integration;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bacovjir.kube.dto.DataDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<DataDto> findData() {
		DataDto[] datas = restTemplate.getForObject("http://azurekube", DataDto[].class);
		return Arrays.asList(datas);
	}

	@Override
	public String ping(String hostname) {
//		try {
//	        InetAddress inet = InetAddress.getByName(hostname);
//	        boolean status = inet.isReachable(5000);
//	        if (status) {
//	        	log.info(inet.getHostName() + " Host Reached\t" + inet.getHostAddress());
//	        	return "Reachable";
//	        } else {
//	        	log.info(inet.getHostName() + " Host Unreachable");
//	            return "Unreachable";
//	        }
//
//	    } catch (UnknownHostException e) {
//	        log.error(e.getMessage() + " Can't Reach Host");
//	        return e.getMessage() + " Can't Reach Host";
//	    } catch (IOException e) {
//	    	log.error(e.getMessage() + " Error in reaching the Host");
//	        return e.getMessage() + " Error in reaching the Host";
//	    }
		
		
		DataDto[] datas = restTemplate.getForObject(hostname+"/api/data", DataDto[].class);
		return "length = " + datas.length;
	}
}
