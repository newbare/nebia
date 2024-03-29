package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the BANCA database table.
 * 
 */
@Entity
@NamedQuery(name="Banca.findAll", query="SELECT b FROM Banca b")
public class Banca implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idBanca;
	private String nomeBanca;
	private List<Prova> provas;

	public Banca() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_BANCA")
	public int getIdBanca() {
		return this.idBanca;
	}

	public void setIdBanca(int idBanca) {
		this.idBanca = idBanca;
	}


	@Column(name="NOME_BANCA")
	public String getNomeBanca() {
		return this.nomeBanca;
	}

	public void setNomeBanca(String nomeBanca) {
		this.nomeBanca = nomeBanca;
	}


	//bi-directional many-to-one association to Prova
	@OneToMany(mappedBy="banca")
	public List<Prova> getProvas() {
		return this.provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}

	public Prova addProva(Prova prova) {
		getProvas().add(prova);
		prova.setBanca(this);

		return prova;
	}

	public Prova removeProva(Prova prova) {
		getProvas().remove(prova);
		prova.setBanca(null);

		return prova;
	}

}