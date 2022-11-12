/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetesobreescritura;

/**
 *
 * @author Daniel
 */
public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        // super es una referencia a la clase padre
        // Lo cual nos permite tener acceso a sus métodos y atributos
        super.hacerSonido(); // Invocar el método hacerSonido que está definido en Animal.java
        System.out.println("El " + this.nombreAnimal + " hace el sonido " + this.sonido);
    }
}
