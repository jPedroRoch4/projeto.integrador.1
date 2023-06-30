package com.projeto.integrador.java.projeto.integrador.comentarios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class comentarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column(length = 127)
	private String autorname;

	@Column(length = 255)
	private String autorphoto;

	@Column(length = 255)
	private String autoremail;

	@Column(length = 255)
	private String uid;

	@Column(length = 127)
	private String date;

	@Lob
	@Column(columnDefinition = "INTEGER")
	private String destino;

	@Column(length = 31)
	private String status = "on";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
