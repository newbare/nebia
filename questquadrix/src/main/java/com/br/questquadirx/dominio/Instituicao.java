package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the INSTITUICAO database table.
 * 
 */
@Entity
@NamedQuery(name="Instituicao.findAll", query="SELECT i FROM Instituicao i")
public class Instituicao implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idInstituicao;
	private String nomeInstituicao;
	private List<Prova> provas;

	public Instituicao() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_INSTITUICAO")
	public int getIdInstituicao() {
		return this.idInstituicao;
	}

	public void setIdInstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}


	@Column(name="NOME_INSTITUICAO")
	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}


	//bi-directional many-to-one association to Prova
	@OneToMany(mappedBy="instituicao")
	public List<Prova> getProvas() {
		return this.provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}

	public Prova addProva(Prova prova) {
		getProvas().add(prova);
		prova.setInstituicao(this);

		return prova;
	}

	public Prova removeProva(Prova prova) {
		getProvas().remove(prova);
		prova.setInstituicao(null);

		return prova;
	}

}