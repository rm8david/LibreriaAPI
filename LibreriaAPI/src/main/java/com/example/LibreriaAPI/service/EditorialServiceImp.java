package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Editorial;
import com.example.LibreriaAPI.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServiceImp  implements EditorialService{

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public List<Editorial> getAllEditoriales() {
        return editorialRepository.findAll();
    }

    @Override
    public Editorial agregarEditorial(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial getEditorialByname(String name) {
        return editorialRepository.findByNombre(name);
    }


    //implementar los metodos de la interfaz
}
