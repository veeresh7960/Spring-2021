package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.ShirtEntity;
import com.xworkz.applicationinfo.Repository.ShirtRepository;

public class ShirtServiceImpl implements ShirtService {

	private ShirtRepository repository;

	public ShirtServiceImpl(ShirtRepository repository) {
		System.out.println("invoked ShirtServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndSave(ShirtEntity entity) {
		System.out.println("created ValidateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
