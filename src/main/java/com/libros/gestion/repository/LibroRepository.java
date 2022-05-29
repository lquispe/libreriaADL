package com.libros.gestion.repository;

import com.libros.gestion.model.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface LibroRepository  extends CrudRepository<Libro,Integer> {

    @Query(value="select lb.* from libro as lb where lb.descripcion like %:name%", nativeQuery =true)
    Collection<Libro> getLibrosByName(@Param("name") String nombre);

}
