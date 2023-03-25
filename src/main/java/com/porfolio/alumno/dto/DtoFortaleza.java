
package com.porfolio.alumno.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class DtoFortaleza {
    @NotBlank
    private String nombre;
     @NotNull
    private int porcentaje;

    public DtoFortaleza() {
    }

    public DtoFortaleza(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
     
     
    
}
