package com.libros.gestion.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Pedido {
    @Id@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    private Date fecInicioPedido;
    private Date fecUltimaModif;
    /*fecha de registro en la facturacion*/
    private Date fecRegistro;

    private char estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecInicioPedido() {
        return fecInicioPedido;
    }

    public void setFecInicioPedido(Date fecInicioPedido) {
        this.fecInicioPedido = fecInicioPedido;
    }

    public Date getFecUltimaModif() {
        return fecUltimaModif;
    }

    public void setFecUltimaModif(Date fecUltimaModif) {
        this.fecUltimaModif = fecUltimaModif;
    }

    public Date getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}

