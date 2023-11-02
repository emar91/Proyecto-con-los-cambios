/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author José Arévalo
 */
public class usuarios {
    private int id;
    private String usuario,clave,tipoUsuario;
    
    public usuarios(){}
    public usuarios(int id, String usuario, String clave, String tipo_usuario) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.tipoUsuario = tipo_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo_usuario() {
        return tipoUsuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipoUsuario = tipo_usuario;
    }
    
    public void crear(){}
    public void editar(){}
}
