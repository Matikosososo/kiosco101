package controller;

public class Detalle {
    private int id;
    private int producto;
    private int boleta;
    private int cantidad;
    private int precio;

    public Detalle(int id, int producto, int boleta, int cantidad, int precio) {
        this.id = id;
        this.producto = producto;
        this.boleta = boleta;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Detalle(int producto, int boleta, int cantidad, int precio) {
        
        this.producto = producto;
        this.boleta = boleta;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Detalle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
}
