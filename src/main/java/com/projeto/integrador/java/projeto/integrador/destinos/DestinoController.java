package com.projeto.integrador.java.projeto.integrador.destinos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/destinos")
public class DestinoController {

	@Autowired
	private DestinoRepository repository;

	// Exemplo para receber todos os destinos:
	// http://localhost:8080/destinos
	@GetMapping
	public List<Destino> getAll() {
		return repository.pegaTodosDestinos();
	}

	// Exemplo para receber apenas um destino com o ID 2:
	// http://localhost:8080/destinos/2 ←←←
	@GetMapping("/{id}")
	public Destino getOne(@PathVariable Long id) {
		if (repository.existsById(id)) {
			return repository.findById(id).get();
		}
		return null;
	}

	// Exemplo para atualizar o contador de visualizações do destino com ID 2:
	// http://localhost:8080/destinos/views/2
	@PatchMapping("/views/{id}")
	public void updateViews(@PathVariable Long id) {
		repository.atualizaViews(id);
	}

	// Exemplo para listar os 5 destinos mais visualizados:
	// http://localhost:8080/destinos/viewed/5 ←←← quantos destinos obter
	@GetMapping("/viewed/{limit}")
	public List<Destino> getMostViewed(@PathVariable int limit){
		return repository.pegaMaisVistos(limit);
	}
}
