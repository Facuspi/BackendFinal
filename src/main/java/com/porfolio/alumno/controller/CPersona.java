package com.porfolio.alumno.controller;

import com.porfolio.alumno.dto.DtoPersona;
import com.porfolio.alumno.entity.Persona;
import com.porfolio.alumno.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {

    @Autowired
    public SPersona persoServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id) {
        return persoServ.buscarPersona(id);
    }

    @PostMapping("/crear")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
    }

    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }

    @PutMapping("/editar/{id}")
    public void update(@PathVariable("id") int id, @RequestBody DtoPersona dtopers) {
        Persona pers = persoServ.getOne(id).get();
        pers.setNombre(dtopers.getNombre());
        pers.setApellido(dtopers.getApellido());
        pers.setPosicion(dtopers.getPosicion());
        pers.setCiudad(dtopers.getCiudad());
        pers.setPais(dtopers.getPais());
        pers.setUrlFoto(dtopers.getUrlFoto());
        pers.setUrlBanner(dtopers.getUrlBanner());
        pers.setSobreMi(dtopers.getSobreMi());
        pers.setUrlGithub(dtopers.getUrlGithub());
        persoServ.editarPersona(pers);
    }
}
