/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author snake
 */
public class Mantenimiento_Maestro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Maestro
     */
    public Mantenimiento_Maestro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Estatus = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();
        txt_CorreoE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo:");

        jLabel6.setText("Correo Electronico:");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Direccion:");

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono:");

        jLabel7.setText("Estatus:");

        jLabel3.setText("Ingresa el código del alumno: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txt_Direccion)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_buscar))
                        .addComponent(jButton4)
                        .addComponent(jLabel4)
                        .addComponent(txt_codigo)
                        .addComponent(jLabel5)
                        .addComponent(txt_Telefono)
                        .addComponent(jLabel6)
                        .addComponent(txt_CorreoE)
                        .addComponent(jLabel7)
                        .addComponent(txt_Estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labUSI", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from maestros where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_codigo.setText(rs.getString("CodigoMaestro"));
                txt_nombre.setText(rs.getString("NombreMaestro"));
                txt_Direccion.setText(rs.getString("DireccionMaestro"));
                txt_Telefono.setText(rs.getString("TelefonoMaestro"));
                txt_CorreoE.setText(rs.getString("CorreoMaestro"));
                txt_Estatus.setText(rs.getString("EstatusMaestro"));
            } else {
                JOptionPane.showMessageDialog(null, "Maestro no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labUSI", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into maestros values(?,?,?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, txt_codigo.getText().trim());
            pst.setString(3, txt_nombre.getText().trim());
            pst.setString(4, txt_Direccion.getText().trim());
            pst.setString(5, txt_Telefono.getText().trim());
            pst.setString(6, txt_CorreoE.getText().trim());
            pst.setString(7, txt_Estatus.getText().trim());
            pst.executeUpdate();
            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_Direccion.setText("");
            txt_Telefono.setText("");
            txt_CorreoE.setText("");
            txt_Estatus.setText("");
            label_status.setText("Registro exitoso.");
            {
                JOptionPane.showMessageDialog(null, "Se Registro un Nuevo Maestro.");
            }
        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labUSI", "root", "");
            PreparedStatement pst = cn.prepareStatement("update maestros set CodigoMaestro = ?, NombreMaestro = ?, DireccionMaestro = ?, TelefonoMaestro = ?, CorreoMaestro = ?, EstatusMaestro = ? where ID = " + ID);

            pst.setString(1, "0");
            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_Direccion.getText().trim());
            pst.setString(4, txt_Telefono.getText().trim());
            pst.setString(5, txt_CorreoE.getText().trim());
            pst.setString(6, txt_Estatus.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");
            {
                JOptionPane.showMessageDialog(null, "Se Modifico Datos de Maestro .");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labUSI", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from maestros  where CodigoMaestro = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_Direccion.setText("");
            txt_Telefono.setText("");
            txt_CorreoE.setText("");
            txt_Estatus.setText("");
            label_status.setText("Registro eliminado.");
            {
                JOptionPane.showMessageDialog(null, "Registro de Maestro Eliminado.");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_CorreoE;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Estatus;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
