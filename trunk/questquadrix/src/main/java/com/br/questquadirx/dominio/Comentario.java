package com.br.questquadirx.dominio;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMENTARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Comentario.findAll", query="SELECT c FROM Comentario c")
public class Comentario implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idComentario;
	private String txtComentario;
	private Resposta resposta;

	public Comentario() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_COMENTARIO")
	public int getIdComentario() {
		return this.idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}


	@Column(name="TXT_COMENTARIO")
	public String getTxtComentario() {
		return this.txtComentario;
	}

	public void setTxtComentario(String txtComentario) {
		this.txtComentario = txtComentario;
	}


	//bi-directional many-to-one association to Resposta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_RESPOSTA")
	public Resposta getResposta() {
		return this.resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}

}