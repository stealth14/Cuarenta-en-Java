
package Controlador;

//modelo
import Modelo.ClsCarta;
import Modelo.ClsJugador;
import Modelo.ClsMaquina;
import Modelo.ClsTablero;

//vista
import Vista.WinTablero;
import java.awt.Component;

import java.awt.Panel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;

import java.util.Arrays;
import java.util.Collections;





public class ClsControlador {
    //vista 
    private WinTablero vista_tablero;
    //modelo
    private ClsJugador user;
    
    private ClsMaquina maquina;
            
    private ClsTablero logica_tablero;
    //constructor
    
    public ClsControlador()
    {
        
    vista_tablero= new WinTablero();
    user=new ClsJugador();
    maquina= new ClsMaquina();
    vista_tablero=new WinTablero();
    logica_tablero=new ClsTablero();
    
    }

//getset  maquina

    public ClsMaquina Maquina() {
        return maquina;
    }

    public void Maquina(ClsMaquina maquina) {
        this.maquina = maquina;
    }
    

    public WinTablero vista_tablero() {
        return vista_tablero;
    }

    public void vista_tablero(WinTablero vista_tablero) {
        this.vista_tablero = vista_tablero;
    }

    public ClsJugador jugador() {
        return user;
    }

    public void jugador(ClsJugador jugador) {
        this.user = jugador;
    }

    public ClsTablero logica_tablero() {
        return logica_tablero;
    }

    public void logica_tablero(ClsTablero logica_tablero) {
        this.logica_tablero = logica_tablero;
    }

 
    
    
//GESTION DE JUGABILIDAD
           
    public void crear_mazo()
{        
        String letra_inicial = null;
        
    for(int numero=1;numero<=7;numero++)
    {
        for(int figura=1;figura<=4;figura++)
            {   
            if(figura==1)
                {  
                letra_inicial="C";
                logica_tablero.cartaMazo(new ClsCarta(numero,numero+letra_inicial));
                }

            if(figura==2)
                {
                letra_inicial="D";
                logica_tablero.cartaMazo(new ClsCarta(numero,numero+letra_inicial));
                }
            if(figura==3)
                {
                letra_inicial="H";
                logica_tablero.cartaMazo(new ClsCarta(numero,numero+letra_inicial));
                }   
            if(figura==4)
                {
                letra_inicial="S";
                logica_tablero.cartaMazo(new ClsCarta(numero,numero+letra_inicial));
                }
            }   
    }
    
    
    
}       
    
   //damos 5 primeras cartas al jugador
    public void reparticion_inicio_de_ronda()
    {
        if(!mazoVacío())
        {
            //le damos 5 cartas aleatorias al jugador
        
            dar_5_cartas_aleatorias(user.cartas());
        
            //le mostramos sus cartas
        
            for(int carta=0;carta< user.cartas().size();carta++)
            {
                vista_tablero.PaneCartasPlayer.add(crear_label(user.carta(carta)));
                vista_tablero.actualizar_panel(vista_tablero.PaneCartasPlayer);
            }   
        
            //le damos 5 cartas aleatorias a la maquina
        
            dar_5_cartas_aleatorias(maquina.cartas());
            
        }else
            {
                    
            logica_tablero.mazo().addAll(logica_tablero.Pila());
                    
            //le damos 5 cartas aleatorias al jugador
        
            dar_5_cartas_aleatorias(user.cartas());
        
            //le mostramos sus cartas
        
            for(int carta=0;carta< user.cartas().size();carta++)
            {
                vista_tablero.PaneCartasPlayer.add(crear_label(user.carta(carta)));
                vista_tablero.actualizar_panel(vista_tablero.PaneCartasPlayer);
            }   
        
            //le damos 5 cartas aleatorias a la maquina
        
            dar_5_cartas_aleatorias(maquina.cartas());
            
             
            }
        
    }
    

    
    //jugada
 
         public String soporte=" ";

    public String hayJugada()
    {   
        String queJugada=" ";
    if(!user.JugadaMisCartas().isEmpty()){
        if(!hayCartaALaMesa())//si el user no toma cartas de la mesa solo podrá ejecutar "carta a la mesa"
        {
   
                vista_tablero.BtnALaMesa.setEnabled(false);
                
                if(hayCaida())
                    {
                        vista_tablero.BtnCaida.setEnabled(true);
                        queJugada="caida";
                    }else
                    {
                        vista_tablero.BtnCaida.setEnabled(false);
                    }
                  
                    if(haySecuencia())
                    {
                        
                        vista_tablero.BtnSecuencia.setEnabled(true);
                        queJugada="secuencia";
                    }else
                    {
                        vista_tablero.BtnSecuencia.setEnabled(false);
                    
                    }
                        
                    if(haySuma())
                    {
                        vista_tablero.BtnSuma.setEnabled(true);
                        queJugada="suma";
                    }else
                    {
                        vista_tablero.BtnSuma.setEnabled(false);
   
                    }
                    
        }else
        {
            
            vista_tablero.BtnALaMesa.setEnabled(true);
            
        }
        
    }
        return queJugada;
        
    } 
    
