/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico03;

// Ctrl + Shift + I ==> hace los imports automáticamente

import java.util.Scanner;


/**
 *
 * @author Daniel
 */
public class ComponentePractico03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Código del producto: ");
        String codigo = scanner.nextLine();
        System.out.println("Precio de compra: ");
        int precioCompra = Integer.parseInt(scanner.nextLine());
        System.out.println("Cantidad en Bodega: ");
        int cantidadBodega = Integer.parseInt(scanner.nextLine());
        System.out.println("Cantidad Minima Requerida: ");
        int cantidadMinima = Integer.parseInt(scanner.nextLine());
        
        Producto producto = new Producto(codigo, precioCompra, cantidadBodega, cantidadMinima);
        
        // if (variable == true) ==> if (variable) // cuando variable es de tipo boolean
        if (producto.solicitarPedido()) {
            System.out.println("Se debe hacer pedido al proveedor");
        }
    }
    
}
