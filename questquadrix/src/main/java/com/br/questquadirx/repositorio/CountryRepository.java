package com.br.questquadirx.repositorio;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.br.questquadirx.dominio.Country;

/**
 * @author Michel Risucci
 */
@Named
public class CountryRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	public List<Country> listar() {
		StringBuilder jpql = new StringBuilder() //
				.append("SELECT x ") //
				.append("FROM " + Country.class.getName() + " x ") //
				.append("ORDER BY x.id ASC ");

		return entityManager.createQuery(jpql.toString(), Country.class).getResultList();
	}

	
	


	public Country buscarPor(Long id) {
		return entityManager.find(Country.class, id);
	}

	
	
	public void inserir(Country country) {
		entityManager.persist(country);
	}


	
	public Country alterar(Country country) {
		return entityManager.merge(country);
	}

	
	
	public void excluir(Country country) {
		entityManager.remove(country);
	}

	
	
	public void excluirPor(Long id) {
		Country country = entityManager.getReference(Country.class, id);
		excluir(country);
	}

}