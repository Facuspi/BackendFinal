
package com.porfolio.alumno.service;

import com.porfolio.alumno.entity.Fortaleza;
import com.porfolio.alumno.repository.RFortaleza;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SFortaleza {
    
    @Autowired
    public RFortaleza fortRepo;
    
    public List<Fortaleza> verFortalezas(){
        List<Fortaleza> listaFort= fortRepo.findAll();
        return listaFort;
    }
    
    public void crearFortaleza (Fortaleza fort){
        fortRepo.save(fort);
    }
    
    public void editarFortaleza (Fortaleza fort){
        fortRepo.save(fort);
    }
    
    
    public void borrarFortaleza (int id){
        fortRepo.deleteById(id);
    }
    
    public Fortaleza buscarFortaleza(int id){
        Fortaleza fort = fortRepo.findById(id).orElse(null);
        return fort;
    }
    
    
}
