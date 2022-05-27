package com.libros.gestion.repository;

import com.libros.gestion.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository  extends CrudRepository<Cliente, Integer> {

}
