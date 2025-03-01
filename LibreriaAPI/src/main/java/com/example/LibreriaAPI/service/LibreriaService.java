package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Libreria;
import com.example.LibreriaAPI.model.Libro;

import java.util.List;

public interface LibreriaService {
    //los metodos que quiero llamar desde el controller. Solo la firma
    //estos metodos aportan la logica de la aplicaicon
    Libreria agregarLibreria(Libreria libreria);


    List<Libro> showLibros(String nombreLibreria);

    List<Libreria> getAllLibrerias();

}
