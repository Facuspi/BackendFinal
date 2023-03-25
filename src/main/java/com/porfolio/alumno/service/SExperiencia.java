
package com.porfolio.alumno.service;

import com.porfolio.alumno.entity.Experiencia;
import com.porfolio.alumno.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
    @Autowired
    public RExperiencia expRepo;
    
    public List<Experiencia> verExperiencias(){
        List<Experiencia> listaExp= expRepo.findAll();
        return listaExp;
    }
    
    public void crearExperiencia (Experiencia exp){
        expRepo.save(exp);
    }
    
    public void editarExperiencia (Experiencia exp){
        expRepo.save(exp);
    }
    
    public void borrarExperiencia (int id){
        expRepo.deleteById(id);
    }
    
    public Experiencia buscarExperiencia(int id){
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
    
}
