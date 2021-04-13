package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.VirusEntity;
import com.xworkz.applicationinfo.Repository.VirusRpository;

public class VirusServiceImpl implements VirusService {

	private VirusRpository repository;

	public VirusServiceImpl(VirusRpository repository) {
		System.out.println(" invoked VirusServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndSave(VirusEntity entity) {
		System.out.println("created ValidateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}

		return false;
	}

}
