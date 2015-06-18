package com.br.questquadirx.util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JPAUTIL {
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
