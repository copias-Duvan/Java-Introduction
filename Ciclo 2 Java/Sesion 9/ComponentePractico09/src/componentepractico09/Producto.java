/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico09;

/**
 *
 * @author Daniel
 */
public class Producto {
    
    // Atributos
    
    private String codigo;
    private int precioCompra;
    private int precioVenta;
    private int cantidadBodega;
    private int cantidadMinima;
    private int cantidadMaxima;
    
    public static final double descuento = 0.01;
    
    // Constructor
    
    public Producto(String codigo, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
    }
    
    // Métodos

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
        this.cantidadMinima = cantidadMinima > 0 ? cantidadMinima : 0;
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
    
    public String mostrar() {
        // codigo-precioCompra-precioVenta-cantidadBodega-cantidadMinima-cantidadMaxima
        // String info = codigo + "-" + precioCompra + "-" + precioVenta + "-" + cantidadBodega + "-" + cantidadMinima + "-" + cantidadMaxima + "-" + codigo;
        // String tiene un método llamado format, el cual nos permite formatear una cadena y adicionalmente insertar elementos dentro de la cadena
        String cadena = "%1$s-%2$d-%3$d-%4$d-%5$d-%6$d";
        // posicion %n, donde n es la posicion del parametro en el metodo format.
        // formato $x, donde x va a ser el formato, s ==> cadena, d ==> digitos
        String infoFormateada = String.format(cadena, codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
        //System.out.println(info);
        return infoFormateada;
    }
}
