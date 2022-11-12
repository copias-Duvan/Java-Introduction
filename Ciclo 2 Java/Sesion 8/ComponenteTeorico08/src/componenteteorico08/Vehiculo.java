/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico08;

/**
 *
 * @author Daniel
 */
public class Vehiculo {
    
    private String matricula = "ABC";
    private String modelo;
    private String potencia;
    public int numeroPuertas;
    protected int capacidadBaul;
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public String getPotencia() {
        return this.potencia;
    }
    
    public int getCapacidadBaul() {
        return this.capacidadBaul;
    }
}
