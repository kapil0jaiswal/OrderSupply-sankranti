package com.sankranthi.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static EntityManager entityManger;
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sankranti");

	private EntityManagerUtil() {
	}

	public static EntityManager getEntityManagerUtility() {
		if (entityManger == null) {
			entityManger = entityManagerFactory.createEntityManager();
		}
			return entityManger;
		

	}
	public static void close() {
		entityManagerFactory.close();
	}
}
