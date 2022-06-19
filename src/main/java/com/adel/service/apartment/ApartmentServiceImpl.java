package com.adel.service.apartment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adel.model.Apartment;
import com.adel.repo.client.ClientRepo;

@Service
public class ApartmentServiceImpl implements ApartmentService {
 
	@Autowired
	private ClientRepo clientRepo; 

	@Override
	public List<Apartment> loadAddAppartements() { 
		
		List<Apartment> loadAddAppartements = clientRepo.loadAddAppartements();

		return loadAddAppartements;
	}

	@Override
	public Apartment getApartment(int id) {

		return  clientRepo.getApartment(id) ;
	}

	@Override
	public Apartment getUserID(int id) {

		Apartment getUserID = clientRepo.getUserID(id);
		return getUserID;
	}

	@Override
	public void saveAppartement(Apartment addAppartement) 
	{
		
		// do a condition check
		// if the user doesn't have an id then do an insert
		// if the user does have id the do a update
		if (addAppartement.getPostID() == 0) 
		{
			clientRepo.saveAppartement(addAppartement);
		} else 
		{
			clientRepo.update(addAppartement);
		}
	}

	@Override
	public void update(Apartment appartement) {

		clientRepo.update(appartement);

	}

	@Override
	public void deleteAppartement(int id) {
		
	 clientRepo.deleteAppartement(id);
	}

	@Override
	public List<Apartment> getAppartementsByPages(int pageId, int total) {
		
		return clientRepo.getAppartementsByPages(pageId, total);
	}

	@Override
	public List<Apartment> orderData(String name) {
		
		List<Apartment> orderData = clientRepo.orderData(name);
		return orderData;
	}

	@Override
	 public List<Apartment>  chooseYourType(String type) {
		
		return  clientRepo.chooseYourType(type);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}