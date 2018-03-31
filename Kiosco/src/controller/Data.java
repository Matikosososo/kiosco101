/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Data {
     private Conexion con;
    private String sql;
    private ResultSet tablaVirtual;
    private List<Producto> listProducto;
    private List<Boleta> listBoleta;
    private List<Detalle> listDetalle;
    

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion(
            "localhost",
            "root",
            "",
            "bd_kiosco"
        );
    }
    
    /*selects de todo*/
    
    public int getPrecioTotal(int cantidad, int id, int precio) throws SQLException{
        int precioTotal = 0;
        sql = "select SUM("+precio+"*"+cantidad+") from producto where id = "+id;
        tablaVirtual = con.ejecutarSelect(sql);
        if (tablaVirtual.next()) {
            precioTotal = tablaVirtual.getInt(1);
        }

        con.desconectar();
        return precioTotal;
    }
    
    public List<Producto> getListaProducto() throws SQLException{
        sql = "select * from producto";
        
        listProducto = new ArrayList<>();
        
        Producto p;
        
        tablaVirtual = con.ejecutarSelect(sql);
        while (tablaVirtual.next()) {
            p = new Producto();

            p.setId(tablaVirtual.getInt(1));
            p.setNombre(tablaVirtual.getString(2));
            p.setCantidad(tablaVirtual.getInt(3));
            p.setPrecio(tablaVirtual.getInt(4));
            listProducto.add(p);

        }

        con.desconectar();
        return listProducto;
    }
    
    public List<Producto> getListaProductoId(int id) throws SQLException{
        sql = "select * from producto where id = "+id;
        
        listProducto = new ArrayList<>();
        
        Producto p;
        
        tablaVirtual = con.ejecutarSelect(sql);
        if (tablaVirtual.next()) {
            p = new Producto();

            p.setId(tablaVirtual.getInt(1));
            p.setNombre(tablaVirtual.getString(2));
            p.setCantidad(tablaVirtual.getInt(3));
            p.setPrecio(tablaVirtual.getInt(4));
            listProducto.add(p);

        }

        con.desconectar();
        return listProducto;
    }
    
    public List<Producto> buscarProducto(String buscar) throws SQLException{
        sql = "select * from producto where nombre LIKE '%"+buscar+"%'";
        
        listProducto = new ArrayList<>();
        
        Producto p;
        
        tablaVirtual = con.ejecutarSelect(sql);
        while (tablaVirtual.next()) {
            p = new Producto();

            p.setId(tablaVirtual.getInt(1));
            p.setNombre(tablaVirtual.getString(2));
            p.setCantidad(tablaVirtual.getInt(3));
            p.setPrecio(tablaVirtual.getInt(4));
            listProducto.add(p);

        }

        con.desconectar();
        return listProducto;
    }
    
    public List<Boleta> getListaBoleta() throws SQLException{
        sql = "select * from boleta";
        
        listBoleta = new ArrayList<>();
        
        Boleta b;
        
        tablaVirtual =  con.ejecutarSelect(sql);
        
        while(tablaVirtual.next()){
            b = new Boleta();
            
            b.setId(tablaVirtual.getInt(1));
            b.setFecha(tablaVirtual.getString(2));
            
            listBoleta.add(b);
        }
        
        con.desconectar();
        
        return listBoleta;
    }
    
    public List<Detalle> getListDetalle() throws SQLException{
        sql = "select * from detalle";
        
        listDetalle = new ArrayList<>();
        
        tablaVirtual = con.ejecutarSelect(sql);
        
        Detalle d;
        
        while (tablaVirtual.next()) {            
            d = new Detalle();
            
            d.setId(tablaVirtual.getInt(1));
            d.setProducto(tablaVirtual.getInt(2));
            d.setBoleta(tablaVirtual.getInt(3));
            d.setCantidad(tablaVirtual.getInt(4));
            d.setPrecio(tablaVirtual.getInt(5));
            
            listDetalle.add(d);
        }
        
        con.desconectar();
        
        return listDetalle;
    }
    
    /*Selects de todo*/
    
    //Updates de producto (ventas)
    
    public void actualizarStockProducto(Detalle d) throws SQLException{
        sql = "UPDATE producto Set cantidad = cantidad + "+d.getCantidad()+" where id = "+d.getProducto();
        con.ejecutar(sql);
    }
    //Updates de producto (ventas)
    
    //update password
    public void actualizarPassword(String password) throws SQLException{
        sql = "UPDATE password Set password = '"+password+"' where id = 1";
        con.ejecutar(sql);
    }
    
    //update password
    
    //buscar password
    public String buscarPassword(String pass) throws SQLException{
        sql = "select password from password where password = '"+pass+"'";
        String password = "";
        
        Password p;
        
        tablaVirtual = con.ejecutarSelect(sql);
        if (tablaVirtual.next()) {
            p = new Password();
            p.setPassword(tablaVirtual.getString(1));
            password = p.getPassword();
        }

        con.desconectar();
        return password;
    }
            
    /*inserts ...*/
    
    public void agregarProducto(Producto p) throws SQLException{
        sql = "insert into producto values(null,'"+p.getNombre()+"','"+p.getCantidad()+"','"+p.getPrecio()+"')";
        con.ejecutar(sql);
    }
    
    public void crearBoleta(Boleta b) throws SQLException{
        sql = "insert into boleta values(null,'"+b.getFecha()+"')";
        
        con.ejecutar(sql);
    
    }
    
    public void crearDetalle(Detalle d) throws SQLException{
        sql = "insert into detalle values(null,'"+d.getProducto()+"','"+d.getBoleta()+"',"
                + d.getCantidad()+"','"+d.getPrecio()+"')";
        
        con.ejecutar(sql);
    }
    
    
    /*inserts ...*/
    
    
    
    
    
}
