/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteherencia;

/**
 *
 * @author Daniel
 */
public class EstudianteTIC extends Persona {
    // Atributos
    private double nota1;
    private double nota2;
    private double promedio;
    
    // Constructor
    public EstudianteTIC(String nombre, String apellido, int edad, double nota1, double nota2) {
        // super
        // Invocar el constructor de la clase padre
        super(nombre, apellido, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public EstudianteTIC(double nota1, double nota2) {
        // super()
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public EstudianteTIC(String nombre, String apellido, double nota1, double nota2) {
        super(nombre, apellido); // Invocacion del constructor de la clase padre
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    // Métodos

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    private void actualizarPromedio() {
        double promedio = (nota1 + nota2) / 2;
        this.promedio = promedio;
    }
}
