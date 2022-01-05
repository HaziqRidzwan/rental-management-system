package com.newhut.rms.service;

import java.util.List;

import com.newhut.rms.entity.PropertyInformation;

public interface PropertyInformationService { // abstract - dia tak complete, sebab dalam method asal dia takde body

	List<PropertyInformation> getAllPropertyInformation();

	PropertyInformation savePropertyInformation(PropertyInformation propertyInformation);

	PropertyInformation getPropertyInformationById(Long id);

	// Haziq
	PropertyInformation updatePropertyInformation(PropertyInformation propertyInformation);

	// Nisa
	void deletePropertyInformationById(Long id);
}