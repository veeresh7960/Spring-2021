package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.VirusEntity;

public class VirusRpositoryImpl implements VirusRpository {

	private SessionFactory factory;

	public VirusRpositoryImpl(SessionFactory factory) {
		System.out.println("invoked VirusRpositoryImpl");
		this.factory = factory;
	}
	@Override
	public void save(VirusEntity entity) {
		System.out.println("created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
}
