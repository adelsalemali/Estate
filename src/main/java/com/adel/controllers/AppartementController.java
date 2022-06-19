package com.adel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adel.model.Apartment;
import com.adel.service.apartment.ApartmentService;

@Controller
public class AppartementController {

	@Autowired
	private ApartmentService service ;
	

	// Here we can fetch data from DataBase to list.
	@GetMapping("/listAddAppartements/{pageid}")
	public String loadApartmentsToList(@PathVariable int pageid , Model model ) {
		
		int total = 5 ;
		if(pageid == 1) {}
		else
		{
			pageid = (pageid-1) * total + 1;
		}
		
		System.out.println(pageid);
		List<Apartment> list = service.getAppartementsByPages(pageid, total);
		model.addAttribute("addAppartement", list);
		
		return "listAddApartments";
	}
	
	//TODO Sorting Data 
	@GetMapping("/orderData/{order}")
	public String orderData(@PathVariable String order , Model model) 
	{
		
		model.addAttribute("addAppartement", service.orderData(order));
		return "listAddApartments" ; 
	} 
	
	//If user wants to see a specific type of apartments
	@GetMapping("/chooseYourType/{type}")
	public String chooseYourType(@PathVariable String type , Model model)
	{
		model.addAttribute("addAppartement", service.chooseYourType(type));
		return "listAddApartments";
	}

	// Here we can see Details of every flat/apartment in(details.jsp)
	@GetMapping("/showDetails")
	public String getInfo(@RequestParam("userId") int id, Model model) {

		// We should give the user object who clicked on the update button.
		model.addAttribute("details", service.getApartment(id));

		return "details";// Once the data is fetched,sending the data to view.
	}

	// Show me form of save-appartement 
	@GetMapping("/showNewAppartementPage")
	public String showNewAppartementPage(@RequestParam("userId") int id, Model model) {

		//We should give the user object who clicked on the update button.
		model.addAttribute("showData", service.getUserID(id));

		return "addApartments";

	}
	
	// Add a new appartement to list
	@PostMapping("/save-appartement")
	public String saveAppartement(@Valid @ModelAttribute("showData") Apartment appartement , BindingResult result) {
				
		if(result.hasErrors())
		{
			List<ObjectError> allErrors =  result.getAllErrors();
			
			allErrors.forEach((n)->System.out.println(n));
			 
			return "addApartments" ; 
		}
		
		// Do a clientDAO call to saveAppartement		
		service.saveAppartement(appartement);

		return "redirect:/noon.com/listAddAppartements/1";
}

	@GetMapping("/updateAppartement")
	public String update(@RequestParam("userId") int id, Model model) {

		// We should give the user object who clicked on the update button.

		Apartment updateAppartement = service.getApartment(id);
		System.out.println("Update Student :" + updateAppartement);
		model.addAttribute("showData", updateAppartement);
		
		return "addApartments";
	}

	// delete Apartment
	@GetMapping("/deleteAppartement")
	public String delete(@RequestParam("userId") int id) {

		// capture the id of the student who you are trying to delete.
		// Once captured the id do Service call to delete the student.
		service.deleteAppartement(id);
		return "redirect:/noon.com/listAddAppartements/1";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}