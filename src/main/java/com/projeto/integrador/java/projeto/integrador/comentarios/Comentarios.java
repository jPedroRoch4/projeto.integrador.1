package com.projeto.integrador.java.projeto.integrador.comentarios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comentarios {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uid;
	@Column(length = 3)
	private String status;
	@Column(columnDefinition = "LONGTEXT", length = 65535)
	private String comentario;
	private String autorname;
	private String autorphoto;
	private String autoremail;
	private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getAutorname() {
		return autorname;
	}

	public void setAutorname(String autorname) {
		this.autorname = autorname;
	}

	public String getAutorphoto() {
		return autorphoto;
	}

	public void setAutorphoto(String autorphoto) {
		this.autorphoto = autorphoto;
	}

	public String getAutoremail() {
		return autoremail;
	}

	public void setAutoremail(String autoremail) {
		this.autoremail = autoremail;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
