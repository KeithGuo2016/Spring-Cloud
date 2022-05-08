package com.avanade.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.web.model.ReceiveAddress;
import com.avanade.web.service.ReceiveAddressService;

@RestController
@RequestMapping("/addressService")
public class ReceiveAddressController {

	@Autowired
	private ReceiveAddressService receiveAddressService;
	
	@GetMapping("/getAllReceiveAddress")
	public List<ReceiveAddress> getAllReceiveAddress(){
		return receiveAddressService.findAllReceiveAddress();
	}
	
	@GetMapping("/getReceiveAddressById")
	public ReceiveAddress getReceiveAddressById(@RequestParam(value="id", required=true)Integer id){
		System.out.println("provider invoked succussfully........");
		return receiveAddressService.findById(id);
	}
	
}
