package com.example.LibreriaAPI.controller;

import com.example.LibreriaAPI.model.Libro;
import com.example.LibreriaAPI.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;
    //añade un libro con su editorial y su autor
    @PostMapping("/add")
    public Libro addLibro(@RequestBody Libro libro, @RequestParam String editorial, @RequestParam String autor){
        return libroService.agregarLibro(libro, editorial, autor);
    }
    @GetMapping("/getAll")
    public List<Libro> getLibros(){
        return libroService.getAllLibros();
    }
    @GetMapping("/get")
    public Libro getLibroById(@RequestParam Integer id){
        return libroService.getLibroById(id);
    }
}
