package com.adel.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.adel.model.Apartment;

public class AppartementRowMapper  implements RowMapper<Apartment>{

	@Override
	public Apartment mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Apartment addAppartement = new Apartment();
		addAppartement.setPostID(rs.getInt("postID"));
		addAppartement.setName(rs.getString("name"));
		addAppartement.setCantact(rs.getString("cantact"));
		addAppartement.setPropertyName(rs.getString("propertyName"));
		addAppartement.setPrice(rs.getInt("price"));
		addAppartement.setType(rs.getString("type"));
		addAppartement.setPropertyStatus(rs.getString("propertyStatus"));
		addAppartement.setBedRoom(rs.getInt("bedRoom"));
		addAppartement.setBathRoom(rs.getInt("bathRoom"));
		addAppartement.setCityName(rs.getString("cityName"));
		addAppartement.setItemImage(rs.getBytes("image"));
		addAppartement.setUserId(rs.getInt("userId"));
		
		return addAppartement;
	}

}
