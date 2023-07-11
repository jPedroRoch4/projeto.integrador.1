package com.projeto.integrador.java.projeto.integrador.destinos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/destinos")
public class DestinosController {

	@Autowired
	private DestinosRepository repository;

	// Exemplo para receber todos os destinos:
	// http://localhost:8080/destinos
	@GetMapping
	public List<Destinos> getAll() {
		return repository.pegaTodosDestinos();
	}

	// Exemplo para receber apenas um destino de sua preferência:
	// http://localhost:8080/destinos/ (insira um ID de sua escolha.) ← ← ←
	@GetMapping("/{id}")
	public Destinos getOne(@PathVariable Long id) {
		if (repository.existsById(id)) {
			return repository.findById(id).get();
		}
		return null;
	}

	// Exemplo para atualizar o contador de visualizações do destino com ID de preferência:
	// http://localhost:8080/destinos/views/(insira um ID de sua preferência.) ← ← ←
	@PatchMapping("/views/{id}")
	public void updateViews(@PathVariable Long id) {
		repository.atualizaViews(id);
	}

	// Exemplo para listar os 5 destinos mais visualizados:
	// http://localhost:8080/destinos/viewed/5 ← ← ← numero desejado de destinos para visualizar.
	@GetMapping("/viewed/{limit}")
	public List<Destinos> getMostViewed(@PathVariable int limit){
		return repository.pegaMaisVistos(limit);
	}
}
