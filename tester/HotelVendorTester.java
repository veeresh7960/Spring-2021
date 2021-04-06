package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.constants.VendorType;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("akash Angadi", "Hubballi", 5, 8933739332l,
				VendorType.PRIVATE_LIMITED, "nera chennamma Sircle", "akash@gmail.com");

		HotelVendorRepository repository = new HotelVendorRepositoryImpl();
		repository.save(entity);
		HotelVendorService vendorService = new HotelVendorServiceImpl(repository);
		vendorService.validateAndSave(entity);
	}
}
