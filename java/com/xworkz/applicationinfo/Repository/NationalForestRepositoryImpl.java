package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.NationalForestEntity;

public class NationalForestRepositoryImpl implements NationalForestRepository {

	private SessionFactory factory;

	public NationalForestRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked NationalForestRepositoryImpl");
		this.factory = factory;

	}

	@Override
	public void save(NationalForestEntity entity) {
		System.out.println("created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
