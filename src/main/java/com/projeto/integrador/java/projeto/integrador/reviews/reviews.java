package com.projeto.integrador.java.projeto.integrador.reviews;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class reviews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column(length = 127)
	private String autorname;

	@Column(length = 127)
	private String autorphoto;

	@Column(length = 127)
	private String uid;

	@Column(length = 255)
	private String date;

	@Column(length = 255)
	private String review;

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
