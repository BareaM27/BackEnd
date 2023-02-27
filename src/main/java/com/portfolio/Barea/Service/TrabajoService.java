package com.portfolio.Barea.Service;

import com.portfolio.Barea.Entity.Trabajo;
import com.portfolio.Barea.Repository.ITrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TrabajoService {

    private final ITrabajoRepository itrabajorepository;

    @Autowired
    public TrabajoService(com.portfolio.Barea.Repository.ITrabajoRepository itrabajorepository) {
        this.itrabajorepository = itrabajorepository;
    }

//CREATE
    
    public Trabajo saveTrabajo(Trabajo trabajo) {
        return itrabajorepository.save(trabajo);
    }

//READ
    
    public List<Trabajo> getTrabajo() {
        return itrabajorepository.findAll();
    }

//DELETE
    
    public void deleteTrabajo(Long id) {
        itrabajorepository.deleteById(id);
    }

//GET BY ID
    
    public Trabajo findTrabajo(Long id){
        return itrabajorepository.findById(id).orElse(null);
    }
    
}
