package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.KabbaddiEntity;
import com.xworkz.applicationinfo.Repository.KabbaddiRepository;

public class KabbaddiServiceImpl implements KabbaddiService {

	private KabbaddiRepository repository;

	public KabbaddiServiceImpl(KabbaddiRepository repository) {
		System.out.println("invoked KabbaddiServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndSave(KabbaddiEntity entity) {
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
