package com.portfolio.Barea.Controller;

import com.portfolio.Barea.Entity.Educacion;
import com.portfolio.Barea.Service.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    
//GET//READ
    @GetMapping("/traer")
    public List<Educacion> buscarTrabajos(){
        return educacionService.getEducacion();
    }

//POST//CREATE
    @PostMapping("/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        educacionService.saveEducacion(educacion);
        return "La educacion fue creada correctamente";
    }

//PUT//UPDATE
    @PutMapping("/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                    @RequestParam("img_logo") String nuevoImg_logo,
                                    @RequestParam("nombre_empresa") String nuevoNombre_empresa,
                                    @RequestParam("fecha") String nuevaFecha,
                                    @RequestParam("institucion") String nuevaInstitucion){
        Educacion educacion = educacionService.findEducacion(id);
        educacion.setLogo(nuevoImg_logo);
        educacion.setNombre(nuevoImg_logo);
        educacion.setFecha(nuevaFecha);
        educacion.setInstitucion(nuevaInstitucion);
        
        educacionService.saveEducacion(educacion);
        return educacion;
    }

//DELETE//DELETE
    @DeleteMapping("/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        educacionService.deleteEducacion(id);
        return "La educacion se borro correctamente";
    }
    
}
