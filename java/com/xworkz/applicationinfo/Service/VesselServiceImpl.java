package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.VesselEntity;
import com.xworkz.applicationinfo.Repository.VesselRepository;

public class VesselServiceImpl implements VesselService {
	private VesselRepository repository;

	public VesselServiceImpl(VesselRepository repository) {
		System.out.println("invoked VesselServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndSave(VesselEntity entity) {
		System.out.println("created ValidateAndSave " + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			this.repository.save(entity);

		} else {
			System.out.println("entity is not vlaid");
		}
		return false;
	}

}
