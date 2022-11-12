/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesionteorica03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SesionTeorica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Crear una clase para describir una cuenta corriente
        // 2. Crear un constructor
        // 3. Atributos
        // 4. Métodos
        
        // 5. Crear instancia(s) de la clase cuenta corriente
        // 6. Manipular esas instancias / objetos
        
        
        // CREAR UNA INSTANCIA DE UNA CLASE
        // NombreClase nombreObjeto = new NombreClase(parametro(s));
        Scanner scanner = new Scanner(System.in);
        
        CuentaCorriente cuentaDaniel = new CuentaCorriente("123456789", "Daniel Blanco");
        CuentaCorriente cuentaMaria = new CuentaCorriente("987654321", "Maria Perez");
        
        System.out.println("Ingrese el número de la cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el nombre del titular: ");
        String nombreTitular = scanner.nextLine();
        
        CuentaCorriente cuenta1 = new CuentaCorriente(numeroCuenta, nombreTitular);
        
        System.out.println("El numero de la cuenta es " + cuenta1.numero);
        System.out.println("El titular de la cuenta es " + cuenta1.nombreTitular);
        
        cuenta1.consultarSaldo();
        cuenta1.depositar(500000);
        cuenta1.retirar(400000);
        cuenta1.consultarSaldo();
        cuenta1.depositar(100000);
        cuenta1.consultarSaldo();
        cuenta1.retirar(1000000);
        cuenta1.consultarSaldo();
    }
    
}
