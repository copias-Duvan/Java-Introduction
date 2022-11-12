/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico09;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ComponentePractico09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de prendas de vestir: ");
        int cantidadPrendas = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite la cantidad de calzados: ");
        int cantidadCalzados = Integer.parseInt(scanner.nextLine());
        
        Prenda[] prendas = new Prenda[cantidadPrendas];
        Calzado[] calzados = new Calzado[cantidadCalzados];
        
        String  linea = "";
        
        System.out.println("--------------------------");
        System.out.println("PRENDAS");
        System.out.println("");
        for (int i = 0; i < cantidadPrendas; i++) {
            System.out.println("Ingrese la información de la prenda #" + (i+1));
            linea = scanner.nextLine();
            String[] datosPrenda = linea.split("-");
            String codigo = datosPrenda[0];
            int precioCompra = Integer.parseInt(datosPrenda[1]);
            int precioVenta = Integer.parseInt(datosPrenda[2]);
            int cantidadBodega = Integer.parseInt(datosPrenda[3]);
            int cantidadMinima = Integer.parseInt(datosPrenda[4]);
            int cantidadMaxima = Integer.parseInt(datosPrenda[5]);
            String talla = datosPrenda[6];
            boolean permitePlanchado = Boolean.parseBoolean(datosPrenda[7]);
            
            Prenda prenda = new Prenda(talla, permitePlanchado, codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            prendas[i] = prenda;
        }
        System.out.println("");
        
        System.out.println("--------------------------");
        System.out.println("CALZADOS");
        System.out.println("");
        for (int i = 0; i < cantidadCalzados; i++) {
            System.out.println("Ingrese la información del calzados #" + (i+1));
            linea = scanner.nextLine();
            String[] datosCalzado = linea.split("-");
            String codigo = datosCalzado[0];
            int precioCompra = Integer.parseInt(datosCalzado[1]);
            int precioVenta = Integer.parseInt(datosCalzado[2]);
            int cantidadBodega = Integer.parseInt(datosCalzado[3]);
            int cantidadMinima = Integer.parseInt(datosCalzado[4]);
            int cantidadMaxima = Integer.parseInt(datosCalzado[5]);
            int talla = Integer.parseInt(datosCalzado[6]);
            
            Calzado calzado = new Calzado(talla, codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            calzados[i] = calzado;
        }
        
        
        // Consultar producto
        int opcion;
        do {
            System.out.println("Digite la opción");
            opcion = Integer.parseInt(scanner.nextLine());
            
            if(opcion == 1) {
                System.out.println("Ingrese el código del producto: ");
                String codigoProducto = scanner.nextLine();
                System.out.println("Ingrese el tipo: P para prenda, C para calzado");
                String tipoProducto = scanner.nextLine();
                
                // Buscar el producto dentro del vector correspondiente;
                if(tipoProducto.equalsIgnoreCase("p")) {
                    for(int i = 0; i < prendas.length; i++) {
                        if(prendas[i].getCodigo().equals(codigoProducto)) {
                            System.out.println(prendas[i].mostrar());
                        }
                    }
                } else if (tipoProducto.equalsIgnoreCase("c")) {
                    for(int i = 0; i < calzados.length; i++) {
                        if(calzados[i].getCodigo().equals(codigoProducto)) {
                            System.out.println(calzados[i].mostrar());
                        }
                    }
                } else {
                    System.out.println("Tipo de producto incorrecto");
                }
            }
            System.out.println("");
        } while(opcion == 1);
    }
    
}
