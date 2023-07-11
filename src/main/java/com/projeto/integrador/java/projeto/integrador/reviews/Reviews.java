package com.projeto.integrador.java.projeto.integrador.reviews;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reviews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long uid;
	private Long autorname;
	private String autorphoto;
	private String autoremail;
	private String date;
	@Column(columnDefinition = "LONGTEXT", length = 65535)
	private String review;
	@Column(length = 3)
	private String status;

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

	public Long getAutorname() {
		return autorname;
	}

	public void setAutorname(Long autorname) {
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

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
