package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TMProductos implements TableModel{
    
    private List<Producto> listaProductos;
    private Data d;
    
    public TMProductos (List<Producto> listaProductos) throws ClassNotFoundException, SQLException{
        this.listaProductos = listaProductos;
        d = new Data();
    }
    
    public Producto getProducto(int index){
        return listaProductos.get(index);
    }

    @Override
    public int getRowCount() {
        return listaProductos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "ID";
            case 1:
                return "Producto";
            case 2:
                return "Precio";
            default:
                return "Cantidad";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = listaProductos.get(rowIndex);
         switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getNombre();
            case 2:
                return p.getPrecio();
            default:
                return p.getCantidad();     
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }
    
}
