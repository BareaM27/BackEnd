package com.portfolio.Barea.Repository;
import com.portfolio.Barea.Entity.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrabajoRepository extends JpaRepository<Trabajo,Long> {
    
}
