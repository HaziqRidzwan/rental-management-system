package com.newhut.rms;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.newhut.rms.entity.PropertyInformation;
import com.newhut.rms.repository.PropertyInformationRepository;

/* Video Title: Spring Boot Thymeleaf Web Application | Full Course ✅ | Student Management System Project
 * URL: https://www.youtube.com/watch?v=HYGnVeCs0Yg
 * 
 * */

@SpringBootApplication
public class RentalManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private PropertyInformationRepository propertyRepository;

	public static void main(String[] args) {
		SpringApplication.run(RentalManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * PropertyInformation property1 = new PropertyInformation("TMJ C",
		 * "Rumah Sendiri",
		 * "C-4-7, Apartment Taman Medan Jaya, Jalan PJS 2/1, 46100 Petaling Jaya, Selangor"
		 * , 496, "29hb", "Public Bank Islamic Berhad", "297828557",
		 * "Marcus - 012-2122304", 35, "SYSTEM", new Date(), null, null);
		 * propertyRepository.save(property1);
		 * 
		 * PropertyInformation property2 = new PropertyInformation("TBA 11",
		 * "Rumah Sendiri",
		 * "11-2-3, Jalan Pantai Dalam, Taman Bukit Angkasa, 59200 Kuala Lumpur, WPKL",
		 * 679, "30hb", "Maybank Islamic Berhad", "46266623528",
		 * "Kak Azura - 012-6033009", 25, "SYSTEM", new Date(), null, null);
		 * propertyRepository.save(property2);
		 */
		 
	}

}
