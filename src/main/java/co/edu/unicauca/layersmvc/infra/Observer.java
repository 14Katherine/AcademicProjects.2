/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.layersmvc.infra;

import co.edu.unicauca.layersmvc.domain.Project;
import java.util.List;

/**
 *
 * @author Katherine
 */
public interface Observer {
     public void update(List<Project> projects);
    //public abstract void update(Subject aThis); 
}
