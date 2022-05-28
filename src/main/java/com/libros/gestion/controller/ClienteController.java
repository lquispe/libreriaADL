package com.libros.gestion.controller;

import com.libros.gestion.model.Cliente;
import com.libros.gestion.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/****
 * Crud de Cliente
 */
@RestController
@RequestMapping(path = "/libreria/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepo;

    @PostMapping(path = "/create",
            consumes = "application/json", produces = "application/json")
    public Cliente createCategoria(@RequestBody Cliente newCliente) {

        System.out.println( newCliente.getFecNacimiento());
        return clienteRepo.save(newCliente);
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Cliente> getAllCliente() {
        return clienteRepo.findAll();
    }


    @PutMapping(path = "/update",
            consumes = "application/json", produces = "application/json")
    public Cliente updateCliente(@RequestBody Cliente cliente_update) {
        return clienteRepo.save(cliente_update);
    }

    @DeleteMapping(path = "/delete/{id}")
    Iterable<Cliente> deleteCliente(@PathVariable("id") int id_cliente) {
        try {
            clienteRepo.deleteById(id_cliente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return clienteRepo.findAll();

        }

    }
}
