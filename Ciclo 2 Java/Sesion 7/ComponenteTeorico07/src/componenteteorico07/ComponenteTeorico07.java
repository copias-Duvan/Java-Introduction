/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico07;

/**
 *
 * @author Daniel
 */
public class ComponenteTeorico07 {

    public static int edad;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Computador.serial = "valor inicial";
        
        Computador pc = new Computador("2022", "50");
        
        Computador compu = new Computador("2023", "51");*/
        
        CuentaAhorros cuenta1 = new CuentaAhorros("123", "Daniel");
        cuenta1.setNombreTitular("Daniel Blanco");
        cuenta1.interes = 0.02;
        cuenta1.nombreSucursal = "Ciclo 2 NRC 1857";
    }
    
}
