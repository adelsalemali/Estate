package com.adel.repo.client;

import java.util.List;

import com.adel.model.Apartment;

public interface ClientRepo {
	
	List<Apartment> loadAddAppartements();

     Apartment getApartment(int id);
     
     Apartment getUserID(int id);
     
     void saveAppartement(Apartment addAppartement);
     
     void update(Apartment appartement);
     
     int update2(Apartment appartement , int id);
     
     void deleteAppartement(int id); 
     
     public List<Apartment> getAppartementsByPages(int pageId , int total);
     
     public List<Apartment> orderData(String  name);
     
     List<Apartment> chooseYourType(String type);

     
}