package com.libros.gestion.repository;

import com.libros.gestion.model.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {

    @Query(value="select cat.* from categoria as cat where cat.nombre like %:name%", nativeQuery =true)
    Collection<Categoria> getCategoriaByName(@Param("name") String nombre);
}
