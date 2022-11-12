/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico09;

/**
 *
 * @author Daniel
 */
public class Estudiante {
    private String nombre;
    private double nota1, nota2, nota3;
    private double promedio;
    private String apellido;
    private boolean cursoAprobado;
    
    // Sobrecarga de métodos
    // Capacidad de poder definir multiples métodos con el mismo nombre
    // Pero con diferente cantidad de parámetros, o tipos de datos
    // Los 2 criterios de validación para la sobrecarga de métodos son:
    // 1. La cantidad de parámetros
    // 2. Los tipos de datos de los parámetros
    
    
    // VALORES INICIALES PARA VARIABLES NO INICIALIZADAS
    // int, float, double, long,... (Variables de tipo numericas) ==> 0
    // String, Objeto                                             ==> null
    // boolean                                                    ==> false
    
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.actualizarPromedio();
    }
    
    public Estudiante(double nota1) {
        this.nombre = "";
        this.nota1 = nota1;
        this.nota2 = 0;
        this.nota3 = 0;
        this.actualizarPromedio();
    }
    
    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre + " " + apellido;
        System.out.println(this.nota1);
        System.out.println(this.nota2);
        System.out.println(this.nota3);
        System.out.println(this.apellido);
        System.out.println(this.cursoAprobado);
    }
    
    public Estudiante(double nota1, double nota2) {
        
    }
    
    public Estudiante(String nombre, double nota1) {
        
    }
    
    public Estudiante(double nota1, String nombre) {
        
    }
    
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.actualizarPromedio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void actualizarPromedio() {
        double promedio = (nota1 + nota2 + nota3) / 3;
        this.promedio = promedio;
    }
}
