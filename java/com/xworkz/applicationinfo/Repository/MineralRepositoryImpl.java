package com.xworkz.applicationinfo.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.applicationinfo.Entity.MineralEntity;

public class MineralRepositoryImpl implements MineralRepository {

	private SessionFactory factory;

	public MineralRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked MineralRepositoryImpl");
		this.factory = factory;
	}

	@Override
	public void save(MineralEntity entity) {
		System.out.println("create save " + entity);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
