package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.KabbaddiEntity;

public class KabbaddiRepositoryImpl implements KabbaddiRepository {

	private SessionFactory factory;

	public KabbaddiRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked KabbaddiRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(KabbaddiEntity entity) {
		System.out.println("created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(entity);
		session.getTransaction().commit();
	}

}
