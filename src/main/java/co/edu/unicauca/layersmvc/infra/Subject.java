/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.infra;
import co.edu.unicauca.layersmvc.domain.Project;
import co.edu.unicauca.layersmvc.infra.Observer;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Katherine
 */
public class Subject {
     ArrayList<Observer> observers;

    public Subject() {
 observers = new ArrayList<>();
    }

    /**
     * Agrega un observador
     *
     * @param obs
     */
    public void addObserver(Observer obs) {
      /*  if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(obs);*/
      observers.add(obs);
    }

    /**
     * Notifica a todos los observadores que hubo un cambio en el modelo
     */
    public void notifyAllObserves(List<Project> projects) {
        for (Observer each : observers) {
            each.update(projects);
        }
    }
}
