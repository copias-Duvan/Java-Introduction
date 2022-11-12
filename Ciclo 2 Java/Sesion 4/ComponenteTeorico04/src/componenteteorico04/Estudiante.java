/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico04;

/**
 *
 * @author Daniel
 */
public class Estudiante {
    
    String nombre;
    double nota1, nota2, nota3;
    double definitiva;
    
    public Estudiante(String nombre, double n1, double n2, double n3) {
        this.nombre = nombre;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        definitiva = calcularPromedio();
    }
    
    private double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
