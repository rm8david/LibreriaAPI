package com.example.LibreriaAPI.service;

import com.example.LibreriaAPI.model.Editorial;

import java.util.List;

public interface EditorialService {
    List<Editorial> getAllEditoriales();
    Editorial agregarEditorial(Editorial editorial);
    Editorial getEditorialByname(String name);
}
