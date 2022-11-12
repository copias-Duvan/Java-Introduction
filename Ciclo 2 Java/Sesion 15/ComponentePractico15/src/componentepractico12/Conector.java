/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class Conector {
    
    public static Connection crearConexion(String URL) {
        Connection conexion = null;
        try {
            // DriverManager.getConnection ==> Crea un objeto de tipo Connection
            // Que representa la conexión a la base de datos deseada
            // La base de datos deseada viene de la URL
            conexion = DriverManager.getConnection(URL);
            System.out.println("Conexion a la base de datos exitosa.");
        } catch(SQLException ex) {
            System.out.println("Conexion a la base de datos fallida.");
            System.out.println(ex.getMessage());
        }
        return conexion;
    }
    
    public static ResultSet ejecutarConsulta(String URL, String query) {
        ResultSet resultados = null;
        try {
            // 1. Abrir la conexión a la base de datos
            Connection conexion = crearConexion(URL);
            
            // 2. Crear la sentencia
            Statement sentencia = conexion.createStatement();
            
            // 3. Guardar el resultado del query
            resultados = sentencia.executeQuery(query);
            System.out.println("Resultados obtenidos: ");
            System.out.println(resultados);
            
            // 4. Cerrar las conexiones
            // sentencia.close();
            // conexion.close();
            
        } catch (SQLException ex) {
            
        }
        return resultados;
    }
    
    public static int ejecutarActualizacion(String URL, String query) {
        int filasAfectadas = -1;
        try {
            Connection conexion = crearConexion(URL);
            Statement sentencia = conexion.createStatement();
            filasAfectadas = sentencia.executeUpdate(query);
            //sentencia.close();
            //conexion.close();
        } catch (SQLException ex) {
            
        }
        return filasAfectadas;
    }
}
