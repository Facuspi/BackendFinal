
package com.porfolio.alumno.security.repository;

import com.porfolio.alumno.security.entity.Rol;
import com.porfolio.alumno.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional <Rol> findByRolNombre(RolNombre rolNombre);
    
}
