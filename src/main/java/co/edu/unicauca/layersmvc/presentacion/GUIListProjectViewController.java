package co.edu.unicauca.layersmvc.presentacion;

import co.edu.unicauca.layersmvc.domain.Project;
import co.edu.unicauca.layersmvc.infra.Observer;
import co.edu.unicauca.layersmvc.domain.service.ServiceCompany;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Es un observador
 *
 * @author ahurtado
 */
public class GUIListProjectViewController extends javax.swing.JFrame implements Observer {

    ServiceCompany service;
    JTable table;
    DefaultTableModel model;

    /**
     * Creates new form GUIListadoProductos
     *
     * @param service servicio
     */
    public GUIListProjectViewController(ServiceCompany service) {
        initComponents();
        this.service = service;
        this.model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NombreEmpresa");
        model.addColumn("NombreProyecto");
        model.addColumn("Objetivos");
        model.addColumn("Descripcion");
         model.addColumn("TiempoMax");
          model.addColumn("Presupuesto");
        
        
        
        table = new JTable(model);
        jPanel2.add(new JScrollPane(table));
        setSize(500, 200);
        setLocation(10,50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listado de Proyectos");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       // Modificar proyecto seleccionado
       int index = table.getSelectedRow();
    
    // Verifica si se seleccionó una fila
    if (index != -1) {
        List<Project> projects = (List<Project>) service.listProjects();
        
        // Verifica que la lista no sea vacía y el índice sea válido
        if (projects != null && index < projects.size()) {
            Project selectedProject = projects.get(index);
            //new GUIEditProjectViewController(service, selectedProject).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Proyecto no encontrado.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un proyecto.");
    }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

   
    public void update(List<Project> projects) {
    this.setVisible(true);
    model.setRowCount(0); // Limpiar la tabla antes de actualizarla

   if (projects != null && !projects.isEmpty()) {
            for (Project p : projects) {
                model.addRow(new Object[]{
                    "" + p.getNo(),
                    p.getNombreEmpresa(),
                    p.getNombreProyecto(),
                    p.getDescripcion(),
                    p.getObjetivos(),
                    p.getTiempoMax(),
                    p.getPresupuesto()
                });
            }
        } else {
            model.addRow(new Object[]{"No projects available", "", "", ""});
        }

        table.paintImmediately(table.getBounds());  // Forzar repintado de la tabla
    }

    }

