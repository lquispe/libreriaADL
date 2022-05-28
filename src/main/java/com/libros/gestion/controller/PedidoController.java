package com.libros.gestion.controller;

import com.libros.gestion.model.reportes.ReportePedidoPendient;
import com.libros.gestion.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/libreria/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping(path = "/{estado}")
    public @ResponseBody
    Iterable<ReportePedidoPendient> getPedidosEstado(@PathVariable("estado") char estado) {
        return pedidoRepository.getPedidoLibro(estado);

    }

}
