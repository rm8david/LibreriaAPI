package com.example.LibreriaAPI.repository;

import com.example.LibreriaAPI.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EditorialRepository extends JpaRepository<Editorial, Integer> {


        @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
        Editorial findByNombre(@Param("nombre") String nombre);

    //ejemplo de metodo adicional
    /*
    Metodo "normal" que va a buscar una editorial por nombre
    List<Editorial> findByNombre(String nombre);
    Metodo con query avanzado
    @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    List<Editorial> buscarPorNombre(@Param("nombre") String nombre);

     */
}
