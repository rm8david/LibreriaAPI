package com.example.LibreriaAPI.repository;

import com.example.LibreriaAPI.model.Libreria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibreriaRepository extends JpaRepository<Libreria, Integer> {

    Libreria findByNombre(String nombreLibreria);
}
