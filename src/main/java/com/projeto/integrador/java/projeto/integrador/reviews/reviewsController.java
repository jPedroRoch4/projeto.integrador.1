package com.projeto.integrador.java.projeto.integrador.reviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {

	@Autowired
	private ReviewsRepository Repository;

	@GetMapping
	public List<Reviews> getAll() {
		return Repository.findAll();
	}

	@GetMapping("/{id}")
	public Reviews getOne(@PathVariable Long id) {
		if (Repository.existsById(id)) {
			return Repository.findById(id).get();
		}
		return null;
	}

}
