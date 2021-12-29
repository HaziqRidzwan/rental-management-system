package com.newhut.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newhut.rms.entity.PropertyInformation;

//JpaRepository has 2 parameters; 1	. Type of JPA entity - PropertyInformation, 2. Type of primary key - ID

public interface PropertyInformationRepository extends JpaRepository<PropertyInformation, Long> {

}
