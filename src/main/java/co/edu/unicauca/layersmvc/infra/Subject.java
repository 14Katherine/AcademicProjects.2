/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katherine
 */
public abstract class Subject {
    /* private final List<Observer> misObservadores;

    public Subject() {
        this.misObservadores = new ArrayList<Observer>();
    }
    
public void notificarTodos (){
    for (Observer each: misObservadores){
    each.update(this);
    }
}*/
    ArrayList<Observer> observers;

    public void Subject() {

    }

    /**
     * Agrega un observador
     *
     * @param obs
     */
    public void addObserver(Observer obs) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(obs);
    }

    /**
     * Notifica a todos los observadores que hubo un cambio en el modelo
     */
    public void notifyAllObserves() {
        for (Observer each : observers) {
            each.update(this);
        }
    }
   
}
