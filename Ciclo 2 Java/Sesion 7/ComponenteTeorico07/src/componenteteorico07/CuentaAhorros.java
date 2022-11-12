/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico07;

/**
 *
 * @author Daniel
 */
public class CuentaAhorros {
    
    private String identificacionTitular;
    private String nombreTitular;
    private double saldo;
    public double interes;
    String nombreSucursal;
    
    public CuentaAhorros(String identificacionTitular, String nombreTitular) {
        // this --> una palabra reservada en Java
        // Hace referencia a una instancia de la clase que se está definiendo
        // CuentaAhorros cuenta = new CuentaAhorros()
        // cuenta es el nombre de la instancia de esa clase.
        // this se refiere a la instancia de esa clase
        // this solamente se puede utilizar dentro de la definición de la clase
        this.identificacionTitular = "246870";
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
        setIdentificacionTitular(identificacionTitular);
        this.interes = 0.01;
        this.nombreSucursal = "Ciclo 2";
    }

    public String getIdentificacionTitular() {
        return identificacionTitular;
    }

    public void setIdentificacionTitular(String identificacionTitular) {
        this.identificacionTitular = identificacionTitular;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }
    
    
}
