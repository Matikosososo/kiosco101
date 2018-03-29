package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMDetalles implements TableModel{
    
    private List<Detalle> listaDetalles;
    private Data d;
    
    public TMDetalles (List<Detalle> listaDetalles) throws ClassNotFoundException, SQLException{
        this.listaDetalles = listaDetalles;
        d = new Data();
    }
    
    public Detalle getDetalle(int index){
        return listaDetalles.get(index);
    }
    
    @Override
    public int getRowCount() {
        return listaDetalles.size();
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
        Detalle de = listaDetalles.get(rowIndex);
         switch(columnIndex){
            case 0:
                return de.getId();
            case 1:
        
            try {
                List<Producto> listaDetallesId = d.getListaProductoId(de.getProducto());
                return listaDetallesId.get(0).getNombre();
                
            } catch (SQLException ex) {
                Logger.getLogger(TMDetalles.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            case 2:
                return de.getPrecio();
            default:
                return de.getCantidad();     
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
