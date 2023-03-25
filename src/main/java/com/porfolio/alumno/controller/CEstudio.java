
package com.porfolio.alumno.controller;

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
@RequestMapping("estudio")
@CrossOrigin (origins = "http://localhost:4200")
public class CEstudio {
    
    @Autowired
    public SEstudio estudioServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estudioServ.verEstudios();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id){
        return estudioServ.buscarEstudio(id);
    }
    
    @PostMapping ("/crear")
    public void agregarEstudio (@RequestBody Estudio est) {
        estudioServ.crearEstudio(est);
    }
    
     @DeleteMapping ("/borrar/{id}")
     public void eliminarEstudio (@PathVariable int id){
         estudioServ.borrarEstudio(id);
     }
     
     @PutMapping("/editar")
     public void editarEstudio (@RequestBody Estudio est){
         estudioServ.editarEstudio(est);
     }
}
