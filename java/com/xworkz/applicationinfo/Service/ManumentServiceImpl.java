package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.ManumentEntity;
import com.xworkz.applicationinfo.Repository.ManumentRepository;

public class ManumentServiceImpl implements ManumentService {
	private ManumentRepository repository;

	public ManumentServiceImpl(ManumentRepository repository) {
		System.out.println("invoked ManumentServiceImpl");
		this.repository = repository;

	}

	@Override
	public boolean ValidateAndSave(ManumentEntity entity) {
		System.out.println("created ValidateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not is valid");
		}
		return false;
	}

}
