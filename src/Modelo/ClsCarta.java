    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author ronny
 */
public class ClsCarta {
    
    
    private int numero;
    private String nombre;
      
    
    //constructor

    public ClsCarta(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    //constructor randum
   
    
    //get set

    public int numero() {
        return numero;
    }

    public void numero(int numero) {
        this.numero = numero;
    }

    public String nombre() {
        return nombre;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }
  
}
