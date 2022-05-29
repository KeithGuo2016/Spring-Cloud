package org.springframework.samples.petclinic.model;

import java.io.Serializable;

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String img;
	
	public Product() {
		super();
	}

	public Product(String name, String img) {
		super();
		this.name = name;
		this.img = img;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}
	
	

}
