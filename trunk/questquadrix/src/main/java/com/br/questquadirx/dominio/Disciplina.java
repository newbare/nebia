package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DISCIPLINA database table.
 * 
 */
@Entity
@NamedQuery(name="Disciplina.findAll", query="SELECT d FROM Disciplina d")
public class Disciplina implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idDisciplina;
	private String nomeDisciplina;
	private List<Questao> questaos;

	public Disciplina() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_DISCIPLINA")
	public int getIdDisciplina() {
		return this.idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}


	@Column(name="NOME_DISCIPLINA")
	public String getNomeDisciplina() {
		return this.nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}


	//bi-directional many-to-one association to Questao
	@OneToMany(mappedBy="disciplina")
	public List<Questao> getQuestaos() {
		return this.questaos;
	}

	public void setQuestaos(List<Questao> questaos) {
		this.questaos = questaos;
	}

	public Questao addQuestao(Questao questao) {
		getQuestaos().add(questao);
		questao.setDisciplina(this);

		return questao;
	}

	public Questao removeQuestao(Questao questao) {
		getQuestaos().remove(questao);
		questao.setDisciplina(null);

		return questao;
	}

}