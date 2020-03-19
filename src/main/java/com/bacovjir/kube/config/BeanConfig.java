package com.bacovjir.kube.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@Bean
	public RestTemplate restTemplate() {


		RestTemplate restTemplate = restTemplateBuilder
				.rootUri("http://azurekubebackend:8080")
				//        		.errorHandler(responseErrorHandler())
				//				.interceptors(interceptors(connection))
				.build();
		return restTemplate;

	}
}
