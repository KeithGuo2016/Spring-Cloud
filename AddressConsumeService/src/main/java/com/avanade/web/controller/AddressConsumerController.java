package com.avanade.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.avanade.web.model.ReceiveAddress;

@RestController
public class AddressConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/findReceiveAddressById/{id}")
	public ReceiveAddress findReceiveAddressById(@PathVariable Integer id) {

		List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("addressservice");
		ServiceInstance serviceInstance = serviceInstanceList.get(0);
		String host = serviceInstance.getHost();
		int port = serviceInstance.getPort();
		String url = "http://" + host + ":" + port + "/addressService/getReceiveAddressById?id=" + id;

		ReceiveAddress forObject = restTemplate.getForObject(url, ReceiveAddress.class);
		return forObject;
	}
}