     //gestion de la maquina
    
    public String contraAtaque()
    {   
        
        String nombre=null;
        if(!maquina.cartas().isEmpty())//verifica si la mano de la maquina esta vacía
        
        {
        //la maquina elige una de sus cartas de forma aleatoria 
        ClsCarta seleccion=maquina.cartas().get(maquina.seleccion());
        
        nombre=seleccion.nombre();
        
        // la pone en la mesa
        mover_carta(maquina.cartas(), logica_tablero.cartas_mesa(),seleccion);
        
        //la carta se muestra
       vista_tablero.PaneCartasMesa.add(crear_label(seleccion));
       
       vista_tablero.actualizar_panel(vista_tablero.PaneCartasMesa);
        }
        
        //retorna el nombre para saber que carta fue de la maquina
       return nombre;
        
    }   
    
    
    public void finDeRonda()
    {
        if(hayFinDeRonda()){
        //conteo de final de ronda
        conteoCarton(user.carton(), user.puntaje());
        conteoCarton(maquina.carton(), maquina.puntaje());
        
        //despues de otorgar el putaje por los cartones estos se convierten en cartas 
        //comunes que pueden ser agregadas al mazo nuevamente para una nueva reparticion
        
        logica_tablero.Pila().addAll(user.carton());
        logica_tablero.Pila().addAll(maquina.carton());
        
        //los cartones ahora estan vacios
        user.carton().clear();
        user.carton().clear();
        
        //reparticion de cartas
        reparticion_inicio_de_ronda();
        }
        
    }
    
//GESTION DE LA VISTA
    //creacion dinamica de jcomponents
    
        //recibe String con nombre de carta y retorna un ImageIcon
private ImageIcon identificar_apariencia(ClsCarta carta)
{   
    ImageIcon icono= new ImageIcon(getClass().getResource("/Vista/imagenes/"+carta.nombre()+".png"));
    
    return icono;
}    
    

        //recibe una carta retorna un jlabel
private JButton crear_label(ClsCarta carta)
{
            //obtenemos la imagen 
    ImageIcon icono=identificar_apariencia(carta);

    JButton boton= new JButton(icono);
    
    vista_tablero.agrega_dimensiones(icono.getIconWidth(),icono.getIconHeight());
    
    vista_tablero.agrega_apariencia(boton,icono);
    
    vista_tablero.agrega_identidad(boton, carta.nombre());
    
    vista_tablero.agrega_comportamiento(boton);
    
    return boton;
}


    
// GESTION DEL MODELO

    //recibe atributo nombre y retorna objeto carta
    private ClsCarta identificar_carta(String nombre,List<ClsCarta> origen)
    {   
        ClsCarta seleccion=null;
        
         for(int carta=0;carta<origen.size();carta++)
        {               
            //el programa encuentra la carta que queremos
            if(origen.get(carta).nombre()==nombre)
            {
                
            seleccion=origen.get(carta);
            
            break;
            } 
        }
         //el programa entrega la carta
    return seleccion; 
    }
    
    //mover
     private void mover_carta(List <ClsCarta> origen,List <ClsCarta> destino,ClsCarta carta)
    {           
        destino.add(carta);
        origen.remove(carta);
    }
    private void recuperar_carta(List <ClsCarta> origen,List <ClsCarta> destino)
    {
        origen.add(destino.get(0));       
        destino.remove(0);
    }
    
    // intercala los objetos carta de una lista a otra
    private void intercalacion_excluyente_lista(List <ClsCarta> origen , List <ClsCarta> destino, ClsCarta carta )
    {
          //si no hay componentes en el destino no hay nada que el origen deba recuperar
       if(destino.size()!=0)
        {   
            //al parecen existen componentes en el destino entonces estos volveran al origen
            recuperar_carta(origen, destino);
        }
       
       //movemos carta al destino
        mover_carta(origen, destino, carta);
        
    }
//reparticion
    private void dar_5_cartas_aleatorias(List <ClsCarta> destino)
    {
        int rand;
        // 5 cartas al jugador
        for(int i=0;i<5;i++)
        {    
            //generar indice random    
            rand=(int) (Math.random() * (logica_tablero.mazo().size()-1));
            
            //movimiento de carta random
            mover_carta(logica_tablero.mazo(),destino,logica_tablero.mazo().get(rand));
        }

    }   
    
 
    
// GESTION en tiempo real
    
//seguimiento de cartas

