package com.libros.gestion.model;

import javax.persistence.*;

@Entity
public class Editorial {

    @Id@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
