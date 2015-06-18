package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the GRAU database table.
 * 
 */
@Entity
@NamedQuery(name="Grau.findAll", query="SELECT g FROM Grau g")
public class Grau implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idGrau;
	private String txtNivel;
	private List<Prova> provas;

	public Grau() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_GRAU")
	public int getIdGrau() {
		return this.idGrau;
	}

	public void setIdGrau(int idGrau) {
		this.idGrau = idGrau;
	}


	@Column(name="TXT_NIVEL")
	public String getTxtNivel() {
		return this.txtNivel;
	}

	public void setTxtNivel(String txtNivel) {
		this.txtNivel = txtNivel;
	}


	//bi-directional many-to-one association to Prova
	@OneToMany(mappedBy="grau")
	public List<Prova> getProvas() {
		return this.provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}

	public Prova addProva(Prova prova) {
		getProvas().add(prova);
		prova.setGrau(this);

		return prova;
	}

	public Prova removeProva(Prova prova) {
		getProvas().remove(prova);
		prova.setGrau(null);

		return prova;
	}

}