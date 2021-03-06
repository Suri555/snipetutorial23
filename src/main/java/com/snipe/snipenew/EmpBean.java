package com.snipe.snipenew;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpBean {

	@Id
	private String name;
	private String password;
	private String profile;
	private String message;

	public EmpBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	


}
