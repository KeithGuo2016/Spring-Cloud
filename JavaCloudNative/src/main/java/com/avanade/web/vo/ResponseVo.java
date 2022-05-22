package com.avanade.web.vo;

public class ResponseVo<E> {

	private String message;
    private Integer status;
    private E data;
    
	public ResponseVo() {
		super();
	}

	public ResponseVo(String message, Integer status, E data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
    
	
}
