package com.zmx.jta.domain;

import java.io.Serializable;

public class Member implements Serializable{
	

	private static final long serialVersionUID = 1124758351852164488L;

	private Integer id;
	
	private String username;
	
	private String password;
	
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


	
	
	
	
	

}
