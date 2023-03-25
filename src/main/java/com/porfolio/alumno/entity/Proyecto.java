package com.porfolio.alumno.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;  
    @NotBlank
    private String nombre;
    @NotNull
    @Temporal (TemporalType.DATE)
    private Date fecha;
    @Lob
    @Column(length = 5000)
    @NotBlank
    private String descripcion;
    @NotBlank
    private String url;

    public Proyecto() {
    }

    public Proyecto(String nombre, Date fecha, String descripcion, String url) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.url = url;
    }

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    

   
}
