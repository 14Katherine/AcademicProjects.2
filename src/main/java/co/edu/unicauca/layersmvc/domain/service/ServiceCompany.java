/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.domain.service;

import co.edu.unicauca.layersmvc.access.CompanyRepository;
import co.edu.unicauca.layersmvc.access.IProjectRepository;
import co.edu.unicauca.layersmvc.access.ProjectFactory;
import co.edu.unicauca.layersmvc.domain.Company; // Asegúrate de importar la clase Empresa
import co.edu.unicauca.layersmvc.domain.Project;
import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author Katherine
 */


public class ServiceCompany extends Subject{

      // Ahora hay una dependencia de una abstracción, no es algo concreto,
    // no sabe cómo está implementado.
    private IProjectRepository repository;

    /**
     * Inyección de dependencias en el constructor.Ya no conviene que el mismo
     * servicio cree un repositorio concreto
     *
     */
    public ServiceCompany() {
        repository = ProjectFactory.getInstance().getRepository();
    }

    

    public boolean saveProject(Project newProject) {

        //Validate product
        if (newProject == null || newProject.getNo() < 0 || newProject.getNombreProyecto().isEmpty()) {
            return false;
        }

        // Antes de guardar, falta validar que no exista el proyecto
        Project projectAux = repository.find(newProject.getNo());

        if (projectAux != null) {
            // El producto ya existe
            return false;
        }

        repository.save(newProject);
        // Notifica a todos los observadores que el modelo cambió
        this.notifyAllObserves();
        return true;
    }

    public List<Project> listProject() {
        List<Project> projects = new ArrayList<>();
        projects = repository.list();
        return projects;
    }

    public boolean updateProject(Project newProject) {
        //Validate product
        if (newProject == null || newProject.getNo() < 0 || newProject.getNombreProyecto().isEmpty()) {
            return false;
        }

        // Notifica a todos los observadores que el modelo cambió
        repository.update(newProject);
        this.notifyAllObserves();
        return true;
    }

}

