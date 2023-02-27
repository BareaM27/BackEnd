package com.portfolio.Barea.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String img_logo;
    
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String nombre_empresa;
    
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String fecha;
    
    @NotNull
    @Size(min = 1, message = "Añadir elemento")
    private String descripcion;

    public Trabajo(Long id, String img_logo, String nombre_empresa, String fecha, String descripcion) {
        this.id = id;
        this.img_logo = img_logo;
        this.nombre_empresa = nombre_empresa;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg_logo() {
        return img_logo;
    }

    public void setImg_logo(String img_logo) {
        this.img_logo = img_logo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
