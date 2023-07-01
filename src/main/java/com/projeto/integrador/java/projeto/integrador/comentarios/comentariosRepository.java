package com.projeto.integrador.java.projeto.integrador.comentarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {

	// SQL para listar comentarios que estejam com o status "on" e ordernar em ordem
	// descrecente.

	@Query(value = "SELECT * FROM COMENTARIOS WHERE status = 'on' ORDER BY data DESC", nativeQuery = true)
	List<Comentarios> pegaTodosComentarios();

}
