/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import PaqueteBaseDeDatos.Conexion;
import Modelo.CuerpoDeAgua;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/** 
*
 * @author Duvan
 */

public class Controlador {
    Conexion BaseDeDatos = new Conexion ();
    
    ArrayList<CuerpoDeAgua> CuerposDeAgua = new ArrayList<>();
    
    public void agregar(String nombre, int id, String municipio, float irca, String TipoCuerpoAgua, String TipoAgua){  
        
        String conca = ("'"+nombre+"',")+(id)+(",'"+municipio+"',")+("'"+TipoCuerpoAgua+"',")+("'"+TipoAgua+"',")+(irca);
        String Query_Agregar = "INSERT INTO CuerpoDeAgua(nombre,id,municipio,TipoCuerpoAgua,TipoAgua,Irca) VALUES ("+conca+");";
        
        BaseDeDatos.Agregar(Query_Agregar);
        
    }
    
    public String Ingresarconsulta () throws SQLException{
        String Query_Consultar = "SELECT * FROM CuerpoDeAgua";
        ResultSet Resultado = BaseDeDatos.Ejecutarconsulta(Query_Consultar);
        String Consulta="";
       
       while(Resultado.next()){
           Consulta += Resultado.getString("id") + " "
                   + Resultado.getString("nombre") + " "
                   + Resultado.getString("municipio") + " "
                   + Resultado.getString("TipoCuerpoAgua")+ " "
                   + Resultado.getString("TipoAgua") + " "
                   + Resultado.getString("Irca") + " "
                   + "\n";
       }
       
       return Consulta;
    }
    
    //Llenar array en base a los elementos encontrados en la consulta
    public void LlenarArray() throws SQLException{
       //CuerposDeAgua.clear();
       String Query_Consultar = "SELECT * FROM CuerpoDeAgua;";
       ResultSet Resultado = BaseDeDatos.Ejecutarconsulta(Query_Consultar); 
       while(Resultado.next()){
        CuerpoDeAgua cuerpoagua = new CuerpoDeAgua(Resultado.getString("nombre"),Integer.parseInt(Resultado.getString("id")),Resultado.getString("municipio"),Float.parseFloat(Resultado.getString("Irca")),Resultado.getString("TipoAgua"),Resultado.getString("TipoCuerpoAgua"));
        CuerposDeAgua.add(cuerpoagua); //
       }
    }
    
    //Metodo que encuentra los niveles IRCA en los que se encuentran las entidades en base a el metodo LlenarArray
    public String NivelesTodos(){
        String riesgo="";
        
        for (int i = 0; i < CuerposDeAgua.size(); i++) {
            riesgo += CuerposDeAgua.get(i).nivel() + "\n";
        }
        
      return riesgo;
    
    }

    public String MenorMedio(){
        String menores;
        int contador = 0;
        for (int i = 0; i < CuerposDeAgua.size(); i++) {
            if(CuerposDeAgua.get(i).getIrca() >= 0 && CuerposDeAgua.get(i).getIrca() <= 35){
                contador++;
            }
        
        }
        menores = contador + "\n";
        return menores;
    }
    
    public String Medios(){
        String medios ="NA";
        for (int i = 0; i < CuerposDeAgua.size(); i++) {
            if("MEDIO".equals(CuerposDeAgua.get(i).nivel())){
                medios += CuerposDeAgua.get(i).getNombre() + "\n";
            }
        }
        
        if(medios.length() > 2){
            medios = medios.replace("NA","");
        }else{
            medios += "\n";
        }
        
        return medios;
    }
    
   public String Menor(){ 
        String datos_menor="";
        float menor = CuerposDeAgua.get(0).getIrca();
        String nomb = CuerposDeAgua.get(0).getNombre();
        int cod = CuerposDeAgua.get(0).getCodigo();
        for (int i = 0; i < CuerposDeAgua.size(); i++) {
             if (CuerposDeAgua.get(i).getIrca() < menor){
                 menor = CuerposDeAgua.get(i).getIrca();
                 nomb = CuerposDeAgua.get(i).getNombre();
                 cod = CuerposDeAgua.get(i).getCodigo();
             }
        }
       datos_menor = nomb + " " + cod;  
       return datos_menor;
   }

   
   
   
}
