package com.xworkz.applicationinfo.Service;

import com.xworkz.applicationinfo.Entity.TvChannelEntity;
import com.xworkz.applicationinfo.Repository.TvChannelRepository;

public class TvChannelServiceImpl implements TvChannelService {

	private TvChannelRepository repository;

	public TvChannelServiceImpl(TvChannelRepository repository) {
		System.out.println("invoked TvChannelServiceImpl");
		this.repository = repository;
	}

	@Override
	public boolean ValidateAndSave(TvChannelEntity entity) {
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
