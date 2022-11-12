/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duvan
 */
public class reto2 {

    public static void main(String[] args) {
        
        //Numero de cuerpos de agua a analizar
        Scanner scanner = new Scanner(System.in);
        int cueofWa;
        cueofWa = Integer.parseInt(scanner.nextLine());
        
 
        // Vector contenedor de los datos ingresados previamente
        String vecIni[] = new String[200]; 
        // Matriz
        String[][] contenedora = new String[100][100];
        
        //Ingreso de datos de el usuario
        for(int i = 0; i<cueofWa; i++){
            String pedDat = scanner.nextLine(); //Pedir Datos
            vecIni[i] = pedDat; //Guardar todos los datos en un vector      
        }
        
        //Traspaso de datos a la matriz
        for (int i = 0; i<cueofWa; i++){
            String[] convert = vecIni[i].split(" ");
            for (int j = 0; j < convert.length; j++) {
                contenedora[i][j] = convert[j];    
            }
        } 
        for(int i = 0; i<cueofWa; i++){
            CuerpoDeAgua.cmlevel(contenedora[i][0],contenedora[i][1],contenedora[i][3]);   
        }
        
        CuerpoDeAgua.GetmostarValor();
        
        
        
               
    }
    
}
