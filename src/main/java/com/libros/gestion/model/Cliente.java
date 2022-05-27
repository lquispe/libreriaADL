package com.libros.gestion.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.libros.gestion.json.CustomDateDeserializer;
import com.libros.gestion.json.CustomDateSerializer;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {

  @Id@GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;

  private String nombres;
  private String apellidos;

  @OneToOne
  @JoinColumn(name = "tipo_doc_id", referencedColumnName = "id")
  private TipoDoc tipoDoc;

  private Long numDoc;

  @JsonProperty("fecNaciento")
  @JsonDeserialize(using = CustomDateDeserializer.class ,as=Date.class)
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date fecNacimiento;


  private String telefono;
  private String email;
  private String direccion;


  @OneToOne
  @JoinColumn(name = "genero_id", referencedColumnName = "id")
  private Genero genero;

  public Genero getGenero() {
    return genero;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public TipoDoc getTipoDoc() {
    return tipoDoc;
  }

  public void setTipoDoc(TipoDoc tipoDoc) {
    this.tipoDoc = tipoDoc;
  }

  public Long getNumDoc() {
    return numDoc;
  }

  public void setNumDoc(Long numDoc) {
    this.numDoc = numDoc;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }


  public Date getFecNacimiento() {
    return fecNacimiento;
  }

  public void setFecNacimiento(Date fecNacimiento) {
    this.fecNacimiento = fecNacimiento;
  }



}
