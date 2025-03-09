/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.access;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.edu.unicauca.layersmvc.infra.Utilities;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katherine
 */
public class ProjectFactory {
    private static ProjectFactory instance;

    private ProjectFactory() {
    }

 
    public static ProjectFactory getInstance() {

        if (instance == null) {
            instance = new ProjectFactory();
        }
        return instance;
    }

 
    public IProjectRepository getRepository() {  
      IProjectRepository result = null;

    try { 
        // Cargar la clase del repositorio desde las propiedades
        String repositoryClassName = Utilities.loadProperty("repositoryClass");
        
        if (repositoryClassName == null) {
            Logger.getLogger(ProjectFactory.class.getName()).severe("Repository class not found in configuration!");
        } else {
            result = (IProjectRepository) Class.forName(repositoryClassName).getConstructor().newInstance();
        }
        
    } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        Logger.getLogger(ProjectFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    // Si result sigue siendo null, usa el repositorio por defecto
    if(result == null) {
        result = new ProjectRepository();
    }
    
    return result;
}}
