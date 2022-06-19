package com.adel.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.adel.model.Apartment;

public class AppartementRowMapperGetUserId implements RowMapper<Apartment>{

	@Override
	public Apartment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Apartment addAppartement = new Apartment();
		
		addAppartement.setUserId(rs.getInt("userId"));

		return addAppartement;
	}

}
