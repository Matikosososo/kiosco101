package controller;

public class Detalle {
    private int id;
    private Producto producto;
    private Boleta boleta;
    private int cantidad;
    private int precio;

    public Detalle(int id, Producto producto, Boleta boleta, int cantidad, int precio) {
        this.id = id;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Boleta getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleta boleta) {
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
