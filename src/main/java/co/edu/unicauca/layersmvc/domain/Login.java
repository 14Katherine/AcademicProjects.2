/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.layersmvc.domain;

/**
 *
 * @author Katherine
 */
public class Login {
    //ATRIBUTOS
    String usuario;
    String contrasena;
    //CONSTRUCTOR
    public Login(){
    this.contrasena = contrasena;
    this.usuario = usuario;
    }
    //METODOS GETTERS AND SETTERS
    public String getUsuario(){
    return usuario;
    }
    public void setUsuario(String usuario){
    this.usuario = usuario;
    }
    public String getContrasena(){
    return contrasena;
    }
    public void setContrasena(String contrasena){
    this.contrasena = contrasena;
    }
}
