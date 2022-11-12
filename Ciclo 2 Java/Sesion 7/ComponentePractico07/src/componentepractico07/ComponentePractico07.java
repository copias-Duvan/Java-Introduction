/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico07;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ComponentePractico07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        boolean productoEncontrado = false;
        int posicionProducto = 0;
        
        int cantidadProductos = 0;
        System.out.println("Ingrese la cantidad de Productos");
        cantidadProductos = Integer.parseInt(scanner.nextLine());
        
        // Crear vector para almacenar productos
        Producto[] productos = new Producto[cantidadProductos];
        
        // LLenar el vector de productos
        // productos.length = cantidadProductos;
        for(int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese los datos del producto " + i + " separados por espacio:");
            String linea = scanner.nextLine();
            // 123 5000 15000 50 50 100
            
            // Separar los valores ingresados en consola
            String[] valores = linea.split(" ");
            String codigo = valores[0];
            int precioCompra = Integer.parseInt(valores[1]);
            int precioVenta = Integer.parseInt(valores[2]);
            int cantidadBodega = Integer.parseInt(valores[3]);
            int cantidadMinima = Integer.parseInt(valores[4]);
            int cantidadMaxima = Integer.parseInt(valores[5]);
            
            // Crear una instancia de la clase producto
            Producto producto = new Producto(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            // Insertar el producto en el vector
            productos[i] = producto;
        }
        
        // Mostrar menú y procesar la opción seleccionada
        int opcionMenu = 0;
        while(opcionMenu != 6) {
            opcionMenu = menu();
            
            // Procesar la opción
            switch(opcionMenu) {
                case 1: 
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i].solicitarPedido()) {
                            System.out.println("Producto con codigo " + productos[i].getCodigo() + " debe solicitar pedido a proveedor");
                        }
                    }
                    break;
                case 2:
                    int posicionMayor = 0;
                    int cantidadMayor = productos[0].getCantidadBodega();
                    for(int i = 1; i < productos.length; i++) {
                        if(productos[i].getCantidadBodega() > cantidadMayor) {
                            posicionMayor = i;
                            cantidadMayor = productos[i].getCantidadBodega();
                        }
                    }
                    System.out.println("El producto con mayor cantidad de unidades es el producto " + productos[posicionMayor].getCodigo() + " con " + cantidadMayor + " unidades.");
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del producto: ");
                    String codigo3 = scanner.nextLine();
                    System.out.println("Ingrese las unidades a comprar: ");
                    int unidades3 = Integer.parseInt(scanner.nextLine());
                    
                    // Buscar el producto en el vector
                    productoEncontrado = false;
                    posicionProducto = 0;
                    while(posicionProducto < productos.length && !productoEncontrado) {
                        if (productos[posicionProducto].getCodigo().equals(codigo3)) {
                            productoEncontrado = true;
                        } else {
                            posicionProducto += 1;
                        }
                    }
                    if (productoEncontrado) {
                        // Calcular valor de la compra
                        int totalCompra = productos[posicionProducto].calcularTotalPagar(unidades3);
                        System.out.println("El total de la compra al proveedor sera de $" + totalCompra);
                    } else {
                        System.out.println("No existe un producto con el codigo ingresado. Intente de nuevo.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del producto");
                    String codigo4 = scanner.nextLine();
                    System.out.println("Ingrese la nueva cantidad minima");
                    int nuevaCantidadMin = Integer.parseInt(scanner.nextLine());
                    
                    // Buscar el producto en el vector
                    productoEncontrado = false;
                    posicionProducto = 0;
                    while(posicionProducto < productos.length && !productoEncontrado) {
                        if (productos[posicionProducto].getCodigo().equals(codigo4)) {
                            productoEncontrado = true;
                        } else {
                            posicionProducto += 1;
                        }
                    }
                    
                    if(productoEncontrado) {
                        System.out.println("Cantidad minima actual: " + productos[posicionProducto].getCantidadMinima());
                        productos[posicionProducto].setCantidadMinima(nuevaCantidadMin);
                        System.out.println("Nueva Cantidad minima: " + productos[posicionProducto].getCantidadMinima());
                    } else {
                        System.out.println("No se encontro un producto con el codigo ingresado");
                    }
                    
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del producto");
                    String codigo5 = scanner.nextLine();
                    System.out.println("Ingrese las unidades a vender: ");
                    int unidadesVenta = Integer.parseInt(scanner.nextLine());
                    
                    // Buscar el producto en el vector
                    productoEncontrado = false;
                    posicionProducto = 0;
                    while(posicionProducto < productos.length && !productoEncontrado) {
                        if (productos[posicionProducto].getCodigo().equals(codigo5)) {
                            productoEncontrado = true;
                        } else {
                            posicionProducto += 1;
                        }
                    }
                    
                    if(productoEncontrado) {
                        // Validar si sí hay unidades para vender
                        if(productos[posicionProducto].getCantidadBodega() >= unidadesVenta) {
                            // calcular el valor de la factura de venta
                            double totalVenta = unidadesVenta * productos[posicionProducto].getPrecioVenta();
                            double totalDescuento = totalVenta * (1 - Producto.DESCUENTO);
                            System.out.println("Total Factura: $" + totalVenta);
                            System.out.println("Total Factura con Descuento: $" + totalDescuento);
                            int cantidadActual = productos[posicionProducto].getCantidadBodega();
                            System.out.println("Unidades actuales: " + cantidadActual);
                            int nuevaCantidadBod = cantidadActual - unidadesVenta;
                            productos[posicionProducto].setCantidadBodega(nuevaCantidadBod);
                            System.out.println("Unidades actuales despues de venta: " + productos[posicionProducto].getCantidadBodega());
                        } else {
                            System.out.println("No hay unidades suficientes para vender este producto.");
                        }
                    } else {
                        System.out.println("No se encontro el produco con el codigo ingresado.");
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar el menu");
                    break;
            }
        }
    }
    
    /**
     * Muestra el menu de opciones al usuario y devuelve la opción seleccionada
     * @return {Integer} la opción seleccionada por el usuario.
     */
    public static int menu() {
        Scanner scannerMenu = new Scanner(System.in);
        
        // Mostrar el menu
        System.out.println("");
        System.out.println("===== MENU DE APLICACION =====");
        System.out.println("1. Verificar productos a pedir");
        System.out.println("2. Producto con mayor cantidad de unidades");
        System.out.println("3. Total a pagar por pedido a realizar");
        System.out.println("4. Modificar cantidad minima requerida");
        System.out.println("5. Vender producto");
        System.out.println("6. Salir de la aplicacion");
        System.out.println("");
        int opcion;
        do {
            System.out.println("Elija una opcion del menu");
            opcion = Integer.parseInt(scannerMenu.nextLine());
        } while (opcion < 1 && opcion > 6);
        
        return opcion;
    }
}
