package com.portfolio.Barea.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String nombre;
        
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String fecha;
            
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String institucion;
                
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String logo;

    public Educacion(Long id, String nombre, String fecha, String institucion, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.institucion = institucion;
        this.logo = logo;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
