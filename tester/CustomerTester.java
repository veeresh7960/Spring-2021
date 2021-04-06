package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;
import com.xworkz.fooddelivery.repository.CustomerRepositoryImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerEntity entity = new CustomerEntity("Arun", "Rajajinagar", 884743838, 5, 30, "arun@gmail.com");
		CustomerEntity entity2 = new CustomerEntity("Manjunath", "Rajajinagar", 772438371, 5, 17,
				"manjunath@gmail.com");

		CustomerRepository repository = new CustomerRepositoryImpl();
		repository.save(entity);
	

		CustomerService service = new CustomerServiceImpl(repository);
		service.validateAndSave(entity);
		service.validateAndSave(entity2);
		
	}
}
