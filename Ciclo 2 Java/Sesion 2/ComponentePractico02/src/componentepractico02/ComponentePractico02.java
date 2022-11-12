/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ComponentePractico02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // 1. Solicitar los códigos de los productos
        System.out.println("Ingrese códigos de los productos (separados por espacio)");
        String lineaCodigos = scanner.nextLine();
        
        // Crear un vector con los códigos
        String[] codigos = lineaCodigos.split(" ");
        int cantidadProductos = codigos.length;
        
        // 2. Solicitar las cantidades en bodega
        System.out.println("Ingrese las cantidades en bodega, filas separadas por ; y columnas por espacio");
        String lineaCantidadB = scanner.nextLine();
        
        // 3. Solicitar las cantidades minimas
        System.out.println("Ingrese las cantidades minimas, filas separadas por ; y columnas por espacio");
        String lineaCantidadM = scanner.nextLine();
        
        // Construir la matriz de cantidades en bodega
        int[][] cantidadesBodega = new int[100][100];
        // Obtener las filas
        String[] filas = lineaCantidadB.split(";");
        int cantidadSedes = filas.length;
        for (int i = 0; i < filas.length; i++) {
            // Obtener las columnas
            String[] columnas = filas[i].split(" ");
            for (int j=0; j < columnas.length; j++) {
                cantidadesBodega[i][j] = Integer.parseInt(columnas[j]);
            }
        }
        
        // Construir la matriz de cantidades minimas
        int[][] cantidadesMinimas = new int[100][100];
        // Obtener las filas
        String[] filasMin = lineaCantidadM.split(";");
        for (int i = 0; i < filasMin.length; i++) {
            // Obtener las columnas
            String[] columnas = filasMin[i].split(" ");
            for (int j=0; j < columnas.length; j++) {
                cantidadesMinimas[i][j] = Integer.parseInt(columnas[j]);
            }
        }
        
        // 4. Informar sobre que productos requieren pedido al proveedor
        for (int i = 0; i < cantidadSedes; i++) {
            for (int j = 0; j < cantidadProductos; j++) {
                // Verificar si se requiere hacer pedido a proveedor
                if (cantidadesBodega[i][j] < cantidadesMinimas[i][j]) {
                    System.out.println("Se debe solicitar producto " + codigos[j] + " en sede " + i);
                }
            }
        }
        
        // 5. Calcular promedio de cada producto
        for (int j = 0; j < cantidadProductos; j++) {
            int suma = 0;
            for (int i = 0; i < cantidadSedes; i++) {
                suma += cantidadesBodega[i][j];
            }
            double promedio = suma / cantidadSedes;
            System.out.println("El promedio de productos del codigo " + codigos[j] + " es " + promedio);
        }
    }
    
}
