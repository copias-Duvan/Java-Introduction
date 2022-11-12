/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico03;

/**
 *
 * @author Daniel
 */
public class Producto {
    
    // Atributos
    String codigo;
    int precioCompra;
    int cantidadBodega;
    int cantidadMinima;
    
    // Constructor
    public Producto(String cod, int pCompra, int cantBodega, int cantMinima) {
        codigo = cod;
        precioCompra = pCompra;
        cantidadBodega = cantBodega;
        cantidadMinima = cantMinima;
    }
    
    // Métodos
    boolean solicitarPedido() {
        return cantidadBodega < cantidadMinima;
    }
}
