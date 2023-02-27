package com.portfolio.Barea.Repository;
import com.portfolio.Barea.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Long> {
    
}
