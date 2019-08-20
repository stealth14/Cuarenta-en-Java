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
 * @author ronniecajas
 */
public class ClsMaquina extends ClsJugador{
  
  private List<ClsCarta> cartas;
   private List<ClsCarta> carton;
   private int puntaje;
   
   private List<ClsCarta> jugada_mis_cartas;
    
   private List<ClsCarta> jugada_cartas_mesa;
   
   //get set jugada

    public List<ClsCarta> JugadaMisCartas() {
        return jugada_mis_cartas;
    }

    public void JugadaMisCartas(List<ClsCarta> jugada_mis_cartas) {
        this.jugada_mis_cartas = jugada_mis_cartas;
    }

    public List<ClsCarta> JugadaCartasMesa() {
        return jugada_cartas_mesa;
    }

    public void JugadaCartasMesa(List<ClsCarta> jugada_cartas_mesa) {
        this.jugada_cartas_mesa = jugada_cartas_mesa;
    }
   
   
    
    //coneccion con el controlador
    ClsControlador miControlador;

    //constructores

      public ClsMaquina()
      {
        this.cartas =new ArrayList<>();
        this.carton =new ArrayList<>();
        this.puntaje=0;
        this.jugada_cartas_mesa= new ArrayList<>();
        this.jugada_mis_cartas=new ArrayList<>();
      }
    
    public ClsMaquina(ClsControlador miControlador)
    {    
    this.miControlador= miControlador;
    }
    
    //get set puntaje

    public int puntaje() {
        return puntaje;
    }

    public void puntaje(int mi_puntaje) {
        
        //se agrega valor al puntaje
        this.puntaje += mi_puntaje;
        
    }
    
    
    //get set carton
    public List<ClsCarta> carton() {
        return carton;
    }
    
    //get set cartas

    public List<ClsCarta> cartas() {
        return cartas;
    }
    
    public void cartas(List<ClsCarta> mis_cartas) {
        this.cartas = mis_cartas;
    }
        //get set carta especifica
    public ClsCarta carta(int indice)
    {
        return cartas.get(indice);
    }
    public void carta(ClsCarta carta)
    {
        cartas.add(carta);
        
    }
    
    
    //get set controlador
    public ClsControlador miControlador() {
        
        return miControlador;
        
    }

    public void miControlador(ClsControlador miControlador) {
        this.miControlador = miControlador;
    }   

    //cerebro 
    
    public int seleccion()
    {
       int seleccion = 0;
       
        //generar seleccion random    
        seleccion=(int) (Math.random() * (cartas.size()-1));
            
        return seleccion;
    }
    
  
  
    
}
