/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

//7mport BD.conexion;
//import Model.TrabajadorModel;
import java.sql.ResultSet;
import modelo.Conexion;
import modelo.TrabajadorModel;
import modelo.usuarios;
/**
 *
 * @author Manue
 
*/
public class LoginDAO {
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
