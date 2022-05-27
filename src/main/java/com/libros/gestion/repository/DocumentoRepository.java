package com.libros.gestion.repository;

import com.libros.gestion.model.TipoDoc;
import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepository extends CrudRepository<TipoDoc,Integer> {
}
