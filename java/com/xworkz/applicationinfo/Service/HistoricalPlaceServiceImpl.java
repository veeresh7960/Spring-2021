package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.HistoricalPlaceEntity;
import com.xworkz.applicationinfo.Repository.HistoricalPlaceRepository;

public class HistoricalPlaceServiceImpl implements HistoricalPlaceService {

	private HistoricalPlaceRepository repository;

	public HistoricalPlaceServiceImpl(HistoricalPlaceRepository repository) {
		System.out.println("invoked HistoricalPlaceServiceImpl");
		this.repository = repository;

	}

	@Override
	public boolean ValidateAndSave(HistoricalPlaceEntity entity) {
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
