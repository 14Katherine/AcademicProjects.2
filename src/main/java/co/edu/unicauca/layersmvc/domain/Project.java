/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.domain;

/**
 *
 * @author Katherine
 */
public class Project {
     int No ;
    String NombreEmpresa;
    String NombreProyecto;
    String Objetivos;
     String Descripcion;
     String TiempoMax;
     Double Presupuesto;



  

    public Project(int No, String NombreEmpresa, String NombreProyecto, String Objetivos, String Descripcion, String TiempoMax, Double Presupuesto) {
        this.No = No;
        this.NombreEmpresa = NombreEmpresa;
        this.NombreProyecto = NombreProyecto;
        this.Objetivos = Objetivos;
        this.Descripcion = Descripcion;
        this.TiempoMax = TiempoMax;
        this.Presupuesto = Presupuesto;
    }

    public Project() {
        
    }

   
    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getNombreProyecto() {
        return NombreProyecto;
    }

    public void setNombreProyecto(String NombreProyecto) {
        this.NombreProyecto = NombreProyecto;
    }

       public String getObjetivos() {
        return Objetivos;
    }

    public void setObjetivos(String Objetivos) {
        this.Objetivos = Objetivos;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTiempoMax() {
        return TiempoMax;
    }

    public void setTiempoMax(String TiempoMax) {
        this.TiempoMax = TiempoMax;
    }

    public Double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(Double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

   
}
