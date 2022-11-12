/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico04;

/**
 *
 * @author Daniel
 */
public class CuentaAhorros {
    
    public String numeroCuenta;
    protected String nombreTitular;
    private double saldo;
    
    public CuentaAhorros() {
        saldo = 0;
    }
    
    private void depositar(int cantidad) {
        saldo += cantidad;
    }
    
    protected void retirar(int cantidad) {
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            saldo -= cantidad;
        }
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo es: " + saldo);
    }
}
