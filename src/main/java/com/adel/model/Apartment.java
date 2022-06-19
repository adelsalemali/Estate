package com.adel.model;

import java.util.Arrays;

import javax.validation.constraints.NotBlank;

import com.adel.validator.NoRoom;

public class Apartment {

	private int postID;

	@NotBlank(message = "* name must not be blank")
	private String name;

	private String cantact;

	@NotBlank(message = "* property name must not be blank")
	private String propertyName;

	
	private Integer price;
	
	@NotBlank(message = "* type must not be blank")
	private String type;

	@NotBlank(message = "* property status must not be blank")
	private String propertyStatus;

	@NoRoom(lower = 2 , upper = 3 , message = " * No Room should be between 1 - 5")
	private int bedRoom;

	@NoRoom(lower = 2 , upper = 3 , message = " * No Bath Room should be between 1 - 5")
	private int bathRoom;

	@NotBlank(message = "* city name must not be blank")
	private String cityName;

	private byte[] itemImage;

	private int userId;

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCantact() {
		return cantact;
	}

	public void setCantact(String cantact) {
		this.cantact = cantact;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

	public int getBedRoom() {
		return bedRoom;
	}

	public void setBedRoom(int bedRoom) {
		this.bedRoom = bedRoom;
	}

	public int getBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(int bathRoom) {
		this.bathRoom = bathRoom;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public byte[] getItemImage() {
		return itemImage;
	}

	public void setItemImage(byte[] itemImage) {
		this.itemImage = itemImage;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Appartement [postID=" + postID + ", name=" + name + ", cantact=" + cantact + ", propertyName="
				+ propertyName + ", price=" + price + ", type=" + type + ", propertyStatus=" + propertyStatus
				+ ", bedRoom=" + bedRoom + ", bathRoom=" + bathRoom + ", cityName=" + cityName + ", itemImage="
				+ Arrays.toString(itemImage) + ", userId=" + userId + "]";
	}
}
