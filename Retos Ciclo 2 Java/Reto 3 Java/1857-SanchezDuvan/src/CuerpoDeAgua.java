
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duvan
 */
public class CuerpoDeAgua extends ObjetoGeografico {
    ArrayList<String> nivelesDeRiesgoEntidades = new ArrayList<String>(); // Array que contiene todos los niveles de riesgo en los que se encuentran las entidades
    private int contadorNivelesMedio = 0; // Contador de entidades que se encuentran en el nivel de riesgo MEDIO
    ArrayList<String> entidadesEnNivelMedio = new ArrayList<String>(); //Array que lleva el nombre de las entidades que tienen nivel MEDIO
    ArrayList<Float> nivelesIrcaDeEntidades = new ArrayList<Float>(); //Array que contiene todos los niveles IRCA de las entidades 
    ArrayList<String> nombreTodasEntidades = new ArrayList<String>(); // Array que contiene el nombre de todas las entidades
    ArrayList<String> idDeEntidades = new ArrayList<String>(); //Array que contiene las ID de las entidades
    String entidadValorMin;
    int valorIndice;
    String idEntidadValorMin;
    
    
    public CuerpoDeAgua(){
        
    } 
    public CuerpoDeAgua(String nombreEntidad, String idEntidad, String municipioEntidad, String tipoCuerpoAgua, String tipoAgua, int numIrca, int contadorMedio, String entidadValorMin,int valorIndice, String idEntidadValorMin) {
        super(nombreEntidad, idEntidad, municipioEntidad, tipoCuerpoAgua, tipoAgua, numIrca);
        this.contadorNivelesMedio = contadorMedio;
        this.entidadValorMin = entidadValorMin;
        this.valorIndice = valorIndice;
        this.idEntidadValorMin = idEntidadValorMin;
    }
    

    //METODOS
    public void nameAllEntidades (){
        String name = getNombreEntidad();
        nombreTodasEntidades.add(name);
    }
    
    public void printCuerpoIrca(float nivelIrcaParametro){
        float parameterFloat = nivelIrcaParametro; //
        
        if ((80< parameterFloat && parameterFloat <= 100)){
            nivelesDeRiesgoEntidades.add("INVIABLE SANITARIAMENTE");  
        } 
        else if ((35< parameterFloat && parameterFloat<= 80)){
            nivelesDeRiesgoEntidades.add("ALTO");
        } 
        else if ((14<parameterFloat && parameterFloat<=35)){
            nivelesDeRiesgoEntidades.add("MEDIO");
            contadorNivelesMedio += 1;
        } 
        else if ((5<parameterFloat && parameterFloat<=14)){
            nivelesDeRiesgoEntidades.add("BAJO"); 
            contadorNivelesMedio += 1;
        }
        else if ((0<parameterFloat && parameterFloat<=5)){
            nivelesDeRiesgoEntidades.add("SIN RIESGO");
            contadorNivelesMedio += 1;  
        }
    }
    
    public void agregarIrcaArray(){
        float numIrca = getNumIrca();
        nivelesIrcaDeEntidades.add(numIrca);
    }
    
    public void agregarIdArray(){
        String idEntidades = getIdEntidad();
        idDeEntidades.add(idEntidades); 
    }
    
    public void comprobarNivelMedioEntidades(){
        float numeroIrca = getNumIrca();
        if (numeroIrca >14 && numeroIrca <35){
            String nameEntidadMedio = getNombreEntidad();
            entidadesEnNivelMedio.add(nameEntidadMedio);
        }
        
    }
    
    public void imprimirValorMinimoIrca (){
        float minimo = Collections.min(nivelesIrcaDeEntidades); //
        int indiceValorMin = nivelesIrcaDeEntidades.indexOf(minimo); 
        
        
        idEntidadValorMin  = idDeEntidades.get(indiceValorMin);
        entidadValorMin = nombreTodasEntidades.get(indiceValorMin);
        
        
    }
    
    //METODOS SET Y GET
    
    public int getContadorNivelesMedio() {
        System.out.println(contadorNivelesMedio);
        return contadorNivelesMedio;
    }
    public void setContadorNivelesMedio(int contadorNivelesMedio) {
        this.contadorNivelesMedio = contadorNivelesMedio;
    }
    
    public String getEntidadValorMin() {
        return entidadValorMin;
    }
    public void setEntidadValorMin(String entidadValorMin) {
        this.entidadValorMin = entidadValorMin;
    }

    public int getValorIndice() {
        return valorIndice;
    }
    public void setValorIndice(int valorIndice) {
        this.valorIndice = valorIndice;
    }

    public String getIdEntidadValorMin() {
        return idEntidadValorMin;
    }
    public void setIdEntidadValorMin(String idEntidadValorMin) {
        this.idEntidadValorMin = idEntidadValorMin;
    }

    
}
