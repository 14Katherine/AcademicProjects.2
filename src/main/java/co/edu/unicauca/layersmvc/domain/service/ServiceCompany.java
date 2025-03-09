/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.domain.service;
import co.edu.unicauca.layersmvc.infra.Subject;

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
public class ServiceCompany extends Subject {

    // Ahora hay una dependencia de una abstracción, no es algo concreto,
    // no sabe cómo está implementado.
    private IProjectRepository repository;
    public Iterable<Project> listProject;

    /**
     * Inyección de dependencias en el constructor.Ya no conviene que el mismo
     * servicio cree un repositorio concreto
     *
     */
    public ServiceCompany() {
        this.repository = ProjectFactory.getInstance().getRepository();
    }

    /*Guarda un nuevo proyecto en el repositorio
     */
    public boolean saveProject(Project newProject) {

        if (newProject == null || newProject.getNo() < 0
                || newProject.getNombreProyecto() == null || newProject.getNombreProyecto().isEmpty()) {
            return false;
        }

        // Validar que el proyecto no exista
        if (repository.find(newProject.getNo()) != null) {
            return false; // Ya existe un proyecto con ese número
        }

        repository.save(newProject);
        this.notifyAllObserves(listProjects()); // Notificar cambios
        return true;
    }

    // Obtiene la lista de proyectos
    public List<Project> listProjects() {
        List<Project> projects = repository.list();
        return projects != null ? projects : new ArrayList<>();  // Prevenir el retorno de null
    }






   // Actualiza un proyecto en el repositorio
    public boolean updateProject(Project newProject) {
        if (newProject == null || newProject.getNo() < 0 || newProject.getNombreProyecto().isEmpty()) {
            return false;
        }

        // Validar que el proyecto exista antes de actualizarlo
        if (repository.find(newProject.getNo()) == null) {
            return false; // No se puede actualizar un proyecto que no existe
        }

        // Actualizar el proyecto y notificar a los observadores
        repository.update(newProject);
        this.notifyAllObserves(listProjects()); // Notificar cambios con la lista actualizada
        return true;
    }


}
