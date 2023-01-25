package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.DtoLayer.DTO;

@Component
public class ClientController {

	public DTO getOneLead(long id) {
		RestTemplate rest=new RestTemplate();
		DTO lead = rest.getForObject("http://localhost:8080/apis/get/"+id, DTO.class);
		return lead;
	}
}
