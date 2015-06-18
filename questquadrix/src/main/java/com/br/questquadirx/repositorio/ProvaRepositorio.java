package com.br.questquadirx.repositorio;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.br.questquadirx.dominio.Prova;
import com.br.questquadirx.util.jpa.JPAUTIL;

/**
 * @author Jefera
 */
@Repository
public class ProvaRepositorio extends JPAUTIL{	
	
	@Transactional(readOnly = true)
	public List<Prova> listar() {
		StringBuilder jpql = new StringBuilder() //
				.append("SELECT x ") //
				.append("FROM " + Prova.class.getName() + " x ") 
				.append(" INNER JOIN x.grau g ")
				.append(" INNER JOIN x.banca b ")
				.append(" INNER JOIN x.instituicao i ")
				.append(" ORDER BY x.idProva ASC ");
		return getEntityManager().createQuery(jpql.toString(), Prova.class).getResultList();
	}

	
	public Prova buscarPor(Long id) {
		return getEntityManager().find(Prova.class, id);
	}

	
	
	public void inserir(Prova Prova) {
		getEntityManager().persist(Prova);
	}


	
	public Prova alterar(Prova Prova) {
		return getEntityManager().merge(Prova);
	}

	
	
	public void excluir(Prova Prova) {
		getEntityManager().remove(Prova);
	}

	
	
	public void excluirPor(int id) {
		Prova Prova = getEntityManager().getReference(Prova.class, id);
		excluir(Prova);
	}

}