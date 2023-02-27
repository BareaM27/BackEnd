package com.portfolio.Barea.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String captura;
        
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String nombre;
            
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String descripcion;

    public Proyecto(Long id, String captura, String nombre, String descripcion) {
        this.id = id;
        this.captura = captura;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaptura() {
        return captura;
    }

    public void setCaptura(String captura) {
        this.captura = captura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
