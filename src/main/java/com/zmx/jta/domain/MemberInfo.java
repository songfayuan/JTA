package com.zmx.jta.domain;

import java.io.Serializable;

public class MemberInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4417854974685660715L;

	private Integer id;
	
	private String nickname;
	
	private String realname;
	
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
