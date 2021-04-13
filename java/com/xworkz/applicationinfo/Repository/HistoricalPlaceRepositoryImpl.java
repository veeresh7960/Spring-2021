package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.HistoricalPlaceEntity;

public class HistoricalPlaceRepositoryImpl implements HistoricalPlaceRepository {

	private SessionFactory factory;

	public HistoricalPlaceRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked HistoricalPlaceRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(HistoricalPlaceEntity entity) {
		System.out.println("created " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(entity);
		session.getTransaction().commit();
	}

}
