package com.adel.repo.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.adel.model.Apartment;
import com.adel.model.SignUP;
import com.adel.rowMapper.AppartementRowMapper;
import com.adel.rowMapper.AppartementRowMapperGetUserId;

@Repository
public class ClientRepoImpl implements ClientRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Apartment> loadAddAppartements() {
		// Here we will get all apartments from database 

		String sql = "select * from postapa";
		List<Apartment> theListOfAppartement = jdbcTemplate.query(sql, new AppartementRowMapper());
		return theListOfAppartement;
	}

	@Override
	public Apartment getApartment(int id) {

		String sql = "SELECT * FROM postapa WHERE postid = ?";
		Apartment getInfo = jdbcTemplate.queryForObject(sql, new AppartementRowMapper(), id);
		return getInfo;
	}

	@Override
	public Apartment getUserID(int id) {

		String sql = "SELECT userid FROM postapa WHERE postID = ?";
		Apartment getUserID = jdbcTemplate.queryForObject(sql, new AppartementRowMapperGetUserId(), id);
		return getUserID;
	}

	@Override
	public void saveAppartement(Apartment add) {

		String sql = "insert into postapa" + "(name, cantact, propertyName, price, type,propertyStatus, "
				   + "bedRoom, bathRoom,cityName, image ,userId) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		
		Object[] sqlParameters = { add.getName(), add.getCantact(), add.getPropertyName(), add.getPrice(),
				add.getType(), add.getPropertyStatus(), add.getBedRoom(), add.getBathRoom(), add.getCityName(),
				add.getItemImage(), add.getUserId() };

		jdbcTemplate.update(sql, sqlParameters);
	}

	@Override
	public void update(Apartment app) {

		String sql = "update postapa set name = ? , cantact = ? , propertyName = ? , price = ? , type = ? ,"
				+ "propertyStatus = ?, bedRoom  = ?, bathRoom  = ? , cityName  = ?, image  = ? , userId  = ? where postID = ?";// 12

		jdbcTemplate.update(sql, app.getName(), app.getCantact(), app.getPropertyName(), app.getPrice(), app.getType(),
				app.getPropertyStatus(), app.getBedRoom(), app.getBathRoom(), app.getCityName(), app.getItemImage(),
				app.getUserId(), app.getPostID());

		System.out.println("one record updated..");

	}

	//This update for RestAPI and that is why I create another updation because I need an id to update by RestAPI
	@Override
	public int update2(Apartment app, int id) {

		String sql = "update postapa set name = ? , cantact = ? , propertyName = ? , price = ? , type = ? ,"
				+ "propertyStatus = ?, bedRoom  = ?, bathRoom  = ? , cityName  = ?, image  = ? , userId  = ? "
				+ "where postID = ?";
		
		Object[] sqlParameters ={ app.getName(), app.getCantact(), app.getPropertyName(), app.getPrice(), app.getType(),
				app.getPropertyStatus(), app.getBedRoom(), app.getBathRoom(), app.getCityName(),
				app.getItemImage(), app.getUserId(), id };
		
		return jdbcTemplate.update(sql , sqlParameters);
	}

	@Override
	public void deleteAppartement(int id) {

		String sql = "DELETE FROM postapa where postID = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("One record deleted");
	}

	public List<Apartment> getAppartementsByPages(int pageId, int total) {
		String sql = "select * from postapa limit " + (pageId - 1) + "," + total;

		List<Apartment> getAppartementsByPages = jdbcTemplate.query(sql, new AppartementRowMapper());
		return getAppartementsByPages;
	}

	@Override
	public List<Apartment> orderData(String name) {

		String sql = "SELECT * FROM postapa ORDER BY " + name;

		List<Apartment> orderData = jdbcTemplate.query(sql, new AppartementRowMapper());

		return orderData;
	}

	@Override
	public List<Apartment> chooseYourType(String type) {

		String sql = "SELECT * FROM postapa WHERE type = '" + type + "';";
		List<Apartment> query = jdbcTemplate.query(sql, new AppartementRowMapper());

		return query;
	}
}