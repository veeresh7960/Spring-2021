package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.ApplicationEntity;

public class AppicationEntityRepositoryImpl implements ApplicationEntityRepository {

	private SessionFactory factory;

	public AppicationEntityRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked AppicationEntityRepositoryImpl " + this.getClass().getName());
		this.factory = factory;
	}

	@Override
	public void save(ApplicationEntity entity) {
		System.out.println("created save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(entity);
		session.getTransaction().commit();

	}

}
