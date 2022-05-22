package com.avanade.web.service;

import java.util.List;

import com.avanade.web.entity.Product;

public interface ProductService {
	
	List<Product> retrieveProducts(int cid);

}
