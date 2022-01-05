package com.newhut.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newhut.rms.entity.PropertyInformation;
import com.newhut.rms.repository.PropertyInformationRepository;
import com.newhut.rms.service.PropertyInformationService;

@Service
public class PropertyInformationServiceImpl implements PropertyInformationService {

	@Autowired
	private PropertyInformationRepository propertyInformationRepository;

	@Override
	public List<PropertyInformation> getAllPropertyInformation() {
		return propertyInformationRepository.findAll();
	}

	@Override
	public PropertyInformation savePropertyInformation(PropertyInformation propertyInformation) {
		return propertyInformationRepository.save(propertyInformation);

	}

	@Override
	public PropertyInformation getPropertyInformationById(Long id) {
		return propertyInformationRepository.findById(id).get();
	}

	@Override
	public PropertyInformation updatePropertyInformation(PropertyInformation propertyInformation) {
		return propertyInformationRepository.save(propertyInformation);
	}

	@Override
	public void deletePropertyInformationById(Long id) {
		propertyInformationRepository.deleteById(id);
	}

}
