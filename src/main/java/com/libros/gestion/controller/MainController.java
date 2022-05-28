package com.libros.gestion.controller;

import com.libros.gestion.model.Categoria;
import com.libros.gestion.model.TipoDoc;
import com.libros.gestion.model.Editorial;
import com.libros.gestion.repository.DocumentoRepository;
import com.libros.gestion.repository.EditorialRepository;
import com.libros.gestion.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/libreria")
public class MainController {

    @Autowired
    private EditorialRepository editorial;

    @Autowired
    private CategoriaRepository categoria;


    @Autowired
    private DocumentoRepository documentoRepo;


    /*********************Documento************/

    @GetMapping(path = "/documento/all")
    public @ResponseBody
    Iterable<TipoDoc> getAllDocumento() {
        return documentoRepo.findAll();
    }


    /*********************Categoria************/
    @GetMapping(path = "/category/all")
    public @ResponseBody
    Iterable<Categoria> getAllCategoria() {
        return categoria.findAll();
    }

    @PostMapping(path = "/category/create",
            consumes = "application/json", produces = "application/json")
    public Categoria createCategoria(@RequestBody Categoria newCategoria) {
        return categoria.save(newCategoria);
    }

    @PutMapping(path = "/category/update",
            consumes = "application/json", produces = "application/json")
    public Categoria updateEditorial(@RequestBody Categoria updateCategoria) {
        return categoria.save(updateCategoria);
    }

    @DeleteMapping(path = "/category/delete/{id}")
    Iterable<Categoria> deleteCategoriabyId(@PathVariable("id") int id_cate) {
        try {
            categoria.deleteById(id_cate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return categoria.findAll();

        }

    }

}
