package com.porfolio.alumno.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

public class DtoExperiencia {

    @NotBlank
    private String puesto;
    @NotBlank
    private String empresa;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date inicio;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fin;
    @NotBlank
    @Lob
    @Column(length = 5000)
    private String descripcion;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String puesto, String empresa, Date inicio, Date fin, String descripcion) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
