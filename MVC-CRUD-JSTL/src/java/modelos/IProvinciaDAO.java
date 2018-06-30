/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import pojos.Provincia;

/**
 *
 * @author Practicas
 */
public interface IProvinciaDAO {
    
    public ArrayList<Provincia>  getAll();
    public Provincia getById(int id);
    
}
