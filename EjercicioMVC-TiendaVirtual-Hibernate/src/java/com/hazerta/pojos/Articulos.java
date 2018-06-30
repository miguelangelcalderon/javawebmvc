package com.hazerta.pojos;
// Generated 11-jun-2018 19:54:14 by Hibernate Tools 4.3.1



/**
 * Articulos generated by hbm2java
 */
public class Articulos  implements java.io.Serializable {


     private Integer idArticulo;
     private Categorias categorias;
     private Proveedores proveedores;
     private String nombre;
     private String descripcion;
     private float pvp;
     private short stock;
     private String foto;
     private Boolean novedad;
     private Boolean oferta;
     private int cantidadCarrito;

    public int getCantidadCarrito() {
        return cantidadCarrito;
    }

    public void setCantidadCarrito(int cantidadCarrito) {
        this.cantidadCarrito = cantidadCarrito;
    }
     
    public Articulos() {
    }

	
    public Articulos(Categorias categorias, Proveedores proveedores, String nombre, String descripcion, float pvp, short stock, String foto) {
        this.categorias = categorias;
        this.proveedores = proveedores;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pvp = pvp;
        this.stock = stock;
        this.foto = foto;
    }
    public Articulos(Categorias categorias, Proveedores proveedores, String nombre, String descripcion, float pvp, short stock, String foto, Boolean novedad, Boolean oferta) {
       this.categorias = categorias;
       this.proveedores = proveedores;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.pvp = pvp;
       this.stock = stock;
       this.foto = foto;
       this.novedad = novedad;
       this.oferta = oferta;
    }
   
    public Integer getIdArticulo() {
        return this.idArticulo;
    }
    
    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }
    public Categorias getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPvp() {
        return this.pvp;
    }
    
    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    public short getStock() {
        return this.stock;
    }
    
    public void setStock(short stock) {
        this.stock = stock;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Boolean getNovedad() {
        return this.novedad;
    }
    
    public void setNovedad(Boolean novedad) {
        this.novedad = novedad;
    }
    public Boolean getOferta() {
        return this.oferta;
    }
    
    public void setOferta(Boolean oferta) {
        this.oferta = oferta;
    }




}

