package com.projeto.integrador.java.projeto.integrador.comentarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/comentarios")
public class ComentariosController {

	@Autowired
	private ComentariosRepository repository;

	// Exemplo para receber todos os comentarios:
	// http://localhost:8080/comentarios
	public List<Comentarios> getAll() {
		return repository.pegaTodosComentarios();
	}

	// Exemplo para receber apenas um comentario de sua preferência:
	// http://localhost:8080/comentarios/ (insira um ID de sua escolha.) ← ← ←
	@GetMapping("/{id}")
	public Comentarios getOne(@PathVariable Long id) {
		if (repository.existsById(id)) {
			return repository.findById(id).get();
		}
		return null;
	}

}
