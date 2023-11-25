package modelo;

import java.util.Date;

/**
 *
 * @author romer
 */
public class Boleto {
    private Integer id;
    private String fechaSalida;
    private String fechaCompra;
    private String destino;
    private String origen;
    private Double valor;

    public Boleto(Integer id, String fechaSalida, String fechaCompra, String destino, String origen, Double valor) {
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.fechaCompra = fechaCompra;
        this.destino = destino;
        this.origen = origen;
        this.valor = valor;
    }

    public Boleto() {
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    

}
