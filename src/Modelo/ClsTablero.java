/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ClsControlador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronny
 */
public class ClsTablero {
    
    private List<ClsCarta> mazo;
    
    private List <ClsCarta> cartas_mesa;
    
    private List <ClsCarta> pila;
    
//getset de pila
    public List<ClsCarta> Pila() {
        return pila;
    }

    public void Pila(List<ClsCarta> pila) {
        this.pila = pila;
    }
    
    
    
    
    private ClsControlador miControlador; 
    
    public ClsTablero()
    {
    
    mazo= new ArrayList<>();
    cartas_mesa= new  ArrayList<>();
    pila=new ArrayList<>();
    
    }
    
    // get set controlador 

    public ClsControlador miControlador() {
        return miControlador;
    }

    public void setmiControlador(ClsControlador miControlador) {
        this.miControlador = miControlador;
    }
    
   
    
//get set mazo
    public List<ClsCarta> mazo() {
        return mazo;
    }

    public void mazo(List<ClsCarta> mazo) {
        this.mazo = mazo;
    }
    
 //get set carta mazo
    public ClsCarta cartaMazo(int indice)
    {
        return mazo.get(indice);
    }
    public void cartaMazo(ClsCarta carta)
    {
        mazo.add(carta);
        
    }   
//get set cartas tablero
    
    public List<ClsCarta> cartas_mesa() {
        return cartas_mesa;
    }

    public void cartas_mesa(List<ClsCarta> cartas_tablero) {
        this.cartas_mesa = cartas_tablero;
    }
    
}
