package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.ManumentEntity;

public class ManumentRepositoryImpl implements ManumentRepository {

	private SessionFactory factory;

	public ManumentRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked ManumentRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(ManumentEntity entity) {
		System.out.println("created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
