package com.libros.gestion.controller;

import com.libros.gestion.model.reportes.VentaCliente;
import com.libros.gestion.model.reportes.VentasMes;
import com.libros.gestion.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lili
 * @Date 30/5/22
 */

@RestController
@RequestMapping(path = "/libreria/listadoFact")
public class FacturaController {
    @Autowired
    private FacturaRepository facturaRepository;

    @GetMapping(path = "/venMes")
    public @ResponseBody
    Iterable<VentasMes> getListadoVentas() {
        return facturaRepository.getVentasDesc();
    }


    @GetMapping(path = "/venCliente")
    public @ResponseBody
    Iterable<VentaCliente> getListadoVentaCli() {
        return facturaRepository.getVentasCli();
    }


}
