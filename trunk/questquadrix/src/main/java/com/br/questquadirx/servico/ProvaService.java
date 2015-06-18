package com.br.questquadirx.servico;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.br.questquadirx.dominio.Banca;
import com.br.questquadirx.dominio.Grau;
import com.br.questquadirx.dominio.Instituicao;
import com.br.questquadirx.dominio.Prova;
import com.br.questquadirx.repositorio.ProvaRepositorio;


/**
 * @author Jefera
 */
@Named
public class ProvaService  {

	@Inject
	private ProvaRepositorio repository;

	@Transactional
	public List<Prova> list() {
		return repository.listar();		
	}

	@Transactional
	public Prova read(Long id) {
		return repository.buscarPor(id);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void create(Prova Prova) {
		repository.inserir(Prova);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public Prova update(Prova Prova) {
		return repository.alterar(Prova);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Prova Prova) {
		repository.excluir(Prova);
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(int id) {
		repository.excluirPor(id);
	}

}