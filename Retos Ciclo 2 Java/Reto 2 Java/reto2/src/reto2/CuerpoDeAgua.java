/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Duvan
 */
public class CuerpoDeAgua {
    static ArrayList<String> testList = new ArrayList<String>(); //Array que lleva el nombre de entidades que tienen nivel Medio  
    static private String nameEnt; //Nombre de la entidad 1
    static float parameterFloat; // Clasificacion IRCA flotante 3
    static int conBdInferior=0; // Contador de cuantas entidades tienen nivel de cuerpo medio
    static ArrayList<Float> conInf = new ArrayList<Float>(); //Array que contiene todos los niveles de IRCA ingresados
    static ArrayList<String> identificador = new ArrayList<String>();//Array que lleva el numero de identificaciones 2
    static ArrayList<String> totalEn = new ArrayList<String>(); //Array con el total de todas las entidades ingresadas 
   

    public CuerpoDeAgua(){
        
    }
    
    static void cmlevel(String namEn,String identPar,String numIrca){
        
       
        nameEnt = namEn; //Nombre de la entidad
        totalEn.add(namEn);
        identificador.add(identPar); //Agregando el numero representativo de la entidad a Un Array
        //Conversion de String a Float y a la vez agregando el elemento a un Array
        parameterFloat = Float.parseFloat(numIrca); 
        conInf.add(parameterFloat);     
        
        
        if ((80< parameterFloat && parameterFloat <= 100)){
            System.out.println("INVIABLE SANITARIAMENTE");
            
        } 
        else if ((35< parameterFloat && parameterFloat<= 80)){
            System.out.println("ALTO");
        } 
        else if ((14<parameterFloat && parameterFloat<=35)){
            System.out.println("MEDIO");
            conBdInferior+=1; 
            testList.add(namEn);
        } 
        else if ((5<parameterFloat && parameterFloat<=14)){
            System.out.println("BAJO"); 
            conBdInferior+=1;
        }
        else if ((0<parameterFloat && parameterFloat<=5)){
            System.out.println("SIN RIESGO");
            conBdInferior+=1;  
        }
    }
    
    static public void GetmostarValor(){
        System.out.println(conBdInferior); 
        for(String valor: testList){
            System.out.print(valor + " "); 
        }
        System.out.println();
        //Minimo del array de clasificaciones IRCA de cada entidad junto a la entidad con el numero IRCA mas bajo
        float min = Collections.min(conInf); 
        int index = conInf.indexOf(min);
        System.out.println(totalEn.get(index) + " " +identificador.get(index));
     
        
        
    }   

    public static void setNameEnt(String nameEnt) {
        CuerpoDeAgua.nameEnt = nameEnt;
    }
    
}
        

/*


Un for que recorra la cantidad de entidades que se han ingresado (usamos un contador), lo primero seria invocar el metodo de la clase cuerpoDeAgua que
verifica los niveles de IRCA, en los parametros del metodo van a ir los datos que estan en el array de los niveles irca ingresados anteriormente por las entidades (hacemos uso de un for interno)
2. Cuando este for finalice vamos a mostrar el numero de entidades que se encuentran en un nivel de cuerpo medio 
3. Indicar el nombre de las entidades que se encuentran en un nivel de cuerpo medio (en caso de no haber ninguno devolver NA.)
4. Indicar el nombre del cuerpo de agua con la clasificación IRCA más baja encontrada y su número identificador. (Aqui debemos sacar el valor minimo IRCA del array del nivel IRCA de las entidades)





*/