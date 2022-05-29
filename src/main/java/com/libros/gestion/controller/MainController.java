package com.libros.gestion.controller;

import com.libros.gestion.model.TipoDoc;
import com.libros.gestion.repository.CategoriaRepository;
import com.libros.gestion.repository.DocumentoRepository;
import com.libros.gestion.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

}