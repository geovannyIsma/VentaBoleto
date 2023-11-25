/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO.pasajero;

import controlador.DAO.DaoImplement;
import controlador.TDA.lista.DynamicList;
import controlador.TDA.lista.Exceptions.EmptyException;
import modelo.Venta;

/**
 *
 * @author romer
 */
public class VentaControlDao extends DaoImplement<Venta>{
    private DynamicList<Venta> ventas;
    private Venta venta;

    public VentaControlDao() {
        super(Venta.class);
    }

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(DynamicList<Venta> ventas) {
        this.ventas = ventas;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    public Boolean persist(){
        venta.setId(all().getLenght()+1);
        return persist(venta);
    }
    
    public Boolean merge(Integer index){
        return merge(venta, index);
    }
    
    public double calcularMontoTotal() throws EmptyException {
        double montoTotal = 0.0;
        for (int i = 0; i < all().getLenght(); i++) {
            Venta venta = all().getInfo(i);
            montoTotal += venta.getBoleto().getValor();
        }
        return montoTotal;
    }
}
