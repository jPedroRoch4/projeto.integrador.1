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
public interface DestinoRepository extends JpaRepository<Destino, Long> {

	@Query(value = "SELECT * FROM DESTINO WHERE status = 'on' ORDER BY data DESC", nativeQuery = true)
	List<Destino> pegaTodosDestinos();

	@Modifying
	@Query(value = "UPDATE destino SET views = views + 1 WHERE id = :id", nativeQuery = true)
	void atualizaViews(@Param("id") Long id);

	@Query(value = "SELECT * FROM DESTINO WHERE status = 'on' ORDER BY views DESC LIMIT :limit", nativeQuery = true)
	List<Destino> pegaMaisVistos(@Param("limit") int limit);

}