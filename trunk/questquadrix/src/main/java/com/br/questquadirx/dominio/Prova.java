package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROVA database table.
 * 
 */
@Entity
@NamedQuery(name="Prova.findAll", query="SELECT p FROM Prova p")
public class Prova implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idProva;
	private String nome;
	private Banca banca;
	private Grau grau;
	private Instituicao instituicao;
	private List<Questao> questaos;

	public Prova() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PROVA")
	public int getIdProva() {
		return this.idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}


	//bi-directional many-to-one association to Banca
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_BANCA")
	public Banca getBanca() {
		return this.banca;
	}

	public void setBanca(Banca banca) {
		this.banca = banca;
	}


	//bi-directional many-to-one association to Grau
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_GRAU")
	public Grau getGrau() {
		return this.grau;
	}

	public void setGrau(Grau grau) {
		this.grau = grau;
	}


	//bi-directional many-to-one association to Instituicao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_INSTITUICAO")
	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}


	//bi-directional many-to-one association to Questao
	@OneToMany(mappedBy="prova")
	public List<Questao> getQuestaos() {
		return this.questaos;
	}

	public void setQuestaos(List<Questao> questaos) {
		this.questaos = questaos;
	}

	public Questao addQuestao(Questao questao) {
		getQuestaos().add(questao);
		questao.setProva(this);

		return questao;
	}

	public Questao removeQuestao(Questao questao) {
		getQuestaos().remove(questao);
		questao.setProva(null);

		return questao;
	}

	@Column(name="NOME")
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}