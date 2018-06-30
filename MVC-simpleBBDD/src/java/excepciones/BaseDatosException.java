/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Practicas
 */
public class BaseDatosException extends Exception {
    
    public BaseDatosException() {
        super();
    }
    public BaseDatosException(String mensaje){
        super(mensaje);
    }
    public BaseDatosException(Throwable causa){
        super(causa);
    }
    public BaseDatosException(String mensaje,Throwable causa) {
        super(mensaje,causa);
    }
}
