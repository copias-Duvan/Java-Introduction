package PaqueteBaseDeDatos;


import javax.swing.JOptionPane;
import Controlador.Controlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Duvan
 */
public class reto3 extends javax.swing.JFrame {

     Controlador controlador = new Controlador();
    
    public reto3() {
        initComponents();     
    }
    
   
    String idstr;
    int id;
    String nombre;
    String municipio;
    String cuerpoAgua;
    String tipoAgua;
    String ircastr;
    float irca;
    
    public void obtenerValores (){
        this.idstr = textFieldId.getText();
        this.id = Integer.parseInt(idstr);
        this.nombre = textFieldNombre.getText();
        this.municipio = textFieldMunicipio.getText();
        this.cuerpoAgua = textFieldCuerpoAgua.getText();
        this.tipoAgua = textFieldTipoAgua.getText();
        this.ircastr = textFieldIrca.getText();
        this.irca = Float.parseFloat(ircastr);
        
        textAreaDatosIngre.append(idstr+" ");
        textAreaDatosIngre.append(nombre+" ");
        textAreaDatosIngre.append(municipio+" ");
        textAreaDatosIngre.append(cuerpoAgua+" ");
        textAreaDatosIngre.append(tipoAgua+" ");
        textAreaDatosIngre.append(ircastr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldId = new javax.swing.JTextField();
        labelid = new javax.swing.JLabel();
        labelMunicipio = new javax.swing.JLabel();
        textFieldMunicipio = new javax.swing.JTextField();
        textFieldCuerpoAgua = new javax.swing.JTextField();
        labelTipoCuerpoAgua = new javax.swing.JLabel();
        buttonIngresar = new javax.swing.JButton();
        buttonProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDatosIngre = new javax.swing.JTextArea();
        labelTipoAgua = new javax.swing.JLabel();
        textFieldTipoAgua = new javax.swing.JTextField();
        labelIrca = new javax.swing.JLabel();
        textFieldIrca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaSalidas = new javax.swing.JTextArea();
        labelDatosIngre = new javax.swing.JLabel();
        labelSalidas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNombre.setText("Nombre");

        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        textFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdActionPerformed(evt);
            }
        });

        labelid.setText("Id");

        labelMunicipio.setText("Municipio");

        textFieldMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMunicipioActionPerformed(evt);
            }
        });

        textFieldCuerpoAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCuerpoAguaActionPerformed(evt);
            }
        });

        labelTipoCuerpoAgua.setText("Tipo de cuerpo de agua");

        buttonIngresar.setText("Ingresar");
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });

        buttonProcesar.setText("Procesar");
        buttonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcesarActionPerformed(evt);
            }
        });

        textAreaDatosIngre.setColumns(20);
        textAreaDatosIngre.setRows(5);
        textAreaDatosIngre.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textAreaDatosIngreAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(textAreaDatosIngre);

        labelTipoAgua.setText("Tipo de agua");

        textFieldTipoAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTipoAguaActionPerformed(evt);
            }
        });

        labelIrca.setText("IRCA");

        textFieldIrca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIrcaActionPerformed(evt);
            }
        });

        textAreaSalidas.setColumns(20);
        textAreaSalidas.setRows(5);
        textAreaSalidas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textAreaSalidasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(textAreaSalidas);

        labelDatosIngre.setText("Datos Ingresados");

        labelSalidas.setText("Salidas");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(buttonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(buttonProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelDatosIngre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textFieldCuerpoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipoCuerpoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(textFieldNombre))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelid, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFieldMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(labelIrca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldIrca))
                                    .addComponent(labelMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(684, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(labelid)
                    .addComponent(labelMunicipio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoCuerpoAgua)
                    .addComponent(labelTipoAgua)
                    .addComponent(labelIrca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCuerpoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldIrca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIngresar)
                    .addComponent(buttonProcesar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDatosIngre)
                    .addComponent(labelSalidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdActionPerformed

    private void textFieldMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMunicipioActionPerformed

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarActionPerformed
        // TODO add your handling code here:
        obtenerValores();
    }//GEN-LAST:event_buttonIngresarActionPerformed
 
    private void textAreaDatosIngreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textAreaDatosIngreAncestorAdded
        // TODO add your handling code here:
         
    }//GEN-LAST:event_textAreaDatosIngreAncestorAdded
   
    private void buttonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcesarActionPerformed
        // TODO add your handling code here:
        //Controlador transpaso = new Controlador () ;
       // transpaso.agregar(nombre, id, municipio, cuerpoAgua, tipoAgua, irca);
        //textAreaSalidas.append(nombre + idstr + municipio + cuerpoAgua + tipoAgua + ircastr);
        try {
            // TODO add your handling code here:
           textAreaSalidas.setText("");
            controlador.LlenarArray();
           textAreaSalidas.append(controlador.NivelesTodos());
           textAreaSalidas.append(controlador.MenorMedio());
           textAreaSalidas.append(controlador.Medios());
           textAreaSalidas.append(controlador.Menor());
          
        } catch (SQLException ex) {
            Logger.getLogger(reto3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonProcesarActionPerformed

    private void textAreaSalidasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textAreaSalidasAncestorAdded
        // TODO add your handling code here:        
        
    }//GEN-LAST:event_textAreaSalidasAncestorAdded

    private void textFieldCuerpoAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCuerpoAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCuerpoAguaActionPerformed

    private void textFieldTipoAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTipoAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTipoAguaActionPerformed

    private void textFieldIrcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIrcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIrcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            textAreaDatosIngre.setText("");
            textAreaDatosIngre.append(controlador.Ingresarconsulta());
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(reto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reto3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JButton buttonProcesar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDatosIngre;
    private javax.swing.JLabel labelIrca;
    private javax.swing.JLabel labelMunicipio;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSalidas;
    private javax.swing.JLabel labelTipoAgua;
    private javax.swing.JLabel labelTipoCuerpoAgua;
    private javax.swing.JLabel labelid;
    private javax.swing.JTextArea textAreaDatosIngre;
    private javax.swing.JTextArea textAreaSalidas;
    private javax.swing.JTextField textFieldCuerpoAgua;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldIrca;
    private javax.swing.JTextField textFieldMunicipio;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTipoAgua;
    // End of variables declaration//GEN-END:variables
}
