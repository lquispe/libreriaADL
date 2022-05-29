package com.libros.gestion.repository;

import com.libros.gestion.model.Editorial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface EditorialRepository extends CrudRepository<Editorial,Integer> {

    @Query(value="select ed.* from editorial as ed where ed.nombre like %:name%", nativeQuery =true)
    Collection<Editorial> getEditorialByName(@Param("name") String nombre);
}
