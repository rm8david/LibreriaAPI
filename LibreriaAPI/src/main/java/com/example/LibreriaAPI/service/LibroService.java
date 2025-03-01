package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Libro;

import java.util.List;

public interface LibroService {
    Libro agregarLibro(Libro libro, String nombreEditorial, String nombreAutor);

    List<Libro> getAllLibros();

    Libro getLibroById(Integer id);
}
