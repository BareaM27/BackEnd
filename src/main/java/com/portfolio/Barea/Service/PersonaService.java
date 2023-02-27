package com.portfolio.Barea.Service;

import com.portfolio.Barea.Entity.Persona;
import com.portfolio.Barea.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {

    private final IPersonaRepository ipersonarepository;

    @Autowired
    public PersonaService(com.portfolio.Barea.Repository.IPersonaRepository ipersonarepository) {
        this.ipersonarepository = ipersonarepository;
    }
    
//CREATE

    public Persona savePersona(Persona persona) {
        return ipersonarepository.save(persona);
    }
    
//READ
    
    public List<Persona> getPersona(){
        return ipersonarepository.findAll();
    }

//DELETE

    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }
    
//GET BY ID
    
    public Persona findPersona(Long id){
        return ipersonarepository.findById(id).orElse(null);
    }

}
