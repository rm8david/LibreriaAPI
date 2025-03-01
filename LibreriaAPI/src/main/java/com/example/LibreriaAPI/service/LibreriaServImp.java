package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Libreria;
import com.example.LibreriaAPI.model.Libro;
import com.example.LibreriaAPI.repository.LibreriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibreriaServImp implements LibreriaService {

    @Autowired
    private LibreriaRepository libreriaRepository;

    @Override
    public Libreria agregarLibreria(Libreria libreria) {
        return libreriaRepository.save(libreria);
    }

    @Override
    public List<Libro> showLibros(String nombreLibreria) {
       Libreria libreria = libreriaRepository.findByNombre(nombreLibreria);
         return libreria.getLibros();

    }

    @Override
    public List<Libreria> getAllLibrerias() {
        return libreriaRepository.findAll();
    }

    // Implementar otros métodos de la interfaz
}