package com.libros.gestion.repository;

import com.libros.gestion.model.Libro;
import com.libros.gestion.model.reportes.BusquedaValLibAuEd;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Dado un campo busca en las tres tablas de libro, autor, editorial
 * @author lili
 * @Date 29/5/22
 */
public interface BusquedaRepository extends CrudRepository <Libro,Integer>{

    @Query(value= "select lb.descripcion as nombre , ed.nombre as editorial, au.nombre as autor, lb.precio as precio from libro as lb, editorial ed, autor as au where lb.editorial_id= ed.id AND lb.autor_id= au.id and ( lb.descripcion like %:val% or ed.nombre like %:val% or au.nombre like %:val%)",nativeQuery = true)
    Iterable<BusquedaValLibAuEd> getLibroBuscado(@Param("val") String val);

}
