
package Vista;


//gestion eventos usuario
import java.awt.event.ActionEvent;
//edicion de jcomponents
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
//creacion dinamica de componentes

//enlace con el controlador
import Controlador.ClsControlador;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class WinTablero extends javax.swing.JFrame implements MouseListener{
    
    ClsControlador miControlador;
 
    
    public WinTablero() 
    {
        initComponents();
        
    }
    
        //guadrdado del historial 
    String historial=null;

    public String Historial() {
        return historial;
    }

    public void Historial(String historial) {
        this.historial = historial;
    }
    
    //constructor
    
           //enlace con controlador
    
    
    public ClsControlador miControlador() {
        return miControlador;
    }

    public void miControlador(ClsControlador miControlador) {
        this.miControlador = miControlador;
    }
    ///////////

    public JButton getBtnALaMesa() {
        return BtnALaMesa;
    }

    public void setBtnALaMesa(JButton BtnALaMesa) {
        this.BtnALaMesa = BtnALaMesa;
    }
    
    
    
    
    //get and set de jcomponents 
    public JButton getBtnMazo() {
        return BtnMazo;
    }

    public void setBtnMazo(JButton BtnMazo) {
        this.BtnMazo = BtnMazo;
    }

    public JButton getBtnPedirCartas() {
        return BtnPedirCartas;
    }

    public void setBtnPedirCartas(JButton BtnPedirCartas) {
        this.BtnPedirCartas = BtnPedirCartas;
    }

    public JPanel getPaneCartasPlayer() {
        return PaneCartasPlayer;
    }

    public void setPaneCartasPlayer(JPanel PaneCartasPlayer) {
        this.PaneCartasPlayer = PaneCartasPlayer;
    }

    public JPanel getPaneJugada() {
        return PaneJugadaMisCartas;
    }

    public void setPaneJugada(JPanel PaneJugada) {
        this.PaneJugadaMisCartas = PaneJugada;
    }
    //

    public JPanel getPaneCartasMesa() {
        return PaneCartasMesa;
    }

    public void setPaneCartasMesa(JPanel PaneCartasMesa) {
        this.PaneCartasMesa = PaneCartasMesa;
    }

    public JPanel getPaneJugadaMisCartas() {
        return PaneJugadaMisCartas;
    }

    public void setPaneJugadaMisCartas(JPanel PaneJugadaMisCartas) {
        this.PaneJugadaMisCartas = PaneJugadaMisCartas;
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMazo = new javax.swing.JButton();
        BtnPedirCartas = new javax.swing.JButton();
        BtnPedirCartas.setEnabled(false);
        PaneCartasPlayer = new javax.swing.JPanel();
        PaneCartasMesa = new javax.swing.JPanel();
        PaneJugadaCartasMesa = new javax.swing.JPanel();
        PaneJugadaMisCartas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnSupport = new javax.swing.JPanel();
        BtnCaida = new javax.swing.JButton();
        BtnCaida.setEnabled(false);
        BtnSecuencia = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnALaMesa = new javax.swing.JButton();
        LblEstadoUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuarenta en JAVA");
        setBackground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(1000, 500));

        BtnMazo.setText("Crear mazo de cartas");
        BtnMazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMazoActionPerformed(evt);
            }
        });

        BtnPedirCartas.setText("Repartir cartas");
        BtnPedirCartas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnPedirCartas.setPreferredSize(new java.awt.Dimension(150, 32));
        BtnPedirCartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedirCartasActionPerformed(evt);
            }
        });

        PaneCartasPlayer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PaneCartasPlayer.setMaximumSize(null);
        PaneCartasPlayer.setLayout(new java.awt.GridLayout(1, 0));

        PaneCartasMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PaneCartasMesa.setMaximumSize(null);
        PaneCartasMesa.setRequestFocusEnabled(false);
        PaneCartasMesa.setLayout(new java.awt.GridLayout(1, 0));

        PaneJugadaCartasMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PaneJugadaCartasMesa.setMaximumSize(null);
        PaneJugadaCartasMesa.setVerifyInputWhenFocusTarget(false);
        PaneJugadaCartasMesa.setLayout(new java.awt.GridLayout(1, 0));

        PaneJugadaMisCartas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PaneJugadaMisCartas.setPreferredSize(new java.awt.Dimension(119, 195));
        PaneJugadaMisCartas.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setText("CARTAS EN LA MESA");

        jLabel2.setText("TU JUGADA");

        jLabel3.setText("TUS CARTAS");

        BtnSupport.setLayout(new java.awt.CardLayout());

        BtnCaida.setText("Caida");
        BtnCaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCaidaActionPerformed(evt);
            }
        });

        BtnSecuencia.setEnabled(false);
        BtnSecuencia.setText("Secuencia");
        BtnSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSecuenciaActionPerformed(evt);
            }
        });

        BtnSuma.setEnabled(false);
        BtnSuma.setText("Suma");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnALaMesa.setEnabled(false);
        BtnALaMesa.setText("Carta a la mesa");
        BtnALaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnALaMesaActionPerformed(evt);
            }
        });

        LblEstadoUsuario.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        jLabel4.setText("Usuario:");

        jLabel5.setText("Clickea en las cartas para jugar!!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnMazo)
                                    .addComponent(BtnPedirCartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(417, 417, 417)
                                        .addComponent(BtnSupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnALaMesa))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnCaida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PaneJugadaMisCartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PaneJugadaCartasMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PaneCartasMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaneCartasPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(LblEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaneCartasMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaneJugadaMisCartas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneJugadaCartasMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMazo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnSuma)
                                    .addComponent(BtnSecuencia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnCaida)
                                    .addComponent(BtnALaMesa))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BtnPedirCartas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaneCartasPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        PaneCartasPlayer.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMazoActionPerformed
        
        miControlador.crear_mazo();
        
        //un mazo por partida
        BtnMazo.setEnabled(false);
        BtnPedirCartas.setEnabled(true);
        
    }//GEN-LAST:event_BtnMazoActionPerformed

    private void BtnPedirCartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedirCartasActionPerformed
        miControlador.reparticion_inicio_de_ronda();
        //solo 5 cartas por ronda
        BtnPedirCartas.setEnabled(false);
       
        
    }//GEN-LAST:event_BtnPedirCartasActionPerformed
    private void BtnALaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnALaMesaActionPerformed
        
        miControlador.ejecucionCartaALaMesa();
        //necesario para evitar null pointer exception
        BtnALaMesa.setEnabled(false);
        
         //mostrar puntaje
        LblEstadoUsuario.setText(String.valueOf(miControlador.puntaje()));
        
        //counter de la maquina
        historial=miControlador.contraAtaque();
        
        miControlador.finDeRonda();
       
    }//GEN-LAST:event_BtnALaMesaActionPerformed

    private void BtnSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSecuenciaActionPerformed

        miControlador.ejecucionSecuencia();
        BtnSecuencia.setEnabled(false);
        
         //mostrar puntaje
        LblEstadoUsuario.setText(String.valueOf(miControlador.puntaje()));
        
        
        //counter de la maquina
        historial=miControlador.contraAtaque();
        
        miControlador.finDeRonda();
    }//GEN-LAST:event_BtnSecuenciaActionPerformed

    private void BtnCaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCaidaActionPerformed
          //counter de la maquina
        
        historial=miControlador.contraAtaque();
        
        miControlador.ejecucionCaida(historial);
        
         //mostrar puntaje
        LblEstadoUsuario.setText(String.valueOf(miControlador.puntaje()));
        //una jugada por turno
        
        BtnCaida.setEnabled( false );
        
        
      
      
        
        miControlador.finDeRonda();

        
    }//GEN-LAST:event_BtnCaidaActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed

        miControlador.ejecucionSuma();
        BtnSuma.setEnabled(false);
         //mostrar puntaje
        LblEstadoUsuario.setText(String.valueOf(miControlador.puntaje()));
        
        //counter de la maquina
        historial=miControlador.contraAtaque();
        
        //hay fin de ronda
        miControlador.finDeRonda();
    }//GEN-LAST:event_BtnSumaActionPerformed
    
  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnALaMesa;
    public javax.swing.JButton BtnCaida;
    public javax.swing.JButton BtnMazo;
    public javax.swing.JButton BtnPedirCartas;
    public javax.swing.JButton BtnSecuencia;
    public javax.swing.JButton BtnSuma;
    public javax.swing.JPanel BtnSupport;
    public javax.swing.JLabel LblEstadoUsuario;
    public javax.swing.JPanel PaneCartasMesa;
    public javax.swing.JPanel PaneCartasPlayer;
    public javax.swing.JPanel PaneJugadaCartasMesa;
    public javax.swing.JPanel PaneJugadaMisCartas;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


    public void actionPerformed(ActionEvent e) 
    {
      
        
    }
    
