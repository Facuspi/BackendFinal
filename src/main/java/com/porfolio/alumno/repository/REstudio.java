package com.porfolio.alumno.repository;

import com.porfolio.alumno.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository <Estudio, Integer> {
    
}
