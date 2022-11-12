/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico09;

import paquetesobreescritura.Gato;
import paquetesobreescritura.Perro;

/**
 *
 * @author Daniel
 */
public class ComponenteTeorico09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Estudiante estudiante1 = new Estudiante("Daniel");
        Estudiante estudiante2 = new Estudiante("Maria", 4.5, 3.8, 4.0);
        Estudiante estudiante3 = new Estudiante(4.5, 4.8);
        // Estudiante estudiante4 = new Estudiante("Daniel", "Blanco");
        
        Formador daniel = new Formador("Daniel", "Blanco");
        System.out.println(daniel.getNombre());
        System.out.println(daniel.getApellido());
        System.out.println(daniel.getCantidadCursos());
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del formador: ");
        String nombreFormador = scanner.nextLine();
        System.out.println("Ingrese el apellido del formador: ");
        String apellidoFormador = scanner.nextLine();
        
        Formador formador = new Formador(nombreFormador, apellidoFormador);*/
        
        Perro perro = new Perro("perro");
        perro.setSonido("guau");
        perro.hacerSonido();
        
        Gato gato = new Gato("gato");
        gato.setSonido("miau");
        gato.hacerSonido();
    }
    
}
