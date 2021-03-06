/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Data;
import controller.Producto;
import controller.TMProductos;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veroko
 */
public class kiosco_productos extends javax.swing.JFrame {

    private Data d;

    public kiosco_productos() {
        try {
            d = new Data();
            initComponents();
            init();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
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

        jpn_kiosco_productos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_kiosco_productos_lista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nuevo_producto_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jsp_nuevo_producto_precio = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jsp_nuevo_producto_cantidad = new javax.swing.JSpinner();
        btn_nuevo_producto_agregar = new javax.swing.JButton();
        btn_nuevo_producto_cancelar = new javax.swing.JButton();
        btn_productos_volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_buscar_productos = new javax.swing.JTextField();
        btn_buscar_productos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpn_kiosco_productos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtable_kiosco_productos_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable_kiosco_productos_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_kiosco_productos_listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_kiosco_productos_lista);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/panadero.png"))); // NOI18N
        jLabel1.setText("Lista de productos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/cereal.png"))); // NOI18N
        jLabel2.setText("Agregar nuevo producto");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Nombre: ");

        txt_nuevo_producto_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_nuevo_producto_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Precio: ");

        jsp_nuevo_producto_precio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jsp_nuevo_producto_precio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad: ");

        jsp_nuevo_producto_cantidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jsp_nuevo_producto_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btn_nuevo_producto_agregar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_nuevo_producto_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/mapas-y-banderas.png"))); // NOI18N
        btn_nuevo_producto_agregar.setText("Agregar");
        btn_nuevo_producto_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_producto_agregarActionPerformed(evt);
            }
        });

        btn_nuevo_producto_cancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_nuevo_producto_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/cancelar.png"))); // NOI18N
        btn_nuevo_producto_cancelar.setText("Cancelar");
        btn_nuevo_producto_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_producto_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nuevo_producto_nombre)
                            .addComponent(jsp_nuevo_producto_precio)
                            .addComponent(jsp_nuevo_producto_cantidad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevo_producto_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nuevo_producto_cancelar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nuevo_producto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsp_nuevo_producto_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsp_nuevo_producto_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo_producto_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo_producto_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btn_productos_volver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_productos_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/proximo izquierda.png"))); // NOI18N
        btn_productos_volver.setText("Volver");
        btn_productos_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productos_volverActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/busqueda.png"))); // NOI18N
        jLabel6.setText("Buscador");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_buscar_productos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_buscar_productos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscar_productosKeyPressed(evt);
            }
        });

        btn_buscar_productos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_buscar_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/busqueda.png"))); // NOI18N
        btn_buscar_productos.setText("Buscar");
        btn_buscar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_productosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_kiosco_productosLayout = new javax.swing.GroupLayout(jpn_kiosco_productos);
        jpn_kiosco_productos.setLayout(jpn_kiosco_productosLayout);
        jpn_kiosco_productosLayout.setHorizontalGroup(
            jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiosco_productosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_kiosco_productosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_productos_volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_buscar_productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(jpn_kiosco_productosLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btn_buscar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(146, Short.MAX_VALUE))))
        );
        jpn_kiosco_productosLayout.setVerticalGroup(
            jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiosco_productosLayout.createSequentialGroup()
                .addGroup(jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpn_kiosco_productosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jpn_kiosco_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_kiosco_productosLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(txt_buscar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_buscar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_productos_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_kiosco_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_kiosco_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_productos_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productos_volverActionPerformed
        this.setVisible(false);
        kiosco_menu_principal jframeMenu = new kiosco_menu_principal();
        jframeMenu.setVisible(true);
        txt_buscar_productos.setText(null);
        txt_nuevo_producto_nombre.setText(null);
        jsp_nuevo_producto_cantidad.setValue(0);
        jsp_nuevo_producto_precio.setValue(0);
    }//GEN-LAST:event_btn_productos_volverActionPerformed

    private void btn_nuevo_producto_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_producto_cancelarActionPerformed
        clear();
    }//GEN-LAST:event_btn_nuevo_producto_cancelarActionPerformed

    private void btn_buscar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_productosActionPerformed

        String buscar = txt_buscar_productos.getText();

        if (txt_buscar_productos.getText() == null) {
            cargarTabla();
        }
        cargarTablaBuscar(buscar);
    }//GEN-LAST:event_btn_buscar_productosActionPerformed

    private void btn_nuevo_producto_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_producto_agregarActionPerformed
        try {
            String nombreP;
            int precioP;
            int cantidadP;

            nombreP = txt_nuevo_producto_nombre.getText();
            precioP = (int) jsp_nuevo_producto_precio.getValue();
            cantidadP = (int) jsp_nuevo_producto_cantidad.getValue();
            if ((nombreP.equals("")) || precioP == 0 || cantidadP == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese Datos para agregar producto");
            } else {
                Producto p = new Producto(nombreP, precioP, cantidadP);
                d.agregarProducto(p);
                clear();
                cargarTabla();
            }
            txt_nuevo_producto_nombre.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_nuevo_producto_agregarActionPerformed

    private void jtable_kiosco_productos_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_kiosco_productos_listaMouseClicked

        if (evt.getClickCount() == 2) {
            String input;
            int cantidadStock = 0;
            int precioN = 0;
            int opcionIN;
            String opcion, precio;
            int row = jtable_kiosco_productos_lista.getSelectedRow();
            Producto p = new Producto();
            p.setId((int) jtable_kiosco_productos_lista.getValueAt(row, 0));
            p.setNombre((String) jtable_kiosco_productos_lista.getValueAt(row, 1));
            p.setPrecio((int) jtable_kiosco_productos_lista.getValueAt(row, 2));
            p.setCantidad((int) jtable_kiosco_productos_lista.getValueAt(row, 3));

            try {
                opcion = JOptionPane.showInputDialog("Ingrese opcion a cambiar : 1 = STOCK, 2 = PRECIO");
                opcionIN = Integer.parseInt(opcion);

                if (!opcion.equals("") || !opcion.equals("0") || !opcion.contains("-") || !(opcionIN > 2)) {
                    if (opcionIN == 1) {
                        do {

                            input = JOptionPane.showInputDialog("Ingrese el STOCK nuevo");

                        } while (input.equals("") || input.contains("-"));

                        cantidadStock = Integer.parseInt(input);
                        System.out.println(cantidadStock);
                        d.actualizarStock(p, cantidadStock);
                        cargarTabla();
                    } else if (opcionIN == 2) {
                        do {

                            precio = JOptionPane.showInputDialog("Ingrese el PRECIO nuevo");

                        } while (precio.equals("") || precio.contains("-"));

                        precioN = Integer.parseInt(precio);
                        System.out.println(precioN);
                        d.actualizarPrecio(p, precioN);
                        cargarTabla();
                    }
                }

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_jtable_kiosco_productos_listaMouseClicked

    private void txt_buscar_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_productosKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String buscar = txt_buscar_productos.getText();

            if (txt_buscar_productos.getText() == null) {
                cargarTabla();
            }
            cargarTablaBuscar(buscar);
        }
    }//GEN-LAST:event_txt_buscar_productosKeyPressed

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
            java.util.logging.Logger.getLogger(kiosco_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kiosco_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kiosco_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kiosco_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kiosco_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_productos;
    private javax.swing.JButton btn_nuevo_producto_agregar;
    private javax.swing.JButton btn_nuevo_producto_cancelar;
    private javax.swing.JButton btn_productos_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpn_kiosco_productos;
    private javax.swing.JSpinner jsp_nuevo_producto_cantidad;
    private javax.swing.JSpinner jsp_nuevo_producto_precio;
    private javax.swing.JTable jtable_kiosco_productos_lista;
    private javax.swing.JTextField txt_buscar_productos;
    private javax.swing.JTextField txt_nuevo_producto_nombre;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txt_buscar_productos.setText(null);
        txt_nuevo_producto_nombre.setText(null);
        jsp_nuevo_producto_cantidad.setValue(0);
        jsp_nuevo_producto_precio.setValue(0);
    }

    ;
    
    private void cargarTabla() {

        try {
            List<Producto> listaProducto = d.getListaProducto();
            TMProductos tm = new TMProductos(listaProducto);
            jtable_kiosco_productos_lista.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTablaBuscar(String buscar) {

        try {
            List<Producto> listaProducto = d.buscarProducto(buscar);
            TMProductos tm = new TMProductos(listaProducto);
            jtable_kiosco_productos_lista.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void init() {
        jtable_kiosco_productos_lista.setModel(new DefaultTableModel());
        cargarTabla();
        this.setLocationRelativeTo(null);
    }
}
