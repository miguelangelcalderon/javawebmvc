/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author Practicas
 */
public class Promocion {

   private int id;
   private String nombre;
   private String descripcion;
   private String foto;
   private String direccion;
   private String localidad;
   private Provincia provincia;

    public Promocion() {
        
        this.provincia=new Provincia(0,"");
    }
   
   
   
    public Promocion(int id, String nombre, String descripcion, String foto, String direccion, String localidad, Provincia provincia) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
    }

 
  

    public int getId()                 {return id;}
    public String getNombre()           {return nombre;}
    public String getDescripcion()      {return descripcion;}
    public String getFoto()             {return foto;}
    public String getDireccion()        {return direccion;}
    public String getLocalidad()        {return localidad;}
  

    public void setId(int cod) {
        this.id = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }



    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

  
   
    
        
        
}
