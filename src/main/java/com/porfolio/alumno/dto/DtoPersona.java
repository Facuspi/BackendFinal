
package com.porfolio.alumno.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotBlank;


public class DtoPersona {
        @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String posicion;
    @NotBlank
    private String ciudad;
    @NotBlank
    private String pais;
    @NotBlank
    private String urlFoto;
    @NotBlank
    private String urlBanner;
   @NotBlank     
    @Lob
    @Column(length = 5000)
    private String sobreMi;
    @NotBlank
    private String urlGithub;

    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String posicion, String ciudad, String pais, String urlFoto, String urlBanner, String sobreMi, String urlGithub) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.urlFoto = urlFoto;
        this.urlBanner = urlBanner;
        this.sobreMi = sobreMi;
        this.urlGithub = urlGithub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getUrlBanner() {
        return urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }
    
    
}
