package com.bacovjir.kube.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataDto {

	private long id;
	private String value;
}
