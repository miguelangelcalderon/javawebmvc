/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Curso Mañana
 */
public class DataBaseException extends Exception {
    
    public DataBaseException() { super(); }
    public DataBaseException(String mensaje,Throwable causa) 
        { super(mensaje,causa); }
    public DataBaseException(String mensaje) 
        { super(mensaje); }
    public DataBaseException(Throwable causa) 
        { super(causa); }
    
}
