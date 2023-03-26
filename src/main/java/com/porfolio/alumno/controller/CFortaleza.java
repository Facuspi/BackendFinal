package com.porfolio.alumno.controller;

import com.porfolio.alumno.dto.DtoFortaleza;
import com.porfolio.alumno.entity.Fortaleza;
import com.porfolio.alumno.service.SFortaleza;
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
@RequestMapping("fortaleza")
@CrossOrigin(origins = "https://frontendfinal-1120b.web.app/")
public class CFortaleza {

    @Autowired
    public SFortaleza fortServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Fortaleza> veFortalezas() {
        return fortServ.verFortalezas();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Fortaleza verFortaleza(@PathVariable int id) {
        return fortServ.buscarFortaleza(id);
    }

    @PostMapping("/crear")
    public void agregarFortaleza(@RequestBody Fortaleza fort) {
        fortServ.crearFortaleza(fort);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarFortaleza(@PathVariable int id) {
        fortServ.borrarFortaleza(id);
    }

    @PutMapping("/editar")
    public void editaFortaleza(@RequestBody Fortaleza fort) {
        fortServ.editarFortaleza(fort);
    }

    @PutMapping("/editar/{id}")
    public void update(@PathVariable("id") int id, @RequestBody DtoFortaleza dtofort) {
        Fortaleza fort = fortServ.getOne(id).get();
        fort.setNombre(dtofort.getNombre());
        fort.setPorcentaje(dtofort.getPorcentaje());
       fortServ.editarFortaleza(fort);
    }

}
