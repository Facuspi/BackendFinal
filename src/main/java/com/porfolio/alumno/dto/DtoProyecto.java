package com.porfolio.alumno.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

public class DtoProyecto {

    @NotBlank
    private String nombre;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Lob
    @Column(length = 5000)
    @NotBlank
    private String descripcion;
    @NotBlank
    private String url;

    public DtoProyecto() {
    }

    public DtoProyecto(String nombre, Date fecha, String descripcion, String url) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.url = url;
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
