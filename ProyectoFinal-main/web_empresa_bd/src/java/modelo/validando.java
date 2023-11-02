/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import modelo.Conexion;
import modelo.usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author José Arévalo
 */

public class validando {
    int resp=0;
    String sql="";
    ResultSet rs =null;
    Conexion cn= new Conexion(){};
    
    public int validarlogin(usuarios u) throws Exception{
    sql = "SELECT count(idusuarios) AS cantidad FROM usuarios WHERE usuario = '"+ u.getUsuario()+"' AND clave = '"+u.getClave()+"'";
    cn.abrir_conexion();
    rs = cn.executeQuery(sql);
    while (rs.next()){
    resp = rs.getInt("cantidad");
    }
    cn.cerrar_conexion();
    return resp;
    }
}
