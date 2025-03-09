/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.layersmvc.access;

import co.edu.unicauca.layersmvc.domain.Project;
import co.edu.unicauca.layersmvc.domain.service.ServiceCompany;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katherine
 */
public class ProjectRepository implements IProjectRepository {

    private Connection conn;

    public ProjectRepository() {
        initDatabase();
    }

    public boolean save(Project newProject) {
        if (newProject == null || newProject.getNo() < 0 || newProject.getNombreProyecto().isEmpty()) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = this.connect();
            conn.setAutoCommit(false);  // Start transaction

            String sql = "INSERT INTO Project ( No, NombreEmpresa, NombreProyecto, Objetivos, Descripcion, TiempoMax, Presupuesto ) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newProject.getNo());
            pstmt.setString(2, newProject.getNombreEmpresa());
            pstmt.setString(3, newProject.getNombreProyecto());
            pstmt.setString(4, newProject.getObjetivos());
            pstmt.setString(5, newProject.getDescripcion());
            pstmt.setString(6, newProject.getTiempoMax());
            pstmt.setDouble(7, newProject.getPresupuesto());

            pstmt.executeUpdate();

            conn.commit();  // Commit the transaction
            return true;
        } catch (SQLException ex) {
            if (conn != null) {
                try {
                    conn.rollback();  // Rollback in case of an error
                } catch (SQLException ex2) {
                    Logger.getLogger(ProjectRepository.class.getName()).log(Level.SEVERE, "Error rolling back transaction", ex2);
                }
            }
            Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, "Error saving project", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProjectRepository.class.getName()).log(Level.SEVERE, "Error closing resources", ex);
            }
        }
        return false;
    }

    /* public boolean save(Project newProject) {

        try {
            //Validate product
            if (newProject == null || newProject.getNo() < 0 || newProject.getNombreProyecto().isEmpty()) {
                return false;
            }
            //this.connect();

            String sql = "INSERT INTO Project ( No, NombreEmpresa, NombreProyecto,Objetivos, Descripcion, TiempoMax,Presupuesto ) "
                    + "VALUES ( ?, ?, ? ,?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newProject.getNo());
            pstmt.setString(2, newProject.getNombreEmpresa());
            pstmt.setString(3, newProject.getNombreProyecto());
            pstmt.setString(4, newProject.getObjetivos());
            pstmt.setString(5, newProject.getDescripcion());
            pstmt.setString(6, newProject.getTiempoMax());
            pstmt.setDouble(7, newProject.getPresupuesto());
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }*/
    @Override
    public List<Project> list() {
        List<Project> projects = new ArrayList<>();
        try {
            this.connect();  // Asegurar la conexión
            String sql = "SELECT No, NombreEmpresa, NombreProyecto,Objetivos, Descripcion, TiempoMax,Presupuesto  FROM Project";
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Project newProject = new Project();
                newProject.setNo(rs.getInt("No"));
                newProject.setNombreEmpresa(rs.getString("NombreEmpresa"));
                newProject.setNombreProyecto(rs.getString("NombreProyecto"));
                newProject.setObjetivos(rs.getString("Objetivos"));
                newProject.setDescripcion(rs.getString("Descripcion"));
                newProject.setTiempoMax(rs.getString("TiempoMax"));
                newProject.setPresupuesto(rs.getDouble("Presupuesto"));

                projects.add(newProject);
            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projects;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Project (\n"
                + "	No integer PRIMARY KEY,\n"
                + "	NombreEmpresa text NOT NULL,\n"
                + "	NombreProyecto text NOT NULL,\n"
                + "	Objetivos text NOT NULL,\n"
                + "	Descripcion text NOT NULL,\n"
                + "	TiempoMax text NOT NULL,\n"
                + "	Presupuesto  integer NOT NULL\n"
                + ");";
        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            Logger.getLogger(ProjectRepository.class.getName()).info("Project table created or already exists.");

        } catch (SQLException ex) {
            Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, "Error creating Project table", ex);
        }
    }

    public Connection connect() {
    // SQLite connection string
    String url = "jdbc:sqlite:./mydatabase.db";  // Use a persistent database

    try {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(url);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, null, ex);
    }
    return conn;  // Return the connection
}


    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public boolean update(Project newProject) {
        try {
            //Validate proyecto
            if (newProject == null || newProject.getNo() < 0 || newProject.getNombreProyecto().isEmpty()) {
                return false;
            }
            //this.connect();

            String sql = "UPDATE Project "
                    + "SET NombreEmpresa = ?, "
                    + "NombreProyecto = ?, "
                    + "Objetivos = ?, "
                    + "Descripcion = ?, "
                    + "TiempoMax = ?, "
                    + "Presupuesto = ? "
                    + "WHERE No = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newProject.getNombreEmpresa());
            pstmt.setString(2, newProject.getNombreProyecto());
            pstmt.setString(3, newProject.getObjetivos());
            pstmt.setString(4, newProject.getDescripcion());
            pstmt.setString(5, newProject.getTiempoMax());
            pstmt.setDouble(6, newProject.getPresupuesto());
            pstmt.setInt(7, newProject.getNo());
            pstmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override

    public Project find(int No) {
        Project project = null;
        try {
            String sql = "SELECT No, NombreEmpresa, NombreProyecto, Objetivos, Descripcion, TiempoMax, Presupuesto FROM Project WHERE No = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, No);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                project = new Project();
                project.setNo(rs.getInt("No"));
                project.setNombreEmpresa(rs.getString("NombreEmpresa"));
                project.setNombreProyecto(rs.getString("NombreProyecto"));
                project.setObjetivos(rs.getString("Objetivos"));
                project.setDescripcion(rs.getString("Descripcion"));
                project.setTiempoMax(rs.getString("TiempoMax"));
                project.setPresupuesto(rs.getDouble("Presupuesto"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServiceCompany.class.getName()).log(Level.SEVERE, "Error al buscar el proyecto en la base de datos", ex);
        }
        return project;
    }

}
