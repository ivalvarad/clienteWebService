

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iva
 */
import javax.swing.*;
import javax.xml.ws.BindingProvider;
public class Interfaz extends javax.swing.JFrame {
private final ecci_ahorcado.ECCIAhorcadoPort ahorcado;
boolean perdido=false;
boolean gano=false;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        ecci_ahorcado.ECCIAhorcado service = new ecci_ahorcado.ECCIAhorcado();
        ahorcado = service.getECCIAhorcadoPort();
        ((BindingProvider)ahorcado).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
        initComponents();
        service = new ecci_ahorcado.ECCIAhorcado();
        port = service.getECCIAhorcadoPort();
        ((BindingProvider)port).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Probar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Escriba una letra para juagar");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Incógnita");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Quedan:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("oportunidades");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    

   // private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
/*
        // TODO add your handling code here:
        boolean haGanado = false;
        boolean haPerdido = false;
        int oportunidades = 0;
        
        String num = jTextField1.getText();
        
        if(haGanado){
            jTextField1.setText("");
            jTextField1.setEditable(false);
            jTextField2.setText("GetLaIncognitaFromServicio"); //port.getIncognita();
            jTextField3.setText("");
            cambiarImagen(0); //cambiarla por una de triunfo
        }else{
            if(haPerdido){
                jTextField1.setText("");
                jTextField1.setEditable(false);
                jTextField2.setText("GetLaIncognitaFromServicio"); //port.getIncognita();
                jTextField3.setText("0");
                cambiarImagen(6);
            }else{
                    /*
                        tomo la letra ingresada
                        la envío a validar al servicio
                        pido la incognita al servicio y la refresco en la interfaz
                        pido las oportunidades al servicio y las refresco en la interfaz
                        con las oportunidades refresco la imagen
                        limpio el campo de la letra
                    */
                    //port.validar(num);
                    //jTextField2.setText(port.getIncognita());
                    //oportunidades = port.getOportunidades()
                    //jTextField3.setText(oportunidades);
                    //int oportunidadesLeft = 6 - oportunidades;
                    //cambiarImagen(oportunidadesLeft);
                    //haGanado = port.getHaGanado();
                    //haPerdido = port.getHaPerdido();
                   // jTextField1.setText("");
              //   }
          //  }*/        
        
        
        
        
        
        
    private void cambiarImagen(int num){   
        ImageIcon prueba = new ImageIcon();
        
            switch(num){
                case 7:
                    prueba = new ImageIcon(((new ImageIcon("ganar.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 6:
                    prueba = new ImageIcon(((new ImageIcon("0.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 5:
                    prueba = new ImageIcon(((new ImageIcon("1.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 4:
                    prueba = new ImageIcon(((new ImageIcon("2.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 3:
                    prueba = new ImageIcon(((new ImageIcon("3.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 2:
                    prueba = new ImageIcon(((new ImageIcon("4.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 1:
                    prueba = new ImageIcon(((new ImageIcon("5.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                break;
                case 0:
                    prueba = new ImageIcon(((new ImageIcon("6.png")).getImage()).getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH));
                    this.perdido=true;
                break;
            }
            
       
        jLabel1.setIcon(prueba);

    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       /* if(ahorcado.siGano()=="1"){//gano
        
        }else if( Integer.parseInt(ahorcado.getIntentos())   >0){//no ha ganado pero intentos son mayor que 0
        
        }else{
        
        }*/
        this.jLabel6.setText(ahorcado.getIncognita());
        ahorcado.validar(  this.jTextField1.getText());
        this.jLabel7.setText(    "."+ahorcado.siGano()+"."    );
        if(ahorcado.siGano().equals("1")){
        System.out.print("GANOOO");
        int num=Integer.parseInt(ahorcado.getIntentos());
        this.jLabel8.setText(ahorcado.getIntentos());
        this.cambiarImagen(7);
        
        }else{
            if(!perdido){

            int num=Integer.parseInt(ahorcado.getIntentos());
            this.jLabel8.setText(ahorcado.getIntentos());
            this.cambiarImagen(num);
             }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    ecci_ahorcado.ECCIAhorcado service;
    ecci_ahorcado.ECCIAhorcadoPort port;
    //return port.salude(nombre);
}
