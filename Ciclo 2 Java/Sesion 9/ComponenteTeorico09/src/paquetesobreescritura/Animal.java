/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetesobreescritura;

/**
 *
 * @author Daniel
 */
public class Animal {
    protected String nombreAnimal;
    protected int cantidadPatas;
    protected String sonido;

    public Animal(String nombre) {
        this.nombreAnimal = nombre;
    }
    
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
    
    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace el sonido " + this.sonido);
    }
    
    public void hacerSonido(String sonido) {
        System.out.println("El animal hace el sonido " + sonido);
    }
}
