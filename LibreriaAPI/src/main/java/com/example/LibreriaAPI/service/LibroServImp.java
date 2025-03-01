package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Autor;
import com.example.LibreriaAPI.model.Editorial;
import com.example.LibreriaAPI.model.Libro;
import com.example.LibreriaAPI.repository.AutorRepository;
import com.example.LibreriaAPI.repository.EditorialRepository;
import com.example.LibreriaAPI.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServImp implements LibroService {
    @Autowired
    private EditorialRepository editorialRepository;
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;
    @Override
    public Libro agregarLibro(Libro libro, String nombreEditorial, String nombreAutor) {
        Editorial editorial = editorialRepository.findByNombre(nombreEditorial);
        Autor autor = autorRepository.findByNombre(nombreAutor);
        libro.setEditorial(editorial);
        libro.setAutor(autor);
        return libroRepository.save(libro);
    }

    @Override
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro getLibroById(Integer id) {
        return libroRepository.findById(id).orElse(null);
    }
}
