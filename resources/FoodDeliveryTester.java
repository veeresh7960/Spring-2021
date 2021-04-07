package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.constants.VendorType;
import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.HotelVendorService;

public class FoodDeliveryTester {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("injection.xml");
		
		 CustomerService cs = context.getBean(CustomerService.class);
		 FoodItemService fs=context.getBean(FoodItemService.class);
		 HotelVendorService hs=context.getBean(HotelVendorService.class);
		 HotelVendorEntity hotelEntity = new HotelVendorEntity("akash Angadi", "Hubballi", 5, 8933739332l,
					VendorType.PRIVATE_LIMITED, "nera chennamma Sircle", "akash@gmail.com");
		 hs.validateAndSave(hotelEntity);
		 System.out.println("--------------------------------------------------------------------------------------------------");

		 FoodItemEntity foodEntity = new FoodItemEntity("frideRice", 70.0, 2, FoodType.VEG, 5, true, "NA", 1, 1, "brown");
		 fs.validateAndSave(foodEntity);
		 System.out.println("--------------------------------------------------------------------------------------------------");
		 CustomerEntity custmerEntity=new CustomerEntity("veeresh", "koppal", 821709659, 9, 24, "veeresh@gmail.com");
		 cs.validateAndSave(custmerEntity);
	}
}
