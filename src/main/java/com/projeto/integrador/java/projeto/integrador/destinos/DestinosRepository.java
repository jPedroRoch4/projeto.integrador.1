package com.projeto.integrador.java.projeto.integrador.destinos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface DestinosRepository extends JpaRepository<Destinos, Long> {

	// SQL para listar destinos que estejam com o status "on" e ordernar em ordem descrecente.
	
	@Query(value = "SELECT * FROM DESTINO WHERE status = 'on' ORDER BY data DESC", nativeQuery = true)
	List<Destinos> pegaTodosDestinos();

	// SQL para ser capaz de poder fazer patch e atualizar a quantidade de views em um post de "Destinos".
	
	@Modifying
	@Query(value = "UPDATE destino SET views = views + 1 WHERE id = :id", nativeQuery = true)
	void atualizaViews(@Param("id") Long id);

	// SQL para selecionar os "Destinos" com o maior numero de visualizações e ordenar em uma lista pela ordem descrecente.
	// o "LIMIT" determina o limite de "Destinos" que irá colocar na lista.
	
	@Query(value = "SELECT * FROM DESTINO WHERE status = 'on' ORDER BY views DESC LIMIT :limit", nativeQuery = true)
	List<Destinos> pegaMaisVistos(@Param("limit") int limit);

}