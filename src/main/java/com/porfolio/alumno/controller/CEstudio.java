package com.porfolio.alumno.controller;

import com.porfolio.alumno.dto.DtoEstudio;
import com.porfolio.alumno.entity.Estudio;
import com.porfolio.alumno.service.SEstudio;
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
@RequestMapping("/estudio")
@CrossOrigin(origins = "https://frontendfinal-1120b.web.app")
public class CEstudio {

    @Autowired
    public SEstudio estudioServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Estudio> verEstudios() {
        return estudioServ.verEstudios();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id) {
        return estudioServ.buscarEstudio(id);
    }

    @PostMapping("/crear")
    public void agregarEstudio(@RequestBody Estudio est) {
        estudioServ.crearEstudio(est);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminarEstudio(@PathVariable int id) {
        estudioServ.borrarEstudio(id);
    }

    @PutMapping("/editar")
    public void editarEstudio(@RequestBody Estudio est) {
        estudioServ.editarEstudio(est);
    }

    @PutMapping("/editar/{id}")
    public void update(@PathVariable("id") int id, @RequestBody DtoEstudio dtoest) {
        Estudio est = estudioServ.getOne(id).get();
        est.setTitulo(dtoest.getTitulo());
        est.setInicio(dtoest.getInicio());
        est.setFin(dtoest.getFin());
        est.setInstitucion(dtoest.getInstitucion());
        estudioServ.editarEstudio(est);
    }
}
