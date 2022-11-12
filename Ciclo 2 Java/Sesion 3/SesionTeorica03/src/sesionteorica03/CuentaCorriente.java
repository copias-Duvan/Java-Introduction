/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesionteorica03;

/**
 *
 * @author Daniel
 */
// Utilizar Pascal Case para dar nombre a las clases
// Partido de Futbol ==> PartidoFutbol
// Pascal Case ==> Si contamos con varias palabras,
// Se deben unir sin espacios
// La inicial de cada palabra debe estar en mayúsculas
// El resto de las palabras en minúscula
// Estudiante Mision TIC ==> Pascal Case ==> EstudianteMisionTic

public class CuentaCorriente {
    
    // Atributos
    // Atributos ==> variables
    String numero;
    String nombreTitular;
    int saldo;
    
    // Constructor
    // Es una función que se va a ejecutar cada vez que creemos una nueva instancia de una clase
    // Normalmente se utiliza para inicializar los atributos de un objeto
    
    public CuentaCorriente(String numeroCuenta, String nombrePersona) {
        numero = numeroCuenta;
        nombreTitular = nombrePersona;
        saldo = 0;
    }
    
    // Métodos
    // Métodos ==> funciones
    
    // Depositar
    void depositar(int cantidadDeposito) {
        saldo += cantidadDeposito;
    }
    
    // Retirar
    void retirar(int cantidadRetiro) {
        if (cantidadRetiro <= saldo) {
            saldo -= cantidadRetiro;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
    
    // Consultar saldo
    void consultarSaldo() {
        System.out.println("El saldo de su cuenta es $" + saldo);
    }
    
}

// FUNCION
// Es un procedimiento que realiza una cierta accion o acciones definidas previamente
// 1. (Opcional) Recibe unos datos de entrada
// 2. Procesa dichos datos / ejecuta ciertas acciones
// 3. (Opcional) devuelve un resultado

// SINTÁXIS DE UNA FUNCION
// tipoDeDato nombreFuncion (tipo1 param1, tipo2 param2, ..., tipoN paramN) {
//      Logica de la funcion
//      return resultado; // el tipo de dato de resultado coincide con el tipo de dato de la función
// }

/*
int sumar(int numero1, int numero2) {
    int suma = numero1 + numero2;
    return suma; 
}

String construirNombre(String nombre, String apellido) {
    String nombreCompleto = nombre + " " + apellido;
    return nombreCompleto;
}

// Hay un grupo de funciones que solamente hacen una acción
// Pero no necesariamente retornan un resultado.
// tipo = void

void imprimirMensajeConsola(String mensaje) {
    System.out.println(mensaje);
}
*/
