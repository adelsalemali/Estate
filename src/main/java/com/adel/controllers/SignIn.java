package com.adel.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.adel.model.SignUP;

@Controller
public class SignIn  {

	@GetMapping("/helloagain")
	public String signIn(SignUP signUP ) throws IOException
	{
		 return "signIn" ;
	}
}
