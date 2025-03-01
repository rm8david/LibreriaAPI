package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Autor;
import com.example.LibreriaAPI.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImp  implements AutorService{
    @Autowired
    private  AutorRepository autorRepository;
    @Override
    public Autor agregarAutor(Autor autor) {

       if(autorRepository.findByNombre(autor.getNombre())==null){
           return autorRepository.save(autor);
       }
      return null;
        //necesito el repository para ejecutar los metodos contra base de datos
        //logica del negocio, por ejemplo si el autor ya existe no lo añadas
    }

    @Override
    public List<Autor> getAllAutores() {
        return autorRepository.findAll();
    }

    @Override
    public Autor getAutorBynombre(String nombre) {
        return autorRepository.findByNombre(nombre);
    }
    //implementar los metodos de la interfaz
}
