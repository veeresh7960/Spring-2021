package com.xworkz.fooddelivery.tester;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;
import com.xworkz.fooddelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;

public class FoodDeliveryTester {

	public static void main(String[] args) {

		FoodItemEntity entity = new FoodItemEntity("curdRice", 70.0, 2, FoodType.VEG, 5, true, "NA", 1, 1, "white");

		//FoodItemEntity entity2 = new FoodItemEntity("curdRice", 70.0, 2, FoodType.VEG, 5, true, "NA", 1, 1, "white");
		FoodItemRepository repository = new FoodItemRepositoryImpl();
		FoodItemService service = new FoodItemServiceImpl(repository);
		boolean save = service.validateAndSave(entity);
		//boolean save2 = service.validateAndSave(entity);
		System.out.println(save);
		//System.out.println(save2);
	}
}
