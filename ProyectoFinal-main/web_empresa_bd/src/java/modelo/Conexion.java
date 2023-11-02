/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author augus
 */
public class Conexion {
    public Connection conexionBD;
    private final String puerto = "3306";
    private final String bd = "db_web";
    private final String urlConexion = String.format("jdbc:mysql://127.0.0.1:3306/db_web?user=root", puerto,bd);
    private final String usuario = "root";
    private final String contra = "Empres@123";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    /*public final String bd = "proyecto_db";
    public final String urlConexion = String.format("jdbc:mysql://localhost:3306/%s",bd); 
    public final String usuario = "root";
    public final String contra = "Manager$1";
    public final String jdbc = "com.mysql.cj.jdbc.Driver"; 
    */
    public void abrir_conexion(){
        try{
            Class.forName(jdbc);
            conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
           
        }catch(Exception ex){
            System.out.print("Error..." + ex.getMessage());
        
        }
    
    
    }
    public void cerrar_conexion(){
        try{
            conexionBD.close();
        }catch(SQLException ex){
            System.out.print("Error..." + ex.getMessage());
        }
    }
    
   public ResultSet executeQuery(String sql) throws Exception {
        
        return conexionBD.createStatement().executeQuery(sql);
                
    }
}