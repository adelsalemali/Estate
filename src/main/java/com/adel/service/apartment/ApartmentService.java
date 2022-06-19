package com.adel.service.apartment;

import java.util.List;

import com.adel.model.Apartment;

public interface ApartmentService {
	
	List<Apartment> loadAddAppartements(); 

     Apartment getApartment(int id);
     
     Apartment getUserID(int id);
     
     void saveAppartement(Apartment addAppartement); 
     
     void update(Apartment appartement);
     
     void deleteAppartement(int id); 
     
     public List<Apartment> getAppartementsByPages(int pageId , int total);
     
     public List<Apartment> orderData(String  name);
     
     public List<Apartment>  chooseYourType(String type);
}
