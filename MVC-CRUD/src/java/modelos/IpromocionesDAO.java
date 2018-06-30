/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import pojos.Promocion;

/**
 *
 * @author Practicas
 */
public interface IpromocionesDAO {
    
    public ArrayList<Promocion>  getAll();
    public Promocion getById(int id);
    public boolean insert(Promocion p);
    public boolean update(Promocion p);
    public boolean delete(int id);
    
}
