package com.br.questquadirx.servico;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.br.questquadirx.dominio.Country;
import com.br.questquadirx.repositorio.CountryRepository;


/**
 * @author Jefera
 */
@Named

public class CountryService  {

	@Inject
	private CountryRepository repository;

	
	public List<Country> list() {
		return repository.listar();
	}

	
	public Country read(Long id) {
		return repository.buscarPor(id);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void create(Country country) {
		repository.inserir(country);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public Country update(Country country) {
		return repository.alterar(country);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Country country) {
		repository.excluir(country);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Long id) {
		repository.excluirPor(id);
	}

}