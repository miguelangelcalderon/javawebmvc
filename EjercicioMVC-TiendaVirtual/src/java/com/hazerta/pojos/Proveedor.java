/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.pojos;

/**
 *
 * @author Alumno
 */
public class Proveedor {
    private int id_proveedor;
    private String nombre;
    private String logo;

    public Proveedor(int id_proveedor, String nombre, String logo) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.logo = logo;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
    
}
