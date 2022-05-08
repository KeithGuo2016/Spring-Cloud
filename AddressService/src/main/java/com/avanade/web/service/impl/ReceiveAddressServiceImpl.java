package com.avanade.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.avanade.web.model.ReceiveAddress;
import com.avanade.web.service.ReceiveAddressService;


@Service("receiveAddressService")
public class ReceiveAddressServiceImpl implements ReceiveAddressService {

	@Override
	public ReceiveAddress findById(Integer id) {
		return new ReceiveAddress(100,"test1","13100000000","changning district");
	}
	
	@Override
	public List<ReceiveAddress> findAllReceiveAddress() {
		List<ReceiveAddress> addressList = new ArrayList<>();
		ReceiveAddress address = new ReceiveAddress(200,"test2","13200000000","changning district");
		addressList.add(address);
		return addressList;
	}
	
}
