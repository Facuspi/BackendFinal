
package com.porfolio.alumno.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Estudio {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
     @NotBlank
    private String titulo;
     @NotNull
    @Temporal (TemporalType.DATE)
    private Date inicio;
     @NotNull
    @Temporal (TemporalType.DATE)
    private Date fin;
      @NotBlank
    private String institucion;

    public Estudio() {
    }

    public Estudio(String titulo, Date inicio, Date fin, String institucion) {
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.institucion = institucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }  
}