package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.MineralEntity;
import com.xworkz.applicationinfo.Repository.MineralRepository;

public class MineralServiceImpl implements MineralService {
	private MineralRepository repository;

	public MineralServiceImpl(MineralRepository repository) {
		System.out.println("invoked MineralServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndSave(MineralEntity entity) {
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
