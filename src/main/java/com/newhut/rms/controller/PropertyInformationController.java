package com.newhut.rms.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.newhut.rms.entity.PropertyInformation;
import com.newhut.rms.service.PropertyInformationService;

@Controller
public class PropertyInformationController {

	// 1: Implement list of student feature

	@Autowired
	private PropertyInformationService propertyInformationService;

	// design pattern - dependency injection
	PropertyInformation pi = new PropertyInformation();

	// handler method to handle list PropertyInformation and return model and view
	@GetMapping("/propertyInformation")
	public String listPropertyInformation(Model model) {
		model.addAttribute("propertyInformation", propertyInformationService.getAllPropertyInformation());
		return "propertyInformation";
	}

	@GetMapping("/propertyInformation/new")
	public String createPropertyInformationForm(Model model) {

		// create PropertyInformation object to hold propertyInformation form data
		PropertyInformation propertyInformation = new PropertyInformation();
		model.addAttribute("propertyInformation", propertyInformation);
		return "create_propertyInformation";

	}

	@PostMapping("/propertyInformation")
	public String savePropertyInformation(
			@ModelAttribute("propertyInformation") PropertyInformation propertyInformation) {

		propertyInformationService.savePropertyInformation(propertyInformation);
		return "redirect:/propertyInformation"; // once dah save propertyInformation, redirect to PropertyInformation
												// page (method handler line 22)
	}

	@GetMapping("/propertyInformation/edit/{id}")
	public String editPropertyInformationForm(@PathVariable Long id, Model model) {
		model.addAttribute("propertyInformation", propertyInformationService.getPropertyInformationById(id));
		return "edit_propertyInformation";
	}

	@PostMapping("/propertyInformation/{id}")
	public String updatePropertyInformation(@PathVariable Long id,
			@ModelAttribute("propertyInformation") PropertyInformation propertyInformation, Model model) {

		// get propertyInformation from database by id
		PropertyInformation existingPropertyInformation = propertyInformationService.getPropertyInformationById(id);
		existingPropertyInformation.setId(id);
		existingPropertyInformation.setPropertyName(propertyInformation.getPropertyName());
		existingPropertyInformation.setPropertyType(propertyInformation.getPropertyType());
		existingPropertyInformation.setAddress(propertyInformation.getAddress());
		existingPropertyInformation.setMonthlyMortgage(propertyInformation.getMonthlyMortgage());
		existingPropertyInformation.setPaymentDayOfMonth(propertyInformation.getPaymentDayOfMonth());
		existingPropertyInformation.setPropertyBankName(propertyInformation.getPropertyBankName());
		existingPropertyInformation.setPropertyBankAccountNo(propertyInformation.getPropertyBankAccountNo());
		existingPropertyInformation.setMortgageOfficer(propertyInformation.getMortgageOfficer());
		existingPropertyInformation.setMrttTenureYear(propertyInformation.getMrttTenureYear());
		existingPropertyInformation.setEditedBy(propertyInformation.getCreatedBy());
		existingPropertyInformation.setEditedDate(new Date());

		// save updated propertyInformation object
		propertyInformationService.updatePropertyInformation(existingPropertyInformation);
		return "redirect:/propertyInformation";
	}

	// handler method to handle delete propertyInformation request
	@GetMapping("/propertyInformation/{id}")
	public String deletePropertyInformation(@PathVariable Long id) {
		propertyInformationService.deletePropertyInformationById(id);
		return "redirect:/propertyInformation";
	}
}
