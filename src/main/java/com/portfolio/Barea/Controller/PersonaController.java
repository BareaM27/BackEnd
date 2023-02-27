package com.portfolio.Barea.Controller;

import com.portfolio.Barea.Entity.Persona;
import com.portfolio.Barea.Service.PersonaService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(com.portfolio.Barea.Service.PersonaService personaService) {
        this.personaService = personaService;
    }

//GET//READ
    @GetMapping("/traer")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }

//POST//CREATE
    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

//PUT//UPDATE
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("foto") String nuevaFoto,
                                @RequestParam("sobre_mi") String nuevaSobre_mi){
        Persona persona = personaService.findPersona(id);
        persona.setFoto(nuevaFoto);
        persona.setSobre_mi(nuevaSobre_mi);
        
        personaService.savePersona(persona);
        return persona;
    }

//DELETE//DELETE
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "la persona fue borrada correctamente";
    }

}
