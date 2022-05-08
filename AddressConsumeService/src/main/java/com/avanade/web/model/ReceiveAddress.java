package com.avanade.web.model;

import java.io.Serializable;
import java.sql.Timestamp;


public class ReceiveAddress implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String connectName;
	private String phone;
	private String address;
	private Timestamp createTime;
	private String createAuthor;
	private Timestamp updateTime;
	private String updateAuthor;
	
	public ReceiveAddress() {
		super();
	}


	public ReceiveAddress(Integer id, String connectName, String phone, String address) {
		super();
		this.id = id;
		this.connectName = connectName;
		this.phone = phone;
		this.address = address;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getConnectName() {
		return connectName;
	}


	public void setConnectName(String connectName) {
		this.connectName = connectName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Timestamp getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}


	public String getCreateAuthor() {
		return createAuthor;
	}


	public void setCreateAuthor(String createAuthor) {
		this.createAuthor = createAuthor;
	}


	public Timestamp getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}


	public String getUpdateAuthor() {
		return updateAuthor;
	}


	public void setUpdateAuthor(String updateAuthor) {
		this.updateAuthor = updateAuthor;
	}

}
