/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Data;
import controller.Detalle;
import controller.Producto;
import controller.TMProductos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class kiosco_venta extends javax.swing.JFrame {

    private Data d;
    private Detalle de;
    int cont = 0;
    List<Producto> listaProductos;
    List<Detalle> listaDetalles;

    public kiosco_venta() {
        try {
            listaProductos = new ArrayList<>();
            d = new Data();
            initComponents();
            init();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
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

        jpn_kiosco_venta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_lista_venta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_carrito_venta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_kiosco_venta_realizar = new javax.swing.JButton();
        btn_kiosco_venta_cancelar = new javax.swing.JButton();
        btn_kiosco_venta_volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_venta_total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_numBoleta = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpn_kiosco_venta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtable_lista_venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_lista_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_lista_ventaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_lista_venta);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de productos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtable_carrito_venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_carrito_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_carrito_ventaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_carrito_venta);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Carrito de compras");

        btn_kiosco_venta_realizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_kiosco_venta_realizar.setText("Venta");
        btn_kiosco_venta_realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kiosco_venta_realizarActionPerformed(evt);
            }
        });

        btn_kiosco_venta_cancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_kiosco_venta_cancelar.setText("Cancelar");
        btn_kiosco_venta_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kiosco_venta_cancelarActionPerformed(evt);
            }
        });

        btn_kiosco_venta_volver.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_kiosco_venta_volver.setText("Volver");
        btn_kiosco_venta_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kiosco_venta_volverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Su total es: $");

        txt_venta_total.setEditable(false);
        txt_venta_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_venta_total.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_venta_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N° Boleta");

        lbl_numBoleta.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_kiosco_ventaLayout = new javax.swing.GroupLayout(jpn_kiosco_venta);
        jpn_kiosco_venta.setLayout(jpn_kiosco_ventaLayout);
        jpn_kiosco_ventaLayout.setHorizontalGroup(
            jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addComponent(btn_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addComponent(btn_kiosco_venta_realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btn_kiosco_venta_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_venta_total))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btn_kiosco_venta_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_numBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jpn_kiosco_ventaLayout.setVerticalGroup(
            jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_kiosco_ventaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_venta_total, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_kiosco_venta_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kiosco_venta_realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btn_kiosco_venta_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpn_kiosco_ventaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpn_kiosco_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_numBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(219, 219, 219))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_kiosco_venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn_kiosco_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kiosco_venta_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kiosco_venta_volverActionPerformed
        this.setVisible(false);

        kiosco_menu_principal jframeMenu = new kiosco_menu_principal();
        jframeMenu.setVisible(true);
        Producto pe;
        for (int i = 0; i < listaProductos.size(); i++) {

            try {
                pe = new Producto(listaProductos.get(i).getId(), listaProductos.get(i).getNombre(), listaProductos.get(i).getPrecio(), listaProductos.get(i).getCantidad());

                d.actualizarStockProducto(pe, listaProductos.get(i).getCantidad());

            } catch (SQLException ex) {
                Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_kiosco_venta_volverActionPerformed

    private void jtable_lista_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_lista_ventaMouseClicked
        if (evt.getClickCount() == 2) {

            int cantidad = 0;
            String input = "";

            try {
                do {
                    input = JOptionPane.showInputDialog("Ingrese cantidad a llevar");
                    System.out.println(input);
                } while (input.equals("0") || input.equals("") || input.contains("-"));
                
                cantidad = Integer.parseInt(input);
                System.out.println(cantidad);
                select(cantidad);

                
                
            } catch (Exception e) {
                
            } 
        }
    }//GEN-LAST:event_jtable_lista_ventaMouseClicked

    private void btn_kiosco_venta_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kiosco_venta_cancelarActionPerformed

        Producto pe;
        for (int i = 0; i < listaProductos.size(); i++) {

            try {
                pe = new Producto(listaProductos.get(i).getId(), listaProductos.get(i).getNombre(), listaProductos.get(i).getPrecio(), listaProductos.get(i).getCantidad());

                d.actualizarStockProducto(pe, listaProductos.get(i).getCantidad());

            } catch (SQLException ex) {
                Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cargarTabla();
        clear();
        btn_kiosco_venta_volver.setEnabled(true);
    }//GEN-LAST:event_btn_kiosco_venta_cancelarActionPerformed

    private void btn_kiosco_venta_realizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kiosco_venta_realizarActionPerformed

        try {
            for (int i = 0; i < listaProductos.size(); i++) {

                de = new Detalle(listaProductos.get(i).getId(), d.getBoleta(), listaProductos.get(i).getCantidad(), listaProductos.get(i).getPrecio());
                d.crearDetalle(de);
            }

            Date fecha = new Date();
            String strFecha = String.valueOf(fecha);

            d.actualizarBoleta(d.getBoleta(), strFecha);
            d.crearBoleta();

            lbl_numBoleta.setText("" + d.getBoleta() + "");

            clear();
            btn_kiosco_venta_volver.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_kiosco_venta_realizarActionPerformed

    private void jtable_carrito_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_carrito_ventaMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                int row = jtable_carrito_venta.getSelectedRow();
                Producto p = new Producto();
                p.setId((int) jtable_carrito_venta.getValueAt(row, 0));//columna 0=id
                p.setNombre((String) jtable_carrito_venta.getValueAt(row, 1));//columna 1=nombre
                p.setPrecio((int) jtable_carrito_venta.getValueAt(row, 2));//columna 2=precio
                p.setCantidad((int) jtable_carrito_venta.getValueAt(row, 3));//columna 3=cantidad

                d.actualizarStockProducto(p, p.getCantidad());

                listaProductos.remove(row);

                cargarTablaVenta(listaProductos);
                cargarTabla();
                
                //precio total txt
                int precioUnidad = (d.getPrecioTotal(p.getCantidad(), p.getId(), p.getPrecio()));
                int precioSubTotal = (Integer.parseInt(txt_venta_total.getText())) - precioUnidad;
                String precioTotal = String.valueOf(precioSubTotal);
                txt_venta_total.setText(precioTotal);
                if(listaProductos.isEmpty()){
                    btn_kiosco_venta_realizar.setEnabled(false);
                    btn_kiosco_venta_volver.setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtable_carrito_ventaMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String buscar = txt_buscar.getText();

        if (txt_buscar.getText() == null) {
            cargarTabla();
        }
        cargarTablaBuscar(buscar);
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(kiosco_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kiosco_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kiosco_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kiosco_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kiosco_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_kiosco_venta_cancelar;
    private javax.swing.JButton btn_kiosco_venta_realizar;
    private javax.swing.JButton btn_kiosco_venta_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpn_kiosco_venta;
    private javax.swing.JTable jtable_carrito_venta;
    private javax.swing.JTable jtable_lista_venta;
    private javax.swing.JLabel lbl_numBoleta;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_venta_total;
    // End of variables declaration//GEN-END:variables

    private void init() {
        try {
            btn_kiosco_venta_realizar.setEnabled(false);
            txt_venta_total.setText("0");
            jtable_lista_venta.setModel(new DefaultTableModel());
            jtable_carrito_venta.setModel(new DefaultTableModel());
            cargarTabla();
            lbl_numBoleta.setText("" + d.getBoleta() + "");
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTablaVenta(List<Producto> lista) {

        try {
            TMProductos tm = new TMProductos(lista);

            jtable_carrito_venta.setModel(tm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarTabla() {
        try {
            List<Producto> listaProducto = d.getListaProducto();
            TMProductos tm = new TMProductos(listaProducto);
            jtable_lista_venta.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void select(int cantidad) {
        try {
            int row = jtable_lista_venta.getSelectedRow();
            int stock = (int) jtable_lista_venta.getValueAt(row, 3);
            if (stock == 0 || cantidad > stock) {
                JOptionPane.showMessageDialog(null, "No posee Stock o la cantidad ingresada es Mayor al Stock del producto");
                
            } else {
                Producto p = new Producto();
                p.setId((int) jtable_lista_venta.getValueAt(row, 0));//columna 0=nombre
                p.setNombre((String) jtable_lista_venta.getValueAt(row, 1));//columna 1=apellido
                p.setPrecio((int) jtable_lista_venta.getValueAt(row, 2));//columna 2=telf
                p.setCantidad(cantidad);//columna 2=telf

                System.out.println(p.getId());
                System.out.println(p.getNombre());
                System.out.println(p.getPrecio());
                System.out.println(p.getCantidad());

                listaProductos.add(p);

                //precio total txt
                int precioUnidad = (d.getPrecioTotal(cantidad, p.getId(), p.getPrecio()));
                int precioSubTotal = (Integer.parseInt(txt_venta_total.getText())) + precioUnidad;
                String precioTotal = String.valueOf(precioSubTotal);
                txt_venta_total.setText(precioTotal);

                //otros
                d.actualizarStockProducto(p, (-cantidad));
                cargarTablaVenta(listaProductos);
                cargarTabla();
                btn_kiosco_venta_realizar.setEnabled(true);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(kiosco_venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clear() {
        jtable_carrito_venta.setModel(new DefaultTableModel());
        txt_venta_total.setText("0");
        listaProductos = new ArrayList<>();
        btn_kiosco_venta_realizar.setEnabled(false);
    }

    private void cargarTablaBuscar(String buscar) {
         try {
            List<Producto> listaProducto = d.buscarProducto(buscar);
            TMProductos tm = new TMProductos(listaProducto);
            jtable_lista_venta.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kiosco_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
