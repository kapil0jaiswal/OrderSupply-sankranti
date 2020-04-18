package com.sankranthi.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import com.sankranthi.domain.User;


@Stateless
public class UserRegisterServiceImpl implements UserRegisterService {

	public void submit(User user) {
		EntityManager entityManager= EntityManagerUtil.getEntityManagerUtility();
		
		if(!entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().begin();
		}
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		EntityManagerUtil.close();
		entityManager.close();

	}

}
