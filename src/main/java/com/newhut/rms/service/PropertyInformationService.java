package com.newhut.rms.service;

import java.util.List;

import com.newhut.rms.entity.PropertyInformation;

public interface PropertyInformationService {

	List<PropertyInformation> getAllPropertyInformation();

	PropertyInformation savePropertyInformation(PropertyInformation propertyInformation);

	PropertyInformation getPropertyInformationById(Long id);

	PropertyInformation updatePropertyInformation(PropertyInformation propertyInformation);

	void deletePropertyInformationById(Long id);
}