/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico04;

/**
 *
 * @author Daniel
 */
public class ComponenteTeorico04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaAhorros cuenta1 = new CuentaAhorros();
        cuenta1.numeroCuenta = "1234";
        cuenta1.nombreTitular = "Daniel";
        
        // cuenta1.depositar(5000);
        cuenta1.retirar(20000);
        cuenta1.consultarSaldo();
        
        Estudiante daniel = new Estudiante("Daniel Blanco", 5, 4.2, 3.3);
        System.out.println("La definitiva del estudiante es: " + daniel.definitiva);
    }
    
}
