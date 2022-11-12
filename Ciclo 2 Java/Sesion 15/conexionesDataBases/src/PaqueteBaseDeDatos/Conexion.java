package PaqueteBaseDeDatos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion {
    
      Connection connection = null;
    
      public String obtenerurl () {  
            String sjdbc = "jdbc:sqlite"; //Establecer el tipo de base datos a enlazar
            Path ruta = Paths.get("src/PaqueteBaseDeDatos/CuerpoDeAgua.db"); //Ruta de la base de datos
            String  url =  sjdbc + ":\\" + ruta.toAbsolutePath();  // Devuelve la ruta absoluta del archivo dado
            /*Connection y DriverManager trabajan de la mano, mediante DriverManger obtenemos un objeto de Connection
             que tiene como finalidad establecer la conexion entre una base de datos y una interfaz grafica y posteriormente hacer alguna
             operacion usando CRUD*/
            return url;
      }
      
      public void Conectar () {  
            try{
               connection = DriverManager.getConnection(obtenerurl()); //Objeto que nos permite establecer la conexion con la base datos
               if (connection != null){
                  System.out.println("Conexion exitosa!");
                  ResultSet resultado = connection.prepareStatement("select * from CuerpoDeAgua").executeQuery () ; //Con esta linea consultamos en nuestra base de datos
                  System.out.println(resultado.getString("id"));//De esta manera recorremos recorremos columnas de la database
               };
            }
            catch ( Exception ex ) {
               System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
               System.out.println("Error en la conexion");
            }
        }
      
      public void Agregar (String Query) {
            try{
               connection = DriverManager.getConnection(obtenerurl()); //Objeto que nos permite establecer la conexion con la base datos
               if ( connection != null ){
                  System.out.println(Query);
                  connection.prepareStatement(Query).executeUpdate(); //Con esta linea consultamos en nuestra base de datos                  
                  System.out.println("Conexion exitosa!");
              }; 
            }
            catch ( Exception ex ) {
               /*System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
               System.out.println("Error en la conexion");*/
               JOptionPane.showMessageDialog(null, ex.getClass().getName() + ": " + ex.getMessage() );
            }
      }      

      public ResultSet Ejecutarconsulta(String Query) {  
        try{
          connection = DriverManager.getConnection(obtenerurl());
          if ( connection != null ){
             ResultSet resultado = connection.prepareStatement(Query).executeQuery();
             //Para INSERT, UPDATE or DELETE usar el metodo executeUpdate() y para SELECT usar el metodo executeQuery() que retorna un ResultSet.
             System.out.println("Conexión exitosa!");
             return resultado;
          }
        }
        catch ( Exception ex ) {
          System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
          System.out.println("Error en la conexión");
        }
       
        return null;
    }

      
}

/*public static void main (String [ ] args) {   
          Conexion objetoConec = new Conexion();
          objetoConec.conectar();
}*/