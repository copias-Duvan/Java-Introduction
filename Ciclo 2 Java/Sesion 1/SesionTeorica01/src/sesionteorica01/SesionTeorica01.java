/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesionteorica01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SesionTeorica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero; // Variable tipo entero; si no hay valor inicial, Java le asigna 0
        float flotante = 2.5f; // Variable flotante, se debe colocar f junto al valor numérico
        double decimal = 2.99; // Variable tipo double
        char caracter = 'D'; // Variable tipo caracter. el valor siempre va dentro de comillas simples. Longitud siemore es 1
        String cadena = "hola mundo"; // String se almacena usando comillas dobles. Si no se especifica un valor inicial. Java asigna null a esta variable
        boolean logica = true; // Variables de tipo logico. true si es verdadero, false si es falso. Valor por defecto es false.
        // Definir una variable para la edad, otra para la velocidad y una mas para la aceleracion
        int edad = 26, velocidad = 80, aceleracion = 50;
        
        // Esto es un comentario. Esto es una linea de codigo que no será procesada por el compilador
        // Estos comentarios son de una linea
        /* Esto es un comentario
        dividido en varias lineas
        todo lo que esté entre los caracteres / * y * / se considerarán parte del comentario
        FIN DEL COMENTARIO */
        
        // Mostramos información en consola (Escritura)
        // System.out.print(mensaje) // escribe un mensaje en una linea
        // System.out.println(mensaje) // escribe un mensaje en una linea y presiona enter
        System.out.print("Hola mi nombre es ");
        System.out.print("Daniel");
        System.out.println("Hola mi nombre es ");
        System.out.println("15457");
        
        // Conversión numerica
        // Entero a String
        int numeroConvertir = 1500;
        String numeroConvertido = Integer.toString(numeroConvertir);
        
        // String a Entero
        String cadenaConvertir = "145753";
        int cadenaConvertida = Integer.parseInt(cadenaConvertir);
        
        // String a flotante
        float floatConvertido = Float.parseFloat(cadenaConvertir);
        
        // String a Double
        double decimalConvertido = Double.parseDouble(cadenaConvertir);
        
        // Asignación de valor
        // En la izquierda va la variable que quiero modificar o asignar el valor
        // A la derecha va el valor que se le va a asignar a la variable. Puede ser otra variable.
        // La asignación se realiza con el simbolo = 
        numero = 50;
        int numero2 = numero;
        
        // Operaciones aritmeticas
        System.out.println(2 + 2);
        System.out.println(7 - 5);
        System.out.println(45 * 68);
        System.out.println(18 / 6);
        System.out.println(15 % 2);
        System.out.println(15 / 2);
        System.out.println(15.0 / 2);
        System.out.println(Math.pow(2, 3));
        
        // Como leer información de la consola
        // Definir un objeto de tipo Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        /*System.out.println("Ingrese su nombre: ");
        // Si quiero leer un string en consola utilizo el método nextLine()
        String nombreUsuario = scanner.nextLine();
        System.out.println("El nombre ingresado fue: " + nombreUsuario);
        System.out.println("Ingrese el numero de cursos: ");
        String _cursos = scanner.nextLine();
        int numeroCursos = Integer.parseInt(_cursos);
        System.out.println("La cantidad de cursos ingresada fue: " + (numeroCursos + 1));
        System.out.println("Ingrese su edad: ");
        // lee lo que viene de la consola y hace la conversión a número entero. Si el valor escrito no es un numero, genera una excepción (error)
        int edadUsuario = scanner.nextInt();
        System.out.println("La edad ingresada fue: " + edadUsuario);*/
        
        // Operadores relacionales
        System.out.println(2 > 4);                          // false
        System.out.println(4 > 2); // Mayor >               // true
        System.out.println(2 < 4); // Menor <               // true
        System.out.println(10 >= 4); // Mayor o igual >=    // true
        System.out.println(4 >= 4); // Mayor o igual >=     // true
        System.out.println(2 <= 2); // Menor o igual <=     // true
        System.out.println(2 == 2); // Igualdad ==          // true
        System.out.println(4 != 4); // Diferencia           // false
        System.out.println(10 != 5); // Diferencia          // true
        
        // Operadores logicos
        System.out.println("");
        System.out.println(2 > 4 && 4 > 2); // Y se representa con && (ampersand)
        System.out.println(4 > 2 || 4 != 4); // O se representa con ||
        System.out.println(!(2 > 4));
        System.out.println(!(4 > 2));
        
        // Precedencia de operadores
        System.out.println("");
        System.out.println("Precedencia");
        boolean resultado = !(((2 * 4) * 15 + 20 + 5 * 4) > 30 && (2*Math.pow(3, 2) > 20));
        // !((8 * 15 + 20 + 5 * 4) > 30 && (2 * 9 > 20))
        // !((120 + 20 + 20) > 30 && (18 > 20))
        // !( 160 > 30 && 18 > 20 )
        // !( true && false )
        // !(false)
        // true
        System.out.println(resultado);
        
        String cadena2 = "";
        // int cantidadDeHijos = "dos";
        // System.out.println(2 / 0);
        
        // Estructuras condicionales
        System.out.println("Estructuras condicionales");
        // SI - SINO
        // Si
        // if (expresion (debe poder devolver un valor booleano)) { 
        //      el codigo que se ejecuta si la expresion es true
        // }
        
        if ( 4 > 2) {
            System.out.println("Cuatro es mayor que dos");
        }
        if ( 4 > 10 ) {
            System.out.println("Cuatro es mayor que diez");
        }
        // En caso de que el bloque sea de solamente 1 linea se pueden omitir los corchetes
        if ( 2 == 2)
            System.out.println("dos es igual a 2");
        System.out.println("Hola mundo");
        
        // Condicionales dobles
        if ( 2 != 2) {
            // Este bloque se ejecuta cuando la condición evalúa como verdadera
            System.out.println("La expresion evaluo como verdadera");
        } else {
            // Este bloque se ejecuta cuando la condición evalúa como falsa
            System.out.println("La expresion evaluo como falsa");
        }
        
        // Condicionales multiples
        int edadCliente = 15;
        if(edadCliente < 18) {
            System.out.println("Usted es menor de edad. No puede ingresar");
        } else if (edadCliente == 18) {
            System.out.println("Usted acaba de cumplir 18 años. Bienvenido");
        } else {
            System.out.println("Bienvenido de nuevo!");
        }
        
        // Condicionales anidados
        System.out.println("");
        System.out.println("Condicionales anidados");
        edadCliente = 60;
        if(edadCliente < 18) {
            System.out.println("Usted es menor de edad. No puede ingresar");
            if(edadCliente <= 12) {
                System.out.println("Lo invitamos a usar el parque de juegos de niños");
            } else {
                System.out.println("Usted debe cumplir por lo menos 18 años para ingresar");
            }
        } else if (edadCliente == 18) {
            System.out.println("Usted acaba de cumplir 18 años. Bienvenido");
        } else {
            if (edadCliente <= 40) {
                System.out.println("Bienvenido de nuevo! Disfrute la estadía");
            } else {
                System.out.println("Bienvenido de nuevo! Disfrute con cuidado");
            }
        }
        
        // DEPENDIENDO DE
        System.out.println("");
        System.out.println("Dependiendo de: ");
        int opcion = 2;
        /*if (opcion == 1) {
            System.out.println("Hamburguesa con papitas");
        } else if (opcion == 2) {
            System.out.println("Hamburguesa doble con papas y gaseosa");
        } else if (opcion == 3) {
            System.out.println("Hamburguesa de pollo con papas a la francesa");
        } else if (opcion == 4) {
            System.out.println("Nuggets de pollo con gaseosa");
        } else if (opcion == 5) {
            System.out.println("Ensalada con jugo natural");
        } else if (opcion == 6) {
            System.out.println("Botella de agua con gas");
        } else {
            System.out.println("Opcion incorrecta!");
        }*/
        opcion = 2;
        switch (opcion) {
            case 1:
            case 2:
                System.out.println("Hamburguesa con papitas");
                break;
            case 3:
                System.out.println("Hamburguesa de pollo con papas a la francesa");
                break;
            case 4:
                System.out.println("Nuggets de pollo con gaseosa");
                break;
            case 5:
                System.out.println("Ensalada con jugo natural");
                break;
            case 6:
                System.out.println("Botella de agua con gas");
                break;
            default:
                System.out.println("Opcion incorrecta!");
                break;
        }
        
        int opcionMenu = 0;
        // 1 - 6 (opciones validas)
        /*while (opcionMenu <= 0 || opcionMenu > 6) {
            System.out.println("Ingrese la opción del menú");
            opcionMenu = scanner.nextInt();
            if(opcionMenu <= 0 || opcionMenu > 6) {
                System.out.println("Opcion incorrecta. Elija de nuevo");
            }
        }
        System.out.println("Escogiste la opción: " + opcionMenu);*/
        
        // Estructuras ciclicas
        System.out.println("");
        System.out.println("Estructuras ciclicas");
        
        // Mientras que (while)
        System.out.println("");
        System.out.println("Mientras que (while)");
        
        // Estructura
        // while (expresion) {
        //  bloque de codigo que se ejecuta mientras expresion sea verdadero
        // }
        
        int contador = 11;
        int limite = 10;
        while(contador <= limite) {
            System.out.println(contador);
            contador = contador + 1;
        }
        System.out.println(contador);
        
        System.out.println("");
        System.out.println("Hacer hasta (do while)");
        
        // Estructura
        /*  do {
        *       // bloque de codigo que se ejecuta
        *   } while (expresion)
        */
        contador = 11;
        limite = 10;
        do {
            System.out.println(contador);
            contador = contador + 1;
        } while (contador <= limite);
        System.out.println(contador);
        
        
        System.out.println("");
        System.out.println("Ciclo para (for)");
        
        // Estructura
        /*
        *   for (valorInicial; expresion (limite); incremento) {
        *       // bloque de codigo a ejecutar
        *   }
        */
        contador = 0;
        limite = 10;
        for(int i = contador; i <= limite; i++) {
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("Operadores de asignación compuestos");
        
        contador = 1;
        limite = 10;
        while(contador <= limite) {
            System.out.println(contador);
            // contador = contador + 1;
            contador += 1;
            
            // contador = contador - 1;
            // contador -= 1;
            
            // contador = contador * 2;
            // contador *= 2;
            
            // contador = contador / 3;
            // contador /= 3;
            
            // contador = contador % 2;
            // contador %= 2;
        }
        
        // Operadores de incremento o decremento
        // suma ++
        // resta --
        
        int a = 4;
        int b = a++;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        
        a = 4;
        b = ++a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        
        a = 4;
        b = a--;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        
        a = 4;
        b = --a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
    
}