//creacion de jlabels que representarán a cada carta 
      public JButton agrega_dimensiones(int ancho, int alto)
        {
            JButton boton = new JButton();
            
            boton.setOpaque(false);
            
            boton.setPreferredSize(new Dimension(ancho, alto));
            
            return boton;
        }
      
    public void agrega_identidad(JButton boton,String nombre)
    {       
        //tooltip llevara el nombre de la carta
            boton.setToolTipText(String.valueOf(nombre));
     
                
    }    
    
    public void agrega_apariencia(JButton boton,ImageIcon icono)
    {
        //icono
        boton.setIcon(icono);
    }
    
    
    
//gestion  interacciones del usuario
    
    //interaccion con raton
    

    
   public void agrega_comportamiento(JButton boton)
   {
       boton.addActionListener
        (
            new java.awt.event.ActionListener() 
            {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) 
                {   
                //codigo a ejecutarse al hacer click en un el label
                    if(boton.getParent()==PaneCartasPlayer)
                    {
                        miControlador.miCarta_miJugada(boton,boton.getToolTipText()); 
                        BtnALaMesa.setEnabled(true);
                        miControlador.hayJugada();
                       
                    }
                    
                        else
                        {  
                            if(boton.getParent()==PaneCartasMesa)
                            {
                                miControlador.mesa_jugadaMesa(boton, boton.getToolTipText());
                                miControlador.hayJugada();
                                
                                

                            }
                            else
                                {
                                    if(boton.getParent()==PaneJugadaCartasMesa)
                                    {
                                        miControlador.jugadaMesa_mesa(boton, boton.getToolTipText());
                                        miControlador.hayJugada();
                                        
                                      

                                    }
                                }   
                        }
                }
            }
        );
    
    }
   
   
   //intercalar mejorado
   public void intercalacion_excluyente(JPanel origen,JPanel destino,JButton boton)
   {     
       //si no hay componentes en el destino no hay nada que el origen deba recuperar
       if(destino.getComponentCount()!=0)
        {   
            //si existen componentes en el destino estos vuelven al origen
            recuperar_componente(origen, destino);
            
        }
       
       //movemos elemento al destino
        mover_boton(origen, destino, boton);
        
   }
   
   public void intercalacion_acumulativa(JPanel origen,JPanel destino,JButton boton)
   {
       if(boton.getParent()==origen)
       { 
           mover_boton(origen,destino, boton);
       }
       
       if(boton.getParent()==destino)
       { 
           mover_boton(destino,origen, boton);
       }
   }
   
 public void recuperar_componente(JPanel origen,JPanel destino)
    {
        origen.add(destino.getComponent(0));
        
        actualizar_panel(origen);
        
        destino.removeAll();
        
        actualizar_panel(destino);
    }
 

   // mover de un contenedor a otro
    public void mover_boton(JPanel origen,JPanel destino,JButton elemento)
    {
        //agregar al otro panel
        destino.add(elemento);
        actualizar_panel(origen);
        actualizar_panel(destino);
        //remover del panel actual
        origen.remove(elemento);
        actualizar_panel(origen);
        actualizar_panel(destino);
    }
    
   
    //actualizar vista del panel
    public void actualizar_panel(JPanel panel)
    {   
        panel.revalidate();
        panel.repaint();
    } 
    
  
//sobreescritura de metodos de MouseListener
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}