       public void miCarta_miJugada(JButton boton,String nombre)
    {
vista_tablero.intercalacion_excluyente(vista_tablero.PaneCartasPlayer, vista_tablero.PaneJugadaMisCartas, boton);    
intercalacion_excluyente_lista(user.cartas(), user.JugadaMisCartas(), identificar_carta(nombre, user.cartas()));
        
    }
       
      //movimiento de carta entre miJugada y mesa

   public void miJugada_mesa(JButton boton , String nombre)
   {
       
vista_tablero.mover_boton(vista_tablero.PaneJugadaMisCartas, vista_tablero.PaneCartasMesa, boton);
mover_carta(user.JugadaMisCartas(), logica_tablero.cartas_mesa(), identificar_carta(nombre , user.JugadaMisCartas()));
       
   }   
   
         //intercalacion de cartas entre mesa y jugadaMesa

      public void mesa_jugadaMesa(JButton boton,String nombre)
    {
        
    vista_tablero.mover_boton(vista_tablero.PaneCartasMesa, vista_tablero.PaneJugadaCartasMesa, boton);
    mover_carta(logica_tablero.cartas_mesa(), user.JugadaCartasMesa() ,identificar_carta(nombre, logica_tablero.cartas_mesa()));    
        
    }
      
      
    public void jugadaMesa_mesa(JButton boton,String nombre)
   {
       
    vista_tablero.mover_boton(vista_tablero.PaneJugadaCartasMesa , vista_tablero.PaneCartasMesa, boton);   
    mover_carta(user.JugadaCartasMesa(), logica_tablero.cartas_mesa(), identificar_carta(nombre,user.JugadaCartasMesa()));  
       
   }
    
  
// análisis de jugada
            
    
                //verificacion de jugada disponible 
    
  private boolean haySuma()
  {
      
    boolean haySuma=false;
    
    ClsCarta miCarta;
    List <ClsCarta> miJugada = user.JugadaCartasMesa();
      
    miCarta = user.JugadaMisCartas().get(0);
    
  //suma
    int suma=0;
    
   for(int carta=0;carta<miJugada.size();carta++)
   {
       suma+=miJugada.get(carta).numero();
   }
   
        if(suma==miCarta.numero()&&miJugada.size()>1)
        {
       
          haySuma=true;
        
        }
        
    return haySuma;
    
  }
  
  
  public boolean mazoVacío()
  {
      boolean mazoVacío=false;
      if(logica_tablero.mazo().isEmpty())
      {
          
        mazoVacío=true;
      
      }
      
        return mazoVacío;
  }
  
  private boolean hayCaida()
  {
      boolean hayCaida=false;
      
        //apuntadores auxiliares
       
      List<ClsCarta> mesa=user.JugadaCartasMesa();
      
      List<ClsCarta> misCartas=user.JugadaMisCartas();
      
      //busqueda de carta con igual valor numerico 
      if(!misCartas.isEmpty()){
            if(misCartas.get(0).numero()==mesa.get(0).numero()&&mesa.size()==1)
                {
                
                    hayCaida=true;
               
                }
      }
      
       // 
        
      return hayCaida;
  }
  //verifica si la carta utilizada en la operacion perteneció a la carta en el ultimo turno que hizo 
  
  public boolean HayCaidaAlaMaquina(String historial)
  {
      boolean esDeLaMaquina=false;
      
      if(user.JugadaCartasMesa().size()==1 && historial.equals(user.JugadaCartasMesa().get(0).nombre()))   
      { 
            esDeLaMaquina=true;
            //se limpia el historial
            historial=null;
       
      }
      

      return esDeLaMaquina;
  }
  
  
  public boolean hayFinDeRonda()
  {
      boolean hayFinDeRonda=false;
      
      if(user.cartas().isEmpty()&&maquina.cartas().isEmpty())
      {
          
          hayFinDeRonda=true;
          
      }
      
      
      return hayFinDeRonda;
}

  
  public boolean haySecuencia()
  {      
      boolean haySecuencia=false;
      
      boolean hayCaida=false;
      
      ClsCarta inicio = null;
      
    //apuntadores auxiliares
    
      List<ClsCarta> mesa=user.JugadaCartasMesa();
      
      List<ClsCarta> misCartas=user.JugadaMisCartas();
      
    //
        List numeros=new ArrayList();

    //busqueda de carta caida 
    
    for(int carta=0;carta<mesa.size();carta++)
    {
        //rescatamos los numeros de las cartas en una lista dinamica para poder analizarlos posteriormente
        
        numeros.add(mesa.get(carta).numero());
        
        if(misCartas.get(0).numero()==mesa.get(carta).numero())
        {
            //carta caida es el inicio de la secuencia
            inicio=mesa.get(carta);
            //posible secuencia
            hayCaida=true;
            break;
        }
  
    }
    
    //ordena los numeros para su posterior verificación
      Collections.sort(numeros);
      
    int actual=0;
    int siguiente=0;
    
//recorre la lista numeros

for(int elemento=0;elemento<numeros.size();elemento++)
{
    if(elemento!=numeros.size()-1) //se excluye al ultimo elemento puesto que no existe su correspondiente n1
        {
        
            actual=(int) numeros.get(elemento);
            siguiente=(int) numeros.get(elemento+1);
            
            //verificamos si se cumple que para cada elemento n de "numeros" existe un n1 tal que n1=n+1.

            if( (actual+1)==siguiente&&numeros.size()>2) //lista numeros debe ser mayor que 2
            {
                
                haySecuencia=true;
                
            }
            
        }     
}
    
    return haySecuencia;
    
  }
  
