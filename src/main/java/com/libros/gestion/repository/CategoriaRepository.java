package com.libros.gestion.repository;

import com.libros.gestion.model.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {
}
