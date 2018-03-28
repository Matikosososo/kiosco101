package controller;

public class Boleta {
    private int id;
    private String fecha;

    public Boleta(int id, String fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Boleta() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
