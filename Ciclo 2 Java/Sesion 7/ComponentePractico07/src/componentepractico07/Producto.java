/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico07;

/**
 *
 * @author Daniel
 */
public class Producto {
    
    private String codigo;
    private int precioCompra;
    private int precioVenta;
    private int cantidadBodega;
    private int cantidadMinima;
    private int cantidadMaxima;
    
    public static final double DESCUENTO = 0.01;

    public Producto(String codigo, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
    }
    
    // Generar Constructor y Getters y Setters
    // 1. Click derecho sobre el editor de texto
    // 2. Click en "Insert Code..."
    // 3. Elegir del menú "Constructor..." o "Getter and Setter..."
    // 4. En la ventana que aparece, seleccionar los atributos que se van a incluir
    // 5. Clic en el botón "Generate"

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima < 0 ? 0 : cantidadMinima;
        /*
        if (cantidadMinima < 0) {
            this.cantidadMinima = 0;
        } else {
            this.cantidadMinima = cantidadMinima;
        }
        */
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    
    public boolean solicitarPedido() {
        return this.cantidadBodega < this.cantidadMinima;
    }
    
    public int calcularTotalPagar(int unidades) {
        return unidades * this.precioCompra;
    }
}
