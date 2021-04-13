package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.NationalForestEntity;
import com.xworkz.applicationinfo.Repository.NationalForestRepository;

public class NationalForestServiceImpl implements NationalForestService {

	private NationalForestRepository repository;

	public NationalForestServiceImpl(NationalForestRepository repository) {
		System.out.println("invoked NationalForestServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndsave(NationalForestEntity entity) {
		System.out.println("created ValidateAndsave" + entity);
		if (entity != null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not is valid");
		}
		return false;
	}

}
