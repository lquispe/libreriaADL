package com.libros.gestion.controller;

import com.libros.gestion.model.Editorial;
import com.libros.gestion.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping(path = "/libreria/editorial")
public class EditorialController {

    @Autowired
    private EditorialRepository editorial;


    @GetMapping(path ="/all")
    public @ResponseBody
    Iterable<Editorial> getAllEditoriales() {
        return editorial.findAll();
    }

    @PostMapping(path ="/create",
            consumes = "application/json", produces = "application/json")
    public Editorial createEditorial(@RequestBody Editorial newEditorial) {
        return editorial.save(newEditorial);
    }

    @PutMapping(path ="/update",
            consumes = "application/json", produces = "application/json")
    public Editorial updateEditorial(@RequestBody Editorial updateEditorial) {
        return editorial.save(updateEditorial);
    }

    @DeleteMapping(path ="/delete/{id}")
    Iterable<Editorial> deleteEditorialbyId(@PathVariable("id") int id_ed) {
        try {
            editorial.deleteById(id_ed);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return editorial.findAll();

        }

    }

    /****
     * Busqueda por nombre
     * @param nombre
     * @return
     */
    @GetMapping(path = "name/{nombre}")
    public @ResponseBody
    Collection<Editorial> getEditorialByName(@PathVariable("nombre") String nombre) {
        return editorial.getEditorialByName(nombre);

    }
}
