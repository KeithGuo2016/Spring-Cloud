package com.avanade.web.service;

import java.util.List;

import com.avanade.web.model.ReceiveAddress;

public interface ReceiveAddressService {
	
	List<ReceiveAddress> findAllReceiveAddress();
	
	ReceiveAddress findById(Integer id);
	
}
