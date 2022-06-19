package com.adel.service.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adel.model.SignUP;
import com.adel.repo.signup.SignUpRepo;

@Service
public class SignUpImp  implements SignUp{

	@Autowired
	private SignUpRepo signUpRepo ;
	
	@Override
	public void insertClient(SignUP signUP) {

		signUpRepo.insertClient(signUP);
	}
}
