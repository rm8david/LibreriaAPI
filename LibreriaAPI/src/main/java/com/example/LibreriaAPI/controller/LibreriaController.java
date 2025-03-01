package com.example.LibreriaAPI.controller;

import com.example.LibreriaAPI.model.Libreria;
import com.example.LibreriaAPI.model.Libro;
import com.example.LibreriaAPI.service.LibreriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librerias")
public class LibreriaController {
    @Autowired
    private LibreriaService libreriaService;

    @PostMapping("/add")
    public ResponseEntity<Libreria> addLibreria(@RequestBody Libreria libreria){
        return new ResponseEntity<>(libreriaService.agregarLibreria(libreria), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Libreria>> getLibrerias(){
        return  new ResponseEntity<>(libreriaService.getAllLibrerias(), HttpStatus.OK);
    }
    @GetMapping("/getLibros")
    public ResponseEntity<List<Libro>> getLibros(@RequestParam String nombre){
        return new ResponseEntity<>(libreriaService.showLibros(nombre), HttpStatus.OK);
    }
}
