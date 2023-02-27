package com.portfolio.Barea.Controller;

import com.portfolio.Barea.Entity.Trabajo;
import com.portfolio.Barea.Service.TrabajoService;
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
@RequestMapping("/trabajo")
public class TrabajoController {
    
    private final TrabajoService trabajoService;

    public TrabajoController(TrabajoService trabajoService) {
        this.trabajoService = trabajoService;
    }
    
//GET//READ
    @GetMapping("/traer")
    public List<Trabajo> getTrabajo(){
        return trabajoService.getTrabajo();
    }

//POST//CREATE
    @PostMapping("/crear")
    public String createTrabajo(@RequestBody Trabajo trabajo){
        trabajoService.saveTrabajo(trabajo);
        return "El trabajo fue creado correctamente";
    }

//PUT//UPDATE
    @PutMapping("/editar/{id}")
    public Trabajo editTrabajo(@PathVariable Long id,
                                @RequestParam("img_logo") String nuevoImg_logo,
                                @RequestParam("nombre_empresa") String nuevoNombre_empresa,
                                @RequestParam("fecha") String nuevaFecha,
                                @RequestParam("descripcion") String nuevaDescripcion){
        Trabajo trabajo = trabajoService.findTrabajo(id);
        trabajo.setImg_logo(nuevoImg_logo);
        trabajo.setNombre_empresa(nuevoNombre_empresa);
        trabajo.setFecha(nuevaFecha);
        trabajo.setDescripcion(nuevaDescripcion);
        
        trabajoService.saveTrabajo(trabajo);
        return trabajo;
    }
        

//DELETE//DELETE
    @DeleteMapping("/borrar/{id}")
    public String deleteTrabajo(@PathVariable Long id){
        trabajoService.deleteTrabajo(id);
        return "El trabajo se borro correctamente";
    }

}
