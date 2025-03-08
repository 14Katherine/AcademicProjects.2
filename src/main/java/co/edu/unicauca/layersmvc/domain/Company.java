/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.domain;

/**
 *
 * @author Katherine
 */
public class Company {

    private String nit;
    private String nombre;
    private String correo;
    private String sector;
    private String contacto;
    private String nombrecontacto;
    private String apellidoscontacto;
    private String cargocontacto;

    private String usuario;
    private String contraseña;

    // Constructor, Getters y Setters
    public Company(String nit, String nombre, String correo, String sector, String contacto, String nombrecontacto, String apellidoscontacto, String cargocontacto, String usuario, String contraseña) {
        this.nit = nit;
        this.nombre = nombre;
        this.correo = correo;
        this.sector = sector;
        this.contacto = contacto;
        this.nombrecontacto = nombrecontacto;
        this.apellidoscontacto = apellidoscontacto;
        this.cargocontacto = cargocontacto;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Getters y Setters
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

   

    public String getCorreo() {
        return correo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getApellidoscontacto() {
        return apellidoscontacto;
    }

    public void setApellidoscontacto(String apellidoscontacto) {
        this.apellidoscontacto = apellidoscontacto;
    }

    public String getCargocontacto() {
        return cargocontacto;
    }

    public void setCargocontacto(String cargocontacto) {
        this.cargocontacto = cargocontacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
