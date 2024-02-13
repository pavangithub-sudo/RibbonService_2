package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonService2Controller {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/pay/{price}")
	public String invokePrice(@PathVariable Integer price) {
		return restTemplate.getForObject("http://RIBBON-SERVICE/pay/" +price, String.class);
	}

}
