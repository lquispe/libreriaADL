package com.libros.gestion.model;

import javax.persistence.*;

@Entity
public class Libro {
    @Id@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "editorial_id", referencedColumnName = "id")
    private Editorial editorial;

    private Integer edicion;
    private String imagen;

    @OneToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Autor autor;

    private Double precio;
    private Integer stock;

    @OneToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }



    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


}
