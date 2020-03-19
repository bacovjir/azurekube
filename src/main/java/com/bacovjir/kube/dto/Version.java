package com.bacovjir.kube.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Version {

	private String hostname;
	private String ip;
	private String version;
}
