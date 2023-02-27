package com.portfolio.Barea.Controller;

import com.portfolio.Barea.Entity.Proyecto;
import com.portfolio.Barea.Service.ProyectoService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }  
    
//GET//READ
    @GetMapping("/traer")
    public List<Proyecto> buscarProyectos(){
        return proyectoService.getProyecto();
    }

//POST//CREATE
    @PostMapping("/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        proyectoService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente";
    }

//PUT//UPDATE
    @PutMapping("/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                                @RequestParam("captura") String nuevaCaptura,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("descripcion") String nuevaDescripcion){
        Proyecto proyecto = proyectoService.findProyecto(id);
        proyecto.setCaptura(nuevaCaptura);
        proyecto.setNombre(nuevoNombre);
        proyecto.setDescripcion(nuevaDescripcion);
        
    proyectoService.saveProyecto(proyecto);
    return proyecto;
    }

//DELETE//DELETE
    @DeleteMapping("/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        proyectoService.deleteProyecto(id);
        return "El proyecto se borro correctamente";
    }
    
}
