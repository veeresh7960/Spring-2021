package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.ShirtEntity;

public class ShirtRepositoryImpl implements ShirtRepository {

	private SessionFactory factory;

	public ShirtRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked ShirtRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(ShirtEntity entity) {
		System.out.println(" created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
