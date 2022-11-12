/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Duvan
 */
public class reto3 extends javax.swing.JFrame {

    public reto3() {
        initComponents();
    }
    CuerpoDeAgua object = new CuerpoDeAgua();
    
    int contadorDeEntidades = 0;
    
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

        labelIrca.setText("IRCA");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(labelMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelDatosIngre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(buttonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(buttonProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                    .addComponent(buttonProcesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
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
        
        contadorDeEntidades += 1;
        
        String nombreEntidad = textFieldNombre.getText();
        textFieldNombre.setText("");
        object.setNombreEntidad(nombreEntidad);
        object.nameAllEntidades();
        
        String idEntidad = textFieldId.getText();
        textFieldId.setText("");
        object.setIdEntidad(idEntidad);
        object.agregarIdArray();
        
        String municipioEntidad = textFieldMunicipio.getText();
        textFieldMunicipio.setText("");
        object.setMunicipioEntidad(municipioEntidad);        
        
        String tipoCuerpo = textFieldCuerpoAgua.getText();
        textFieldCuerpoAgua.setText("");
        object.setTipoCuerpoAgua(tipoCuerpo);
        
        String tipoDeAgua = textFieldTipoAgua.getText();
        textFieldTipoAgua.setText("");
        object.setTipoAgua(tipoDeAgua);
        
        String irca = textFieldIrca.getText();
        textFieldIrca.setText("");
        object.setNumIrca(Float.parseFloat(irca));
        object.agregarIrcaArray();
        object.comprobarNivelMedioEntidades();
        
        textAreaDatosIngre.append(nombreEntidad + " " + idEntidad + " " + municipioEntidad + " " + tipoCuerpo + " " + tipoDeAgua + " " + irca + "\n");
               
    }//GEN-LAST:event_buttonIngresarActionPerformed
 
    private void textAreaDatosIngreAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textAreaDatosIngreAncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_textAreaDatosIngreAncestorAdded

    private void buttonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcesarActionPerformed
        // TODO add your handling code here:
        
        //Comprueba los niveles de irca en los que se encuentran las entidades
        for (int j = 0; j < contadorDeEntidades; j++){
            object.printCuerpoIrca(object.nivelesIrcaDeEntidades.get(j));
        }
        //Agrega los niveles irca en los que se encuentran las entidades a el TextArea
        for (int i = 0; i < object.nivelesDeRiesgoEntidades.size(); i++){
            String mostrarValor = object.nivelesDeRiesgoEntidades.get(i) + "\n";
            textAreaSalidas.append(mostrarValor);
        }
       // Convierte el contador de niveles medio a String y agrega su valor a el TextArea 
       String nivelesIrcaMedio = Integer.toString(object.getContadorNivelesMedio());
       textAreaSalidas.append(nivelesIrcaMedio + ",00" + "\n");
       
       //Recorre el Array que contiene el nombre de las entidades que se encuentran en nivel irca MEDIO
       for(int t = 0; t < object.entidadesEnNivelMedio.size(); t++){
           String nameEntidadMedio = object.entidadesEnNivelMedio.get(t) + "\n";
           textAreaSalidas.append(nameEntidadMedio);
       }
       
       /*
       String valorMin = object.getEntidadValorMin();
       textAreaSalidas.append(valorMin);*/
       object.imprimirValorMinimoIrca(); //
       String indice = object.getEntidadValorMin();
       textAreaSalidas.append(indice + " ");
       
       String idEntidadMin = object.getIdEntidadValorMin();
       textAreaSalidas.append(idEntidadMin + ",00");
    }//GEN-LAST:event_buttonProcesarActionPerformed

    private void textAreaSalidasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textAreaSalidasAncestorAdded
        // TODO add your handling code here:        
        
    }//GEN-LAST:event_textAreaSalidasAncestorAdded

    
    
    
    
    
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
