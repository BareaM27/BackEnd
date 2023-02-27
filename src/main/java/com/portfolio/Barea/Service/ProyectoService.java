package com.portfolio.Barea.Service;

import com.portfolio.Barea.Entity.Proyecto;
import com.portfolio.Barea.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService {

    private final IProyectoRepository iproyectorepository;

    @Autowired
    public ProyectoService(com.portfolio.Barea.Repository.IProyectoRepository iproyectorepository) {
        this.iproyectorepository = iproyectorepository;
    }

//CREATE
    
    public Proyecto saveProyecto(Proyecto proyecto) {
        return iproyectorepository.save(proyecto);
    }
    
//READ
    
    public List<Proyecto> getProyecto(){
        return iproyectorepository.findAll();
    }

//DELETE
    
    public void deleteProyecto(Long id) {
        iproyectorepository.deleteById(id);
    }
    
//GET BY ID
    
    public Proyecto findProyecto(Long id){
        return iproyectorepository.findById(id).orElse(null);
    }

}
