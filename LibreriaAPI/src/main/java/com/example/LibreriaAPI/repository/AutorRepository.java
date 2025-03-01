package com.example.LibreriaAPI.repository;
//todos los metodos adicionales que necesitemos
//los metodos por defecto me los da el JPA repository

import com.example.LibreriaAPI.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;


public interface AutorRepository extends JpaRepository<Autor, Integer> {
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    Autor findByNombre(@Param("nombre") String nombre);


//estos metodos van contra la base de datos
}
