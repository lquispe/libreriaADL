package com.libros.gestion.repository;

import com.libros.gestion.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository  extends CrudRepository<Libro,Integer> {
}
