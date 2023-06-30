package com.projeto.integrador.java.projeto.integrador.reviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class reviewsController {

	@Autowired
	private reviewsRepository reviewsRepository;

	@GetMapping
	public List<reviews> getAll() {
		return reviewsRepository.findAll();
	}

	@GetMapping("/{id}")
	public reviews getOne(@PathVariable Long id) {
		if (reviewsRepository.existsById(id)) {
			return reviewsRepository.findById(id).get();
		}
		return null;
	}

}
