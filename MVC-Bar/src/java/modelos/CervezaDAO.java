/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Practicas
 */
public class CervezaDAO {
   
    private ArrayList<Cerveza> rubias=new  ArrayList<Cerveza>();
    private ArrayList<Cerveza> ambar=new ArrayList<Cerveza>();
    private ArrayList<Cerveza> negras=new  ArrayList<Cerveza>();
   
    public CervezaDAO() {
   
        
        rubias.add(new Cerveza("Pale Large","Una cerveza muy rica, bla bla bla"));
        rubias.add(new Cerveza("Pilsner","Una cerveza muy rica, bla bla bla"));
        rubias.add(new Cerveza("Helles","Una cerveza muy rica, bla bla bla"));
        rubias.add(new Cerveza("Golden Ale","Una cerveza muy rica, bla bla bla"));
        
        negras.add(new Cerveza("Schwarzbier","Una cerveza muy rica, bla bla bla"));
        negras.add(new Cerveza("Porter","Una cerveza muy rica, bla bla bla"));
        negras.add(new Cerveza("Imperial stout","Una cerveza muy rica, bla bla bla"));
        negras.add(new Cerveza("Bock","Una cerveza muy rica, bla bla bla"));
        
        ambar.add(new Cerveza("Ambar Classic","Una cerveza muy rica, bla bla bla"));
        ambar.add(new Cerveza("Ambar Radler","Una cerveza muy rica, bla bla bla"));
        ambar.add(new Cerveza("Ambar Export","Una cerveza muy rica, bla bla bla"));
        ambar.add(new Cerveza("Ambar Negra","Una cerveza muy rica, bla bla bla"));
        
    
    }
    
    
    public ArrayList<Cerveza> recomendar(short tipo) {
        
        ArrayList<Cerveza> cervezas=new ArrayList<Cerveza>();
        switch(tipo){
            case 1: cervezas=rubias;
                    break;
            case 2: cervezas=ambar;
                    break;
            case 3: cervezas=negras; 
                    break;
        }
        return cervezas;
    }
    
    
}
