package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.TvChannelEntity;

public class TvChannelRepositoryImpl implements TvChannelRepository {

	private SessionFactory factory;

	public TvChannelRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked TvChannelRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(TvChannelEntity entity) {
		System.out.println("created save" + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
}
