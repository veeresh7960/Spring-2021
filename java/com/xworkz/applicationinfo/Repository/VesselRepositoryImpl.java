package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.VesselEntity;

public class VesselRepositoryImpl implements VesselRepository {

	private SessionFactory factory;

	public VesselRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked VesselRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(VesselEntity entity) {
		System.out.println("created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
