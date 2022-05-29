package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.samples.petclinic.model.Product;

public interface ProductService {
	
	List<Product> retrieveProducts(int cid);

}
