package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length=50)
	private String userId;
	
	@Column(nullable = false)
	private String userName;
	
	@Column(nullable = false)
	private String userPassword;
	
	@Column(nullable = false)
	private String userEmail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public void update(User newUser) {
		this.userPassword = newUser.userPassword;
		this.userName = newUser.userName;
		this.userEmail = newUser.userEmail;		
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + "]";
	}

		

}
