/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico08;

/**
 *
 * @author Daniel
 */
public class Taxi extends Vehiculo {
    
    private String numeroLicencia;

    public String getNumeroLicencia() {
        this.capacidadBaul = 400;
        System.out.println(this.getMatricula());
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}
