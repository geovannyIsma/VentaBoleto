/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.TDA.lista.DynamicList;
import javax.swing.table.AbstractTableModel;
import modelo.Venta;

/**
 *
 * @author romer
 */
public class VentaTb extends AbstractTableModel {
    private DynamicList<Venta> ventas;

    @Override
    public int getRowCount() {
        return ventas.getLenght();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Venta venta = ventas.getInfo(rowIndex);
            
            switch (columnIndex) {
                case 0:
                    return (venta != null)? venta.getPasajero().getNombre() + " " + venta.getPasajero().getApellido() : " ";
                 case 1:
                     return (venta != null)? venta.getBoleto().getOrigen() : "";
                 case 2:
                     return (venta != null)? venta.getBoleto().getDestino(): "";
                 case 3:
                     return (venta != null)? venta.getBoleto().getFechaCompra(): "";
                 case 4:
                     return (venta != null)? venta.getBoleto().getFechaSalida(): "";
                 case 5:
                     return (venta != null)? venta.getBoleto().getValor() : "";
                default:
                    return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "PASAJERO";
            case 1:
                return "ORIGEN";
            case 2:
                return "DESTINO";
            case 3:
                return "FECHA COMPRA";
            case 4:
                return "FECHA SALIDA";
            case 5:
                return "VALOR";
            default:
                return null;
        }
    }

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(DynamicList<Venta> ventas) {
        this.ventas = ventas;
    }
}
