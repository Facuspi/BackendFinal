
package com.porfolio.alumno.service;

import com.porfolio.alumno.entity.Estudio;
import com.porfolio.alumno.repository.REstudio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudio {
    
    @Autowired
    public REstudio estuRepo;
    
    public List<Estudio> verEstudios(){
        List<Estudio> listaEstudios= estuRepo.findAll();
        return listaEstudios;
    }
    
    public void crearEstudio (Estudio estu){
        estuRepo.save(estu);
    }
    
    public void editarEstudio (Estudio estu){
        estuRepo.save(estu);
    }
    
    public void borrarEstudio (int id){
        estuRepo.deleteById(id);
    }
    
    public Estudio buscarEstudio (int id){
        Estudio estu = estuRepo.findById(id).orElse(null);
        return estu;
    }
}