  public boolean hayCartaALaMesa()
  {     
      boolean hayCartaALaMesa=false;
      
      if(user.JugadaCartasMesa().isEmpty())
      {
      hayCartaALaMesa=true;
      }
      return hayCartaALaMesa;
  }
  
  public void ejecucionCartaALaMesa()
  {
      mover_carta(user.JugadaMisCartas(), logica_tablero.cartas_mesa(), user.JugadaMisCartas().get(0));
      
      vista_tablero.mover_boton(vista_tablero.PaneJugadaMisCartas, vista_tablero.PaneCartasMesa, (JButton) vista_tablero.PaneJugadaMisCartas.getComponent(0));
      
  }
  
  public boolean HayCamposVacios()
  {
      boolean HayCamposVacios=false;
      
  if(user.JugadaMisCartas().isEmpty()&&user.JugadaCartasMesa().isEmpty());
  {
      HayCamposVacios=true;
  }
    
  return HayCamposVacios;
  
  }  
  public void ejecucionSecuencia()
  {
      alCarton();
      
        if(hayLimpieza())
      {
      
      puntaje(2);
      
      }
   
  }
  
  
  
  public void ejecucionSuma()
  {
    //cartas al carton
      alCarton(); 
      
      
      if(hayLimpieza())
      {
      
      puntaje(2);
      
      }
      
  }
  
  public void ejecucionCaida(String historial)
  {      
       //otorga 2 puntos en caso de caida a la maquina
          if(HayCaidaAlaMaquina(historial))
            {
            
            puntaje(2);
        
            }
        //cartas al carton
        alCarton();
                    
        //verifica si la jugada limpió la mesa, de ser así otorga otros 2 puntos 
        if(hayLimpieza())
        {
                            
        puntaje(2);
                            
        }  
        
         
      
  }

  //metodos usados en la ejecucion de la jugada
  
   private void alCarton()
   {
       //jugada mis cartas al carton
       user.carton().addAll(user.JugadaCartasMesa());
       user.JugadaCartasMesa().clear();
       
       //jugada cartas mesa al carton
       user.carton().addAll(user.JugadaMisCartas());
       user.JugadaMisCartas().clear();   
       
         //limpia los paneles de jugada
        resetPaneles();
   }
   
 
   //actualizacion de puntaje 
   
   private void puntaje(int incremento){
        //actualizacion de puntaje
       user.puntaje(incremento);
       
   }
     
   private boolean hayLimpieza()
   {
       return logica_tablero().cartas_mesa().isEmpty();
   }
    
   private void resetPaneles()
   {
          
       vista_tablero.PaneJugadaCartasMesa.removeAll();
       vista_tablero.actualizar_panel(vista_tablero.PaneJugadaCartasMesa);
       
       vista_tablero.PaneJugadaMisCartas.removeAll();
       vista_tablero.actualizar_panel(vista_tablero.PaneJugadaMisCartas);
   
   }
   
    public int puntaje()
    {
        
        return user.puntaje();
    }
    

    //otorga puntaje extra en funcion del carton hecho por el jugador 
    
    public void conteoCarton(List<ClsCarta> carton,int puntaje)
    {
        //gestion del carton
        int incrementoInicial=0;
        int incrementoAcumulativo=0;
        int incrementoTotal=0;
                
        if(carton.size()>19) //si hay mas de 19 cartones 
        {
            incrementoInicial=6;
            
           for (int punto=0;punto<carton.size()-20;punto++)
            {
                incrementoAcumulativo+=1;
            } 
            
        }
        
        incrementoTotal=incrementoInicial+incrementoAcumulativo;
        
         //si el incremento de puntake resulta impar ese valor sube al inmediato superior
        if(incrementoTotal%2!=0)
        {
            
        incrementoTotal+=1;
        
        }
        
        puntaje+=incrementoTotal;     
    }
    
     
}
   
 




