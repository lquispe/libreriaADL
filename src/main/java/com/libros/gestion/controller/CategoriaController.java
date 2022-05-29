package com.libros.gestion.controller;

import com.libros.gestion.model.Categoria;
import com.libros.gestion.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author lili
 * @Date 29/5/22
 */

@RestController
@RequestMapping(path = "/libreria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping(path = "/category/all")
    public @ResponseBody
    Iterable<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }

    @PostMapping(path = "/category/create",
            consumes = "application/json", produces = "application/json")
    public Categoria createCategoria(@RequestBody Categoria newCategoria) {
        return categoriaRepository.save(newCategoria);
    }

    @PutMapping(path = "/category/update",
            consumes = "application/json", produces = "application/json")
    public Categoria updateEditorial(@RequestBody Categoria updateCategoria) {
        return categoriaRepository.save(updateCategoria);
    }

    @DeleteMapping(path = "/category/delete/{id}")
    Iterable<Categoria> deleteCategoriabyId(@PathVariable("id") int id_cate) {
        try {
            categoriaRepository.deleteById(id_cate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return categoriaRepository.findAll();

        }

    }

    @GetMapping(path = "category/name/{nombre}")
    public @ResponseBody
    Collection<Categoria> getCategoryByName(@PathVariable("nombre") String nombre) {
        return categoriaRepository.getCategoriaByName(nombre);
    }

}


