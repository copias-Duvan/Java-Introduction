package PaqueteBaseDeDatos;


import javax.swing.JOptionPane;
import Controlador.Controlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class reto4 extends javax.swing.JFrame {
    
    Controlador controlador = new Controlador();
    
    public reto4() {
        initComponents();
    }
    
    /*String idstr;
    int id;
    String nombre;
    String municipio;
    String cuerpoAgua;
    String tipoAgua;
    String ircastr;
    float irca;
    
     public void asignarValores (){
        this.idstr = id_edit.getText();
        this.id = Integer.parseInt(idstr);
        this.nombre = nombre_edit.getText();
        this.municipio = municipio_edit.getText();
        this.cuerpoAgua = cuerpoAgua_edit.getText();
        this.tipoAgua = cuerpoAgua_edit.getText();
        this.ircastr = irca_edit.getText();
        this.irca = Float.parseFloat(ircastr);
        
        textAreaDatosIngre.append(idstr+" ");
        textAreaDatosIngre.append(nombre+" ");
        textAreaDatosIngre.append(municipio+" ");
        textAreaDatosIngre.append(cuerpoAgua+" ");
        textAreaDatosIngre.append(tipoAgua+" ");
        textAreaDatosIngre.append(ircastr);
    }*/
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDatosIngre = new javax.swing.JTextArea();
        buttonObtenerDatos = new javax.swing.JButton();
        buttonProcesar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldTipoAgua = new javax.swing.JTextField();
        buttonIngresar = new javax.swing.JButton();
        textFieldCuerpoAgua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldMunicipio = new javax.swing.JTextField();
        textFieldIrca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        IDaBuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        id_edit = new javax.swing.JTextField();
        nombre_edit = new javax.swing.JTextField();
        municipio_edit = new javax.swing.JTextField();
        cuerpoAgua_edit = new javax.swing.JTextField();
        tipoagua_edit = new javax.swing.JTextField();
        irca_edit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        textAreaDatosIngre.setColumns(20);
        textAreaDatosIngre.setRows(5);
        jScrollPane1.setViewportView(textAreaDatosIngre);

        buttonObtenerDatos.setText("Obtener Datos");
        buttonObtenerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonObtenerDatosActionPerformed(evt);
            }
        });

        buttonProcesar.setText("Procesar Datos");
        buttonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonObtenerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonProcesar))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonObtenerDatos)
                .addGap(18, 18, 18)
                .addComponent(buttonProcesar)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procesar Datos", jPanel2);

        jLabel1.setText("Nombre");

        jLabel5.setText("Tipo de Agua");

        textFieldTipoAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTipoAguaActionPerformed(evt);
            }
        });

        buttonIngresar.setText("Ingresar");
        buttonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngresarActionPerformed(evt);
            }
        });

        textFieldCuerpoAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCuerpoAguaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Cuerpo de Agua");

        jLabel2.setText("id_Cuerpo de agua");

        jLabel3.setText("Municipio");

        textFieldMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMunicipioActionPerformed(evt);
            }
        });

        jLabel6.setText("IRCA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(buttonIngresar)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textFieldMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addContainerGap(359, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textFieldCuerpoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(textFieldIrca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCuerpoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldIrca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(buttonIngresar)
                .addGap(317, 317, 317))
        );

        jTabbedPane1.addTab("Ingresar", jPanel1);

        IDaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDaBuscarActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID para Buscar");

        id_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_editActionPerformed(evt);
            }
        });

        cuerpoAgua_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuerpoAgua_editActionPerformed(evt);
            }
        });

        jLabel8.setText("Id");

        jLabel9.setText("Nombre");

        jLabel10.setText("Municipio");

        jLabel11.setText("Tipo de Cuerpo");

        jLabel12.setText("Tipo de Agua");

        jLabel13.setText("IRCA");

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(IDaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jLabel7))
                .addGap(309, 309, 309))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cuerpoAgua_edit)
                        .addComponent(id_edit))
                    .addComponent(Editar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addGap(73, 73, 73))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tipoagua_edit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_edit))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(municipio_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(irca_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton6))
                .addGap(332, 332, 332))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuerpoAgua_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoagua_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(irca_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(jButton6))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar / Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Procesar datos
    private void buttonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcesarActionPerformed
       
        try {
            // TODO add your handling code here:
            jTextArea2.setText("");
            controlador.LlenarArray();
            jTextArea2.append(controlador.NivelesTodos());
            jTextArea2.append(controlador.MenorMedio());
            jTextArea2.append(controlador.Medios());
            jTextArea2.append(controlador.Menor());
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonProcesarActionPerformed
    //Obtener datos
    private void buttonObtenerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonObtenerDatosActionPerformed
        try {
            // TODO add your handling code here:
            textAreaDatosIngre.setText("");
            textAreaDatosIngre.append(controlador.Ingresarconsulta());
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_buttonObtenerDatosActionPerformed

    private void textFieldMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMunicipioActionPerformed

    private void textFieldCuerpoAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCuerpoAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCuerpoAguaActionPerformed
//Ingresar
    private void buttonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngresarActionPerformed

        //Agregamos al texfield y agregamos a la lista que esta en controlador
        textAreaDatosIngre.append( textFieldNombre.getText() + " " +textFieldId.getText() + " " +textFieldMunicipio.getText() + " " +textFieldIrca.getText() + " " +textFieldTipoAgua.getText() +" " + textFieldCuerpoAgua.getText() + "\n");
        try {
            controlador.agregar(textFieldNombre.getText(), Integer.parseInt(textFieldId.getText()), textFieldMunicipio.getText(), Float.parseFloat(textFieldIrca.getText()), textFieldTipoAgua.getText(), textFieldCuerpoAgua.getText());
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Vaciar campos luegos de guardar la info
        Limpiar();

    }//GEN-LAST:event_buttonIngresarActionPerformed

    private void textFieldTipoAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTipoAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTipoAguaActionPerformed

    private void IDaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDaBuscarActionPerformed
//Buscar *
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            //Hacer la consulta con el id
            String[] CuerpoInfo;
            CuerpoInfo = controlador.consultarPorId(Integer.parseInt(IDaBuscar.getText()));
            id_edit.setText(CuerpoInfo[0]);
            nombre_edit.setText(CuerpoInfo[1]);
            municipio_edit.setText(CuerpoInfo[2]);
            cuerpoAgua_edit.setText(CuerpoInfo[3]);
            tipoagua_edit.setText(CuerpoInfo[4]);
            irca_edit.setText(CuerpoInfo[5]);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cuerpoAgua_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuerpoAgua_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuerpoAgua_editActionPerformed

    private void id_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_editActionPerformed
//Editar *
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        try {
            // TODO add your handling code here:
            controlador.editar(
                    nombre_edit.getText(),
                    Integer.parseInt(id_edit.getText()),
                    municipio_edit.getText(),
                    Float.parseFloat(irca_edit.getText()),
                    cuerpoAgua_edit.getText(),
                    tipoagua_edit.getText()
            );
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try {
            controlador.Eliminar(Integer.parseInt(id_edit.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    public void Limpiar(){
        textFieldNombre.setText("");
        id.setText("");
        textFieldMunicipio.setText("");
        textFieldTipoAgua.setText("");
        textFieldCuerpoAgua.setText("");
        textFieldIrca.setText("");
    }    
    
    
  
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
            java.util.logging.Logger.getLogger(reto4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reto4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reto4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reto4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reto4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JTextField IDaBuscar;
    private javax.swing.JButton buttonIngresar;
    private javax.swing.JButton buttonObtenerDatos;
    private javax.swing.JButton buttonProcesar;
    private javax.swing.JTextField cuerpoAgua_edit;
    private javax.swing.JTextField id_edit;
    private javax.swing.JTextField irca_edit;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField municipio_edit;
    private javax.swing.JTextField nombre_edit;
    private javax.swing.JTextArea textAreaDatosIngre;
    private javax.swing.JTextField textFieldCuerpoAgua;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldIrca;
    private javax.swing.JTextField textFieldMunicipio;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTipoAgua;
    private javax.swing.JTextField tipoagua_edit;
    // End of variables declaration//GEN-END:variables
}
