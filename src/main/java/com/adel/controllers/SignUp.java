package com.adel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adel.model.SignUP;
import com.adel.repo.signup.SignUpRepo;

@Controller
public class SignUp {

	@Autowired
	private  SignUpRepo signUpRepo;
	
	@RequestMapping("/")
	public String showRrgister(SignUP signUP, Model model) {
		System.out.println("insde showRrgister method");
		model.addAttribute("register", signUP);
		signUP.setUserName("Ahmed");

		return "signUp";
	}

	@RequestMapping("/registrationDone")
	public String rgisterDone(@Valid @ModelAttribute("register") SignUP signUP , BindingResult result) {

		if(result.hasErrors())
		{
			List<ObjectError> allErrors =  result.getAllErrors();
			
			allErrors.forEach((n)->System.out.println(n));
			 
			return "signUp" ; 
		}
		
		System.out.println("Inside the registrationDone....");

		System.out.println("User_name: " + signUP.getUserName());
		System.out.println("Phone: " + signUP.getCommunicateDTO().getPhone());
		System.out.println("Email: " + signUP.getEmail());
		System.out.println("User_password()**********" + signUP.getUserPassword());
		signUpRepo.insertClient(signUP);
		return "registrationDone";
	}
	
	//Extract these data from the URL and save these data to DB
	@ResponseBody
	@RequestMapping("/save-client")
	public String saveClient(SignUP signUP) {
		
		return "save...";
	}
}
