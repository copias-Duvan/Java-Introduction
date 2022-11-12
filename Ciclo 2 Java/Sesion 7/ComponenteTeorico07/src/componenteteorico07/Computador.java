/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico07;

/**
 *
 * @author Daniel
 */
public class Computador {
    
    private String modelo;
    public static String serial;
    
    public Computador(String modelo, String numeroSerial) {
        System.out.println(serial);
        this.modelo = modelo;
        serial = numeroSerial;
        System.out.println(serial);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
