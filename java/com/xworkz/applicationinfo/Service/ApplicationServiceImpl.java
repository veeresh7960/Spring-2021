package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.ApplicationEntity;
import com.xworkz.applicationinfo.Repository.ApplicationEntityRepository;

public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationEntityRepository repository;

	public ApplicationServiceImpl(ApplicationEntityRepository repository) {
		System.out.println("invoked ApplicationServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(ApplicationEntity entity) {
		System.out.println("created validateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not is valid");
		}

		return false;
	}

}
