/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.access;

import co.edu.unicauca.layersmvc.domain.Project;
import java.util.List;

/**
 *
 * @author Katherine
 */
public interface IProjectRepository  {
     boolean save(Project newProject);

    boolean update(Project newProject);
    
    Project find(int No);

    List<Project> list();
}
