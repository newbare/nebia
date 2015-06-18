package com.br.questquadirx.repositorio;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.springframework.stereotype.Repository;

import com.br.questquadirx.dominio.Country;
import com.br.questquadirx.util.infra.JpaDao;


/**
 * @author Jefera
 */
@Named
public class CountryRepository extends JpaDao<Country> implements Serializable {


		

	

	public List<Country> listar() {
		StringBuilder jpql = new StringBuilder() //
				.append("SELECT x ") //
				.append("FROM " + Country.class.getName() + " x ") //
				.append("ORDER BY x.id ASC ");
		
		
		return this.findAll();
	}

	
	


	public Country buscarPor(Long id) {
		return this.findById(id);
	}

	
	
	public void inserir(Country country) {
		this.inserir(country);
	}


	
	public Country alterar(Country country) {
		return this.alterar(country);
	}

	
	
	/*public void excluir(Country country) {
		this.delete(country.getId());
	}
*/
	
	
	public void excluirPor(Long id) {
		this.delete(id);
	}

}