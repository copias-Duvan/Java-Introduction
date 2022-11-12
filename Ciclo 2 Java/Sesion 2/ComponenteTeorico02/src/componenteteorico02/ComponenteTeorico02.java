/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ComponenteTeorico02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        // VECTORES
        
        // Declaración de un vector
        int edad; // Declaración una variable entera
        
        int[] edades = new int[100]; // Declarando un vector llamado edades de tipo entero con 10 posiciones
        // Inicialización de un vector vacío.
        String[] nombres = new String[100];
        // Vector con un tamaño igual a 5
        // Inicialización de vector con sus valores
        String[] animales = { "Perro", "Gato", "Conejo", "Ratón", "Tortuga" };
        
        // vector.length ==> length nos permite saber la longitud del vector.
        System.out.println("La longitud del vector edades es: " + edades.length);
        
        // Escritura de un vector
        int N = 5; // N no puede ser mayor a la longitud del vector
        // for(int i = 0; i < edades.length; i++) {
        /* for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la edad de la persona #" + (i+1));
            
            // Para acceder a la posicion de un vector. se usa la sgte estructura:
            // vector[posicion] <== nos devuelve una referencia del valor del vector en la posicion especificada.
            edades[i] = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("");
        // Lectura de un vector
        // for(int i = 0; i < edades.length; i++) {
        for (int i = 0; i < N; i++) {
            System.out.println("La edad de la persona #" + (i+1) + " es: " + edades[i]);
        } */
        
        
        // Inserción de datos en un vector (ordenado)
        /*int[] valores = new int[100];
        int insertar, limite;
        
        System.out.println("Ingrese la cantidad de elementos: ");
        limite = Integer.parseInt(scanner.nextLine());
        
        // Llenar el vector con numeros (ordenados)
        for (int i=0; i < limite; i++) {
            System.out.println("Ingrese el valor de la posicion " + i);
            valores[i] = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("Ingrese el valor a insertar");
        insertar = Integer.parseInt(scanner.nextLine());
        
        // Mostrar los datos del vector
        System.out.println("Vector antes de la insercion");
        for(int i = 0; i < limite; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("");
        int pos = 0;
        // Encontrar la posicion donde voy a insertar el numero
        while(insertar > valores[pos] && pos < limite) {
            pos += 1;
        }
        // rodar los elementos a la derecha
        for (int i = limite-1; i >=pos; i--) {
            valores[i+1] = valores[i];
        }
        valores[pos] = insertar;
        System.out.println("Vector despues de la insercion");
        for(int i = 0; i <= limite; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("");*/
        
        // Inserción de un vector (no ordenado)
        // pedir el valor a ingresar
        // pedor la posicion donde vamos a insertar
        
        /* int[] valores = new int[100];
        int insertar, posInsercion, limite;
        
        System.out.println("Ingrese la cantidad de elementos: ");
        limite = Integer.parseInt(scanner.nextLine());
        
        // Llenar el vector con numeros
        for (int i=0; i < limite; i++) {
            System.out.println("Ingrese el valor de la posicion " + i);
            valores[i] = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("Ingrese el valor a insertar");
        insertar = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese la posicion donde se debe hacer la insercion");
        posInsercion = Integer.parseInt(scanner.nextLine());
        
        if(posInsercion < limite) {
            // Mostrar los datos del vector
            System.out.println("Vector antes de la insercion");
            for(int i = 0; i < limite; i++) {
                System.out.print(valores[i] + " ");
            }
            System.out.println("");
            
            // rodando los valores a la derecha
            for(int i = limite-1; i >=posInsercion; i--) {
                valores[i+1] = valores[i];
            }
            // inserción del valor
            valores[posInsercion] = insertar;
            
            // Mostrar los datos del vector
            System.out.println("Vector despues de la insercion");
            for(int i = 0; i <= limite; i++) {
                System.out.print(valores[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("La posicion ingresada es mayor a la cantidad de elementos del vector");
        } */
        
        // Busqueda y eliminacion de un elemento de datos en un vector
        /*int[] vectorValores = { 10, 50 , 59, 22, 48, 70, 105 };
        int valorBuscar = 22, pos = 0;
        boolean valorEncontrado = false;
        
        // Iniciar la busqueda
        while (pos < vectorValores.length && !valorEncontrado) {
            if(valorBuscar == vectorValores[pos]) {
                valorEncontrado = true;
            } else {
                pos += 1;
            }
        }
        if(valorEncontrado) {
            System.out.println("Se encontro el valor en la posicion " + pos);
            // Eliminación
            for (int i= pos+1; i < vectorValores.length; i++) {
                vectorValores[i-1] = vectorValores[i];
            }
            // Mostrar los datos del vector
            System.out.println("Vector despues de la eliminacion");
            for(int i = 0; i < vectorValores.length - 1; i++) {
                System.out.print(vectorValores[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("El numero buscado no fue encontrado");
        }*/
        
        // MATRICES
        // Es un vector de vectores
        
        // DEclaración
        // Matriz vacia
        /*int[][] A = new int[50][100];
        int[][] B = new int[50][100];
        System.out.println(A.length);
        System.out.println(A[0].length);
        
        // inicializar una matriz con valores
        int[][] tablaDatos = {
            { 2, 10, 20, 50, 80 },
            { 3, 5, 10, 40, 60, 60 }
        };
        System.out.println(tablaDatos.length);
        System.out.println(tablaDatos[0].length);
        System.out.println(tablaDatos[1].length);
        
        // Escritura de una matriz
        int longitud = 3;
        // Ciclo para recorrer cada fila de la matriz
        for (int i = 0; i < longitud; i++) {
            // Ciclo para recorrer cada columna de la matriz
            for (int j = 0; j < longitud; j++) {
                System.out.println("Ingrese el valor para la posición A(" + i + ", " + j + "):");
                // Llenado de matriz recorriendo fila por fila
                A[i][j] = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese el valor para la posición B(" + j + ", " + i + "):");
                // Llenado de matriz recorriendo columna por columna
                B[j][i] = Integer.parseInt(scanner.nextLine());
                System.out.println("");
            }
        }
        
        // Mostrar valores de una matriz
        // A
        for(int i = 0; i < longitud; i++) {
            for(int j = 0; j < longitud; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        // B
        for(int i = 0; i < longitud; i++) {
            for(int j = 0; j < longitud; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");*/
        
        // Matriz Identidad
        /*int[][] MI = new int[4][4];
        
        // Llenar la matriz identidad
        for(int i=0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if (i == j) {
                    MI[i][j] = 1;
                } else {
                    MI[i][j] = 0;
                }
            }
        }
        
        // Mostrar matriz identidad
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(MI[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");*/
        
        
        // Suma de matrices
        int[][] A = {
            { 1, 2, 2 },
            { 1, 2, 3 },
            { 2, 1, 2 }
        };
        
        int[][] B = {
            { 2, 2, 2 },
            { 1, 1, 1 },
            { 4, 4, 3 }
        };
        
        int[][] C = new int[3][3];
        
        int dimension = 3;
        
        for(int i = 0; i < dimension; i++) {
            for(int j = 0; j < dimension; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        // Mostrar resultado de la suma
        for(int i = 0; i < dimension; i++) {
            for(int j = 0; j < dimension; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
