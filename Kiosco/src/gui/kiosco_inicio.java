/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Data;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Veroko
 */
public class kiosco_inicio extends javax.swing.JFrame {

    private Data d;
    public kiosco_inicio() {
        try {
            d = new Data();
            initComponents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_kiosco_inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpass_kiosco_inicio_clave = new javax.swing.JPasswordField();
        btn_kiosco_inicio_ingresar = new javax.swing.JButton();
        btn_kiosco_inicio_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpn_kiosco_inicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kiosco 101");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese contraseña:");

        jpass_kiosco_inicio_clave.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jpass_kiosco_inicio_clave.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_kiosco_inicio_ingresar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_kiosco_inicio_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/proximo.png"))); // NOI18N
        btn_kiosco_inicio_ingresar.setText("Ingresar");
        btn_kiosco_inicio_ingresar.setToolTipText("");
        btn_kiosco_inicio_ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_kiosco_inicio_ingresar.setIconTextGap(15);
        btn_kiosco_inicio_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kiosco_inicio_ingresarActionPerformed(evt);
            }
        });

        btn_kiosco_inicio_salir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_kiosco_inicio_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/cerrar.png"))); // NOI18N
        btn_kiosco_inicio_salir.setText("Salir");
        btn_kiosco_inicio_salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_kiosco_inicio_salir.setIconTextGap(15);
        btn_kiosco_inicio_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kiosco_inicio_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_kiosco_inicioLayout = new javax.swing.GroupLayout(jpn_kiosco_inicio);
        jpn_kiosco_inicio.setLayout(jpn_kiosco_inicioLayout);
        jpn_kiosco_inicioLayout.setHorizontalGroup(
            jpn_kiosco_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiosco_inicioLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jpn_kiosco_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpass_kiosco_inicio_clave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiosco_inicioLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jpn_kiosco_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiosco_inicioLayout.createSequentialGroup()
                        .addComponent(btn_kiosco_inicio_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiosco_inicioLayout.createSequentialGroup()
                        .addComponent(btn_kiosco_inicio_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jpn_kiosco_inicioLayout.setVerticalGroup(
            jpn_kiosco_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiosco_inicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpass_kiosco_inicio_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_kiosco_inicio_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btn_kiosco_inicio_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_kiosco_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_kiosco_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kiosco_inicio_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kiosco_inicio_salirActionPerformed
        int op;
        int op2;
        
        op2 = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "Salir", op = JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        System.out.println(op2);
        if(op2 == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_kiosco_inicio_salirActionPerformed

    private void btn_kiosco_inicio_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kiosco_inicio_ingresarActionPerformed
        try {
            String password = new String(jpass_kiosco_inicio_clave.getPassword());
            //System.out.println(password);
            
            kiosco_menu_principal jFrameMenu = new kiosco_menu_principal();
            
            if(password.equals(d.buscarPassword(password))){
                this.setVisible(false);
                jFrameMenu.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.OK_OPTION);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_kiosco_inicio_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(kiosco_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kiosco_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kiosco_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kiosco_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kiosco_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kiosco_inicio_ingresar;
    private javax.swing.JButton btn_kiosco_inicio_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jpass_kiosco_inicio_clave;
    private javax.swing.JPanel jpn_kiosco_inicio;
    // End of variables declaration//GEN-END:variables
}
