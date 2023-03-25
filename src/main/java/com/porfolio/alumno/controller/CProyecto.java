
package com.porfolio.alumno.controller;

import com.porfolio.alumno.entity.Proyecto;
import com.porfolio.alumno.service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin (origins = "http://localhost:4200")
public class CProyecto {
        
    @Autowired
    public SProyecto proyServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> veProyetos(){
        return proyServ.verProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto  verProyecto (@PathVariable int id){
        return proyServ.buscarProyecto(id);
    }
    
    @PostMapping ("/crear")
    public void agregarProyecto (@RequestBody Proyecto proy) {
        proyServ.crearProyecto(proy);
    }
    
     @DeleteMapping ("/borrar/{id}")
     public void eliminarProyecto (@PathVariable int id){
         proyServ.borrarProyecto(id);
     }
     
     @PutMapping("/editar")
     public void editaProyecto (@RequestBody Proyecto proy){
         proyServ.editarProyecto(proy);
     }
    
    
}
