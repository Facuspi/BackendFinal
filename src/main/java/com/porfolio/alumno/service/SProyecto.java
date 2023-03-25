package com.porfolio.alumno.service;

import com.porfolio.alumno.entity.Proyecto;
import com.porfolio.alumno.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
        
    @Autowired
    public RProyecto proyRepo;
    
    public List<Proyecto> verProyectos(){
        List<Proyecto> listaProy= proyRepo.findAll();
        return listaProy;
    }
    
    public void crearProyecto (Proyecto fort){
        proyRepo.save(fort);
    }
    
    public void editarProyecto (Proyecto fort){
        proyRepo.save(fort);
    }
    
    
    public void borrarProyecto (int id){
        proyRepo.deleteById(id);
    }
    
    public Proyecto buscarProyecto(int id){
        Proyecto proy = proyRepo.findById(id).orElse(null);
        return proy;
    }
    
    
    
}
