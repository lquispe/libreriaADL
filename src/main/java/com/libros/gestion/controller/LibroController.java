package com.libros.gestion.controller;

import com.libros.gestion.model.Libro;
import com.libros.gestion.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Libro> getAllLibro() {
        return libroRepo.findAll();
    }


    @PutMapping(path = "/update",
            consumes = "application/json", produces = "application/json")
    public Libro updateLibro(@RequestBody Libro libro_update) {
        return libroRepo.save(libro_update);
    }

    @DeleteMapping(path = "/delete/{id}")
    Iterable<Libro> deleteLibro(@PathVariable("id") int id_Libro) {
        try {
            libroRepo.deleteById(id_Libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return libroRepo.findAll();

        }

    }

}
