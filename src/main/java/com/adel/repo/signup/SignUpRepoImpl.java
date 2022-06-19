package com.adel.repo.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.adel.model.SignUP;

@Repository
public class SignUpRepoImpl  implements SignUpRepo{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertClient(SignUP signUP) {

		// write the logic to store the client object into the dataBase
		Object[] sqlParameters = { signUP.getUserName(), signUP.getCommunicateDTO().getPhone().toString(), signUP.getEmail(),
				signUP.getUserPassword() };

		String sql = "insert into users (name , phone , email , pass) values (?,?,?,?)";
		jdbcTemplate.update(sql, sqlParameters);
	}
}
