/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.presentacion;

import co.edu.unicauca.layersmvc.domain.service.ServiceCompany;

/**
 *
 * @author Katherine
 */
public class Main {
      public static void main(String[] args) {
        new Main().execute();
    }

    public void execute() {
        ServiceCompany model = new ServiceCompany();
        // Inyección de dependencias
        GUIAddProjectViewController instance = new GUIAddProjectViewController(model);
        instance.setVisible(true);
        model.addObserver(new GUIListProjectViewController(model));
        //model.addObserver(new GUIListProductOtherViewController(model));
    }

}
