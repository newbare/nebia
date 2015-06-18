package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RESPOSTA database table.
 * 
 */
@Entity
@NamedQuery(name="Resposta.findAll", query="SELECT r FROM Resposta r")
public class Resposta implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idResposta;
	private String correta;
	private String txtResposta;
	private List<Comentario> comentarios;
	private Questao questao;

	public Resposta() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_RESPOSTA")
	public int getIdResposta() {
		return this.idResposta;
	}

	public void setIdResposta(int idResposta) {
		this.idResposta = idResposta;
	}


	public String getCorreta() {
		return this.correta;
	}

	public void setCorreta(String correta) {
		this.correta = correta;
	}


	@Column(name="TXT_RESPOSTA")
	public String getTxtResposta() {
		return this.txtResposta;
	}

	public void setTxtResposta(String txtResposta) {
		this.txtResposta = txtResposta;
	}


	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="resposta")
	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setResposta(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setResposta(null);

		return comentario;
	}


	//bi-directional many-to-one association to Questao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_QUESTAO")
	public Questao getQuestao() {
		return this.questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

}