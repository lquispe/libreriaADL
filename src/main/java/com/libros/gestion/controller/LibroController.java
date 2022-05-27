package com.libros.gestion.controller;

import com.libros.gestion.model.Libro;
import com.libros.gestion.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/libreria/libro")
public class LibroController {

    @Autowired
    private LibroRepository libroRepo;

    @PostMapping(path = "/create",
            consumes = "application/json", produces = "application/json")
    public Libro createLibro(@RequestBody Libro newLibro) {

        return libroRepo.save(newLibro);
    }

}
