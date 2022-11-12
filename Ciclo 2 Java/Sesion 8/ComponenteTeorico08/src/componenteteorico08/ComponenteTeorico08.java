/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico08;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ComponenteTeorico08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.getMatricula();
        vehiculo.getModelo();
        vehiculo.getPotencia();
        vehiculo.numeroPuertas = 2;
        vehiculo.capacidadBaul = 250;
        
        Taxi taxi = new Taxi();
        // Métodos propios
        taxi.getNumeroLicencia();
        // Métodos comunes (heredados)
        taxi.getMatricula();
        taxi.getModelo();
        taxi.getPotencia();
        taxi.numeroPuertas = 4;
        
        Autobus autobus = new Autobus();
        // Métodos propios
        autobus.getNumeroCupos();
        // Métodos heredados de Taxi
        autobus.getNumeroLicencia();
        // Métodos heredados de Vehiculo
        autobus.getMatricula();
        autobus.getModelo();
        autobus.getPotencia();
        autobus.numeroPuertas = 2;
        */
        
        
        // El usuario debe indicar C para calzado y P para prenda
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese C para calzado o P para prenda");
        String opcion = scanner.nextLine();
        // 1. c     ==> Calzado
        // 2. C     ==> Calzado
        // 3. p     ==> Prenda
        // 4. P     ==> Prenda
        // 5. __    ==> Opcion incorrecta
        
        // String.equals ==> verificar que una cadena sea igual a otra
        // "HOLA".equals("HOLA") ==> true
        // "HOLA".equals("hola") ==> false
        
        // String.equalsIgnoreCase ==> verifica que las cadenas sean iguales, ignorando mayusculas y minusculas
        // "SI".equalsIgnoreCase("SI") ==> true
        // "SI".equalsIgnoreCase("si") ==> true
        // "SI".equalsIgnoreCase("Si") ==> true
        // "SI".equalsIgnoreCase("sI") ==> true
        // "SI".equalsIgnoreCase("No") ==> false
        
        if(opcion.equalsIgnoreCase("P")){
            System.out.println("Usted eligio una prenda");
        } else if (opcion.equalsIgnoreCase("C")) {
            System.out.println("Usted eligio un calzado");
        } else {
            System.out.println("Opción incorrecta");
        }
    }
    
}
