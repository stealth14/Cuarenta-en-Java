
package Controlador;

import Modelo.ClsCarta;
import Modelo.ClsJugador;
import Modelo.ClsMaquina;
import Modelo.ClsTablero;
import Vista.WinTablero;
import java.util.List;

/**
 *
 * @author ronny
 */
public class ClsMain {
  
    public static void main(String [] args)
    {
        new ClsMain().inicio_de_partida();  
    }
        
        private void inicio_de_partida()
    {        
        
    //llamado a las clases 
       ClsTablero logica_tablero =new ClsTablero();
       ClsJugador usuario= new ClsJugador();
       ClsMaquina maquina= new ClsMaquina();
       
       ClsControlador controlador= new ClsControlador();
      
    //relacion clase-controlador
        logica_tablero.setmiControlador(controlador);
       usuario.miControlador(controlador);
       maquina.miControlador(controlador);
    
    //relacion controlador-clase
        
        controlador.jugador(usuario);
        controlador.Maquina(maquina);
        controlador.logica_tablero(logica_tablero);
        
        
        
              java.awt.EventQueue.invokeLater
        (
        
                new Runnable()
                { 
                    public void run()
                    {
                        //apuntador
                        WinTablero vista=new WinTablero();
                        //relacion vista-controlador
                        vista.miControlador(controlador);
                        //relacion controlador-vista
                        controlador.vista_tablero(vista);
                        
                        //activa visivilidad
                        vista.setVisible(true);

                    }
        
                }
        );
        
    }
     
    
}
