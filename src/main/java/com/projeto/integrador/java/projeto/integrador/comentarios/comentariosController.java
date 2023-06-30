package com.projeto.integrador.java.projeto.integrador.comentarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentarios")
public class comentariosController {

	@Autowired
	private comentariosRepository comentariosRepository;

	@GetMapping
	public List<comentarios> getAll() {
		return comentariosRepository.findAll();
	}

	@GetMapping("/{id}")
	public comentarios getOne(@PathVariable Long id) {
		if (comentariosRepository.existsById(id)) {
			return comentariosRepository.findById(id).get();
		}
		return null;
	}

}
