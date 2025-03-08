/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.domain.service;

import co.edu.unicauca.layersmvc.access.EmpresaAccess;
import co.edu.unicauca.layersmvc.domain.Empresa; // Asegúrate de importar la clase Empresa
/**
 *
 * @author Katherine
 */


public class EmpresaService {

     private EmpresaAccess empresaAccess = new EmpresaAccess(); // Crear instancia de EmpresaAccess

   public boolean registrarEmpresa(Empresa empresa) {
    System.out.println("Intentando registrar empresa con NIT: " + empresa.getNit());

    // Validar que los datos no sean vacíos
    if (empresa.getNit().isEmpty() || empresa.getNombre().isEmpty() || empresa.getCorreo().isEmpty() || empresa.getSector().isEmpty() ||
        empresa.getContacto().isEmpty() || empresa.getNombrecontacto().isEmpty() || 
        empresa.getApellidoscontacto().isEmpty() || empresa.getCargocontacto().isEmpty() || empresa.getUsuario().isEmpty() || 
        empresa.getContraseña().isEmpty()) {
        System.out.println("❌ Error: Algunos campos están vacíos.");
        return false;
    }

    boolean resultado = empresaAccess.registrarEmpresa(empresa);
    System.out.println("Resultado del registro en empresaAccess: " + resultado);
    
    return resultado;
}

}

