
package com.porfolio.alumno.controller;

import com.porfolio.alumno.entity.Experiencia;
import com.porfolio.alumno.service.SExperiencia;
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
@RequestMapping("experiencia")
@CrossOrigin (origins = "http://localhost:4200")
public class CExperiencia {
        
    @Autowired
    public SExperiencia expServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia  verExperiencia (@PathVariable int id){
        return expServ.buscarExperiencia(id);
    }
    
    @PostMapping ("/crear")
    public void agregarExperiencia (@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    
     @DeleteMapping ("/borrar/{id}")
     public void eliminarExperiencia (@PathVariable int id){
         expServ.borrarExperiencia(id);
     }
     
     @PutMapping("/editar")
     public void editaExperiencia (@RequestBody Experiencia exp){
         expServ.editarExperiencia(exp);
     }
    
}
