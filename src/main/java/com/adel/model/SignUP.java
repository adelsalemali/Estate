package com.adel.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUP {
    
	@NotBlank(message = " * User name cant't be blank")
	@Size(min = 3 , max = 15 , message = "* Your name shoud have between 3-15 ")
	private String userName ;
	
	@NotBlank(message = " * Password can not be blank")
	@Size(min = 3 , max = 15 , message = "* Your Password shoud have between 3-15 ")
	private String userPassword ;
	
	@NotBlank(message = " * Your email shoud have @gmail.com")
	private String email ;
	
	private CommunicateDTO  communicateDTO ;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CommunicateDTO getCommunicateDTO() {
		return communicateDTO;
	}
	public void setCommunicateDTO(CommunicateDTO communicateDTO) {
		this.communicateDTO = communicateDTO;
	}
	@Override
	public String toString() {
		return "SignUP [userName=" + userName + ", userPassword=" + userPassword + ", email=" + email
				+ ", communicateDTO=" + communicateDTO + "]";
	}
}