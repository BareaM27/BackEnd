package com.portfolio.Barea.Service;

import com.portfolio.Barea.Entity.Educacion;
import com.portfolio.Barea.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {

    private final IEducacionRepository ieducacionrepository;
    
    @Autowired
    public EducacionService(com.portfolio.Barea.Repository.IEducacionRepository ieducacionrepository) {
        this.ieducacionrepository = ieducacionrepository;
    }

//CREATE
    
    public Educacion saveEducacion(Educacion educacion) {
        return ieducacionrepository.save(educacion);
    }
    
//READ
    
    public List<Educacion> getEducacion(){
        return ieducacionrepository.findAll();
    }
    
//DELETE
    
    public void deleteEducacion(Long id){
        ieducacionrepository.deleteById(id);
    }

//GET BY ID
    
    public Educacion findEducacion(Long id){
        return ieducacionrepository.findById(id).orElse(null);
}
    
}
