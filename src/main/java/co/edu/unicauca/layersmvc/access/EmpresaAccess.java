/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.access;
import java.sql.*;
import co.edu.unicauca.layersmvc.domain.Empresa; // Importa la clase Empresa

/**
 *
 * @author Katherine
 */

public class EmpresaAccess {

    // Método para registrar la empresa
    public boolean registrarEmpresa(Empresa empresa) {
        String sql = "INSERT INTO Empresa (NIT, Nombre, Contacto, Direccion, Correo, Usuario, Contraseña) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Usamos los getters de la clase Empresa
            stmt.setString(1, empresa.getNit());
            stmt.setString(2, empresa.getNombre());
             stmt.setString(3, empresa.getCorreo());
             stmt.setString(4, empresa.getSector());
            stmt.setString(5, empresa.getContacto());
            stmt.setString(6, empresa.getNombrecontacto());
            stmt.setString(7, empresa.getApellidoscontacto());
             stmt.setString(8, empresa.getCargocontacto());
            stmt.setString(9, empresa.getUsuario());
            stmt.setString(10, empresa.getContraseña());

            // Ejecutamos la actualización y retornamos si fue exitosa
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
