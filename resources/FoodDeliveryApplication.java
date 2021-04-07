package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.constants.VendorType;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;
import com.xworkz.fooddelivery.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class FoodDeliveryApplication {

	public static void main(String[] args) {
		
		 
		
		FoodItemEntity entity = new FoodItemEntity("curdRice", 70.0, 2, FoodType.VEG, 5, true, "NA", 1, 1, "white");

		// FoodItemEntity entity2 = new FoodItemEntity("curdRice", 70.0, 2,
		// FoodType.VEG, 5, true, "NA", 1, 1, "white");
		FoodItemRepository repository = new FoodItemRepositoryImpl();
		FoodItemService service = new FoodItemServiceImpl(repository);
		boolean save = service.validateAndSave(entity);
		// boolean save2 = service.validateAndSave(entity);
		System.out.println(save);
		// System.out.println(save2);
		System.out.println("-----------------------------------------------------------------------------");

		HotelVendorEntity entity1 = new HotelVendorEntity("akash Angadi", "Hubballi", 5, 8933739332l,
				VendorType.PRIVATE_LIMITED, "nera chennamma Sircle", "akash@gmail.com");

		HotelVendorRepository repository1 = new HotelVendorRepositoryImpl();
		repository1.save(entity1);
		HotelVendorService vendorService = new HotelVendorServiceImpl(repository1);
		vendorService.validateAndSave(entity1);

		System.out.println("-----------------------------------------------------------------------------");

		CustomerEntity entity2 = new CustomerEntity("Arun", "Rajajinagar", 884743838, 5, 30, "arun@gmail.com");
		CustomerEntity entity3 = new CustomerEntity("Manjunath", "Rajajinagar", 772438371, 5, 17,
				"manjunath@gmail.com");

		CustomerRepository repository2 = new CustomerRepositoryImpl();
		repository2.save(entity2);
		repository2.save(entity3);
		CustomerService coustomerService = new CustomerServiceImpl(repository2);
		coustomerService.validateAndSave(entity2);
		coustomerService.validateAndSave(entity3);

	}
}
