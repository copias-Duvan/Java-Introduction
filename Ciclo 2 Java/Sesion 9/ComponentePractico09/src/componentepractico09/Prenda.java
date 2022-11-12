/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico09;

/**
 *
 * @author Daniel
 */
public class Prenda extends Producto {
    
    // Atributos
    
    private String talla;
    private boolean permitePlanchado;

    // Constructor

    public Prenda(String talla, boolean permitePlanchado, String codigo, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        super(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
        this.talla = talla;
        this.permitePlanchado = permitePlanchado;
    }

    // Métodos

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPermitePlanchado() {
        return permitePlanchado;
    }

    public void setPermitePlanchado(boolean permitePlanchado) {
        this.permitePlanchado = permitePlanchado;
    }
    
    @Override
    public String mostrar() {
        String cadena = "%1$s-%2$s-%3$s";
        String info = String.format(cadena, super.mostrar(), talla, permitePlanchado);
        return info;
    }
    
}
