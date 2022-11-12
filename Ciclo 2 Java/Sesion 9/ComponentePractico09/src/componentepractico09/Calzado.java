/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico09;

/**
 *
 * @author Daniel
 */
public class Calzado extends Producto {
    
    // Atributos
    
    private int talla;

    // Constructor

    public Calzado(int talla, String codigo, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        super(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
        this.talla = talla;
    }

    // Métodos
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    @Override
    public String mostrar() {
        String cadena = "%1$s-%2$d";
        String info = String.format(cadena, super.mostrar(), talla);
        return info;
    }
    
}
