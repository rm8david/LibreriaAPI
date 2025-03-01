package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Autor;

import java.util.List;


public interface AutorService {
    Autor agregarAutor(Autor autor);

    List<Autor> getAllAutores();
    Autor getAutorBynombre(String nombre);

    //los metodos que quiero llamar desde el controller. Solo la firma
    //estos metodos aportan la logica de la aplicaicon
}
