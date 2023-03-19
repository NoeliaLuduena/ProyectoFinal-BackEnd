
package com.portfolio.nbl.Repository;


import com.portfolio.nbl.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);  
}
