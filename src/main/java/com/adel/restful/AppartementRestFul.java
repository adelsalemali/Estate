package com.adel.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adel.model.Apartment;
import com.adel.repo.client.ClientRepo;
import com.adel.service.apartment.ApartmentService;

@RestController
public class AppartementRestFul {

	@Autowired
	private ApartmentService serviceImpl ;
	
	@Autowired
	private ClientRepo clientDAO;
	
	@RequestMapping("/getAllAppartements")
	public List<Apartment> getAllAppartements()
	{
		return serviceImpl.loadAddAppartements();
	}	
	
	@RequestMapping("/getAppartement/{id}")
	public Apartment getAppartement(@PathVariable int  id)
	{
		return serviceImpl.getUserID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/appartements") 
	public void addAppartement(@RequestBody Apartment appartement)
	{
		serviceImpl.saveAppartement(appartement);
	}
	
	@PostMapping("/appartement")
	public void saveAppartement(@RequestBody Apartment appartement)
	{
		 serviceImpl.saveAppartement(appartement);
	}
	
	@PutMapping("/appartement/{id}")
	public void updateAppartement(@RequestBody Apartment appartements , @PathVariable int id)
	{
		clientDAO.update2(appartements , id);
	}
	
	@DeleteMapping("appartement/{id}")
	public void deleteAppartement(@PathVariable int id ) 
	{
		serviceImpl.deleteAppartement(id);
	}
}