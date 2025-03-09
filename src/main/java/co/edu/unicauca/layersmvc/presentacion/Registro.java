/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.layersmvc.presentacion;

import co.edu.unicauca.layersmvc.access.CompanyRepository;
import co.edu.unicauca.layersmvc.domain.Company;
import co.edu.unicauca.layersmvc.domain.service.ServiceCompany;

import javax.swing.JOptionPane;

/**
 *
 * @author Katherine
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Resgistrarse
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jnit = new javax.swing.JLabel();
        jnombre = new javax.swing.JLabel();
        jcontacto = new javax.swing.JLabel();
        japellidoscontacto = new javax.swing.JLabel();
        jusuarioEm = new javax.swing.JLabel();
        jcontraseñaEm = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        txtnombreEm = new javax.swing.JTextField();
        txtcontactoEm = new javax.swing.JTextField();
        txtapellidoscontactoEm = new javax.swing.JTextField();
        txtusuarioEm = new javax.swing.JTextField();
        BotonResEmp = new javax.swing.JButton();
        jcorreoEmp = new javax.swing.JLabel();
        txtcorreoEm = new javax.swing.JTextField();
        PasswordEm = new javax.swing.JPasswordField();
        jsectorEm = new javax.swing.JLabel();
        jnombrecontacto = new javax.swing.JLabel();
        txtnombrecontactoEm = new javax.swing.JTextField();
        jcargocontacto = new javax.swing.JLabel();
        txtcargocontactoEm = new javax.swing.JTextField();
        txtsectorEm = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtidentificacionCor = new javax.swing.JTextField();
        txtnombreCor = new javax.swing.JTextField();
        txtapellidosCor = new javax.swing.JTextField();
        txtusuarioCor = new javax.swing.JTextField();
        BotonResCor = new javax.swing.JButton();
        jcorreoCor = new javax.swing.JLabel();
        txtcorreoCor = new javax.swing.JTextField();
        PasswordCor = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jNombre = new javax.swing.JLabel();
        jIdentificacion = new javax.swing.JLabel();
        jsemestre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbSemestreEs = new javax.swing.JComboBox<>();
        jusuarioEs = new javax.swing.JLabel();
        jcontraseñaEs = new javax.swing.JLabel();
        txtidentificacionEs = new javax.swing.JTextField();
        txtnombreEs = new javax.swing.JTextField();
        txtapellidosEs = new javax.swing.JTextField();
        txtusuarioEs = new javax.swing.JTextField();
        BotonResEs = new javax.swing.JButton();
        jcorreoEs = new javax.swing.JLabel();
        txtcorreoEs = new javax.swing.JTextField();
        PasswordEs = new javax.swing.JPasswordField();
        botonregresarRes = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 0));

        jnit.setText("Nit:");

        jnombre.setText("Nombre:");

        jcontacto.setText("Telefono de contacto:");

        japellidoscontacto.setText("Apellidos del contacto:");

        jusuarioEm.setText("Usuario:");

        jcontraseñaEm.setText("Contraseña:");

        txtapellidoscontactoEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoscontactoEmActionPerformed(evt);
            }
        });

        BotonResEmp.setText("Registrar");
        BotonResEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResEmpActionPerformed(evt);
            }
        });

        jcorreoEmp.setText("Correo:");

        jsectorEm.setText("Sector:");

        jnombrecontacto.setText("Nombre de contacto:");

        jcargocontacto.setText("Cargo del contacto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(BotonResEmp)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(japellidoscontacto)
                                        .addComponent(jusuarioEm, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jnombre)
                                        .addGap(76, 76, 76)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtusuarioEm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtnit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                            .addComponent(txtnombreEm, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcorreoEm, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsectorEm, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtcontactoEm)
                                    .addComponent(txtnombrecontactoEm)
                                    .addComponent(txtapellidoscontactoEm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcargocontactoEm)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jnombrecontacto)
                                            .addComponent(jcargocontacto))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jcontraseñaEm)
                                        .addGap(94, 94, 94)
                                        .addComponent(PasswordEm))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcorreoEmp)
                                    .addComponent(jnit))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsectorEm)
                            .addComponent(jcontacto))
                        .addGap(241, 241, 241)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnombre)
                    .addComponent(txtnombreEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcorreoEmp)
                    .addComponent(txtcorreoEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsectorEm)
                    .addComponent(txtsectorEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcontacto)
                    .addComponent(txtcontactoEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnombrecontacto)
                    .addComponent(txtnombrecontactoEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(japellidoscontacto)
                    .addComponent(txtapellidoscontactoEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcargocontacto)
                    .addComponent(txtcargocontactoEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusuarioEm)
                    .addComponent(txtusuarioEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcontraseñaEm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonResEmp)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Empresa", jPanel2);

        jLabel2.setText("Identificación:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Contraseña:");

        jLabel6.setText("Apellidos:");

        txtusuarioCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioCorActionPerformed(evt);
            }
        });

        BotonResCor.setText("Registrar");
        BotonResCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResCorActionPerformed(evt);
            }
        });

        jcorreoCor.setText("Correo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtusuarioCor)
                                    .addComponent(PasswordCor, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(34, 34, 34))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(62, 62, 62)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtidentificacionCor, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addComponent(txtnombreCor)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jcorreoCor))
                                    .addGap(57, 57, 57)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtapellidosCor)
                                        .addComponent(txtcorreoCor))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(BotonResCor)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidentificacionCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombreCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtapellidosCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcorreoCor)
                    .addComponent(txtcorreoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtusuarioCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(PasswordCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonResCor)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Coordinador", jPanel3);

        jNombre.setText("Nombre:");

        jIdentificacion.setText("Identificación:");

        jsemestre.setText("Semestre:");

        jLabel1.setText("Apellidos:");

        cmbSemestreEs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jusuarioEs.setText("Usuario:");

        jcontraseñaEs.setText("Contraseña:");

        BotonResEs.setText("Registrar");
        BotonResEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResEsActionPerformed(evt);
            }
        });

        jcorreoEs.setText("Correo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIdentificacion)
                    .addComponent(jNombre)
                    .addComponent(jLabel1)
                    .addComponent(jsemestre)
                    .addComponent(jusuarioEs)
                    .addComponent(jcontraseñaEs)
                    .addComponent(jcorreoEs))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BotonResEs))
                    .addComponent(txtidentificacionEs)
                    .addComponent(txtnombreEs)
                    .addComponent(txtapellidosEs)
                    .addComponent(txtusuarioEs)
                    .addComponent(cmbSemestreEs, 0, 167, Short.MAX_VALUE)
                    .addComponent(txtcorreoEs)
                    .addComponent(PasswordEs))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIdentificacion)
                    .addComponent(txtidentificacionEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombre)
                    .addComponent(txtnombreEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtapellidosEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsemestre)
                    .addComponent(cmbSemestreEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcorreoEs)
                    .addComponent(txtcorreoEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jusuarioEs)
                    .addComponent(txtusuarioEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcontraseñaEs)
                    .addComponent(PasswordEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonResEs)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Estudiante", jPanel1);

        botonregresarRes.setText("Regresar");
        botonregresarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregresarResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonregresarRes)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonregresarRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidoscontactoEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoscontactoEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoscontactoEmActionPerformed

    private void txtusuarioCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioCorActionPerformed

    private void BotonResEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResEsActionPerformed
        String identificacion = txtidentificacionEs.getText();
        String nombre = txtnombreEs.getText();
        String apellidos = txtapellidosEs.getText();
        String semestre = cmbSemestreEs.getSelectedItem().toString();
        String correo = txtcorreoEs.getText();
        String usuario = txtusuarioEs.getText();
        String contraseña = new String(PasswordEs.getPassword());  // Obtener contraseña

        // Validar que los campos no estén vacíos
        if (identificacion.isEmpty() || nombre.isEmpty() || apellidos.isEmpty()
                || correo.isEmpty() || usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Aquí podrías guardar estos datos en una base de datos o usarlos según sea necesario
        JOptionPane.showMessageDialog(this, "Estudiante registrado con éxito");

        // Limpiar los campos después de registrar
        txtidentificacionEs.setText("");
        txtnombreEs.setText("");
        txtapellidosEs.setText("");
        cmbSemestreEs.setSelectedIndex(0);
        txtcorreoEs.setText("");
        txtusuarioEs.setText("");
        PasswordEs.setText("");
    }//GEN-LAST:event_BotonResEsActionPerformed

    private void BotonResCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResCorActionPerformed
        String identificacion = txtidentificacionCor.getText();
        String nombre = txtnombreCor.getText();
        String apellidos = txtapellidosCor.getText();
        String correo = txtcorreoCor.getText();
        String usuario = txtusuarioCor.getText();
        String contraseña = new String(PasswordCor.getPassword());  // Obtener contraseña

        // Validar que los campos no estén vacíos
        if (identificacion.isEmpty() || nombre.isEmpty() || apellidos.isEmpty()
                || correo.isEmpty() || usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Aquí podrías guardar estos datos en una base de datos o usarlos según sea necesario
        JOptionPane.showMessageDialog(this, "Coordinador registrado con éxito");

        // Limpiar los campos después de registrar
        txtidentificacionCor.setText("");
        txtnombreCor.setText("");
        txtapellidosCor.setText("");
        txtcorreoCor.setText("");
        txtusuarioCor.setText("");
        PasswordCor.setText("");
    }//GEN-LAST:event_BotonResCorActionPerformed

    private void BotonResEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResEmpActionPerformed
        String nit = txtnit.getText();
        String nombre = txtnombreEm.getText();
        String correo = txtcorreoEm.getText();
        String sector = txtsectorEm.getText();
        String contacto = txtcontactoEm.getText();
        String nombrecontacto = txtnombrecontactoEm.getText();
        String apellidoscontacto = txtapellidoscontactoEm.getText();
        String cargocontacto = txtcargocontactoEm.getText();

        String usuario = txtusuarioEm.getText();
        String contraseña = new String(PasswordEm.getPassword()); // Convertir password a String

        // Validar que los campos no estén vacíos
        if (nit.isEmpty() || nombre.isEmpty() || correo.isEmpty() || sector.isEmpty() || contacto.isEmpty() || nombrecontacto.isEmpty()
                || apellidoscontacto.isEmpty() || cargocontacto.isEmpty() || usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear el objeto Empresa con los datos
        Company empresa = new Company(nit, nombre, correo, sector, contacto, nombrecontacto, apellidoscontacto, cargocontacto, usuario, contraseña);

        // Crear una instancia del servicio y registrar la empresa
        ServiceCompany empresaService = new ServiceCompany();
      /*  if (empresaService.registrarEmpresa(empresa)) {
            JOptionPane.showMessageDialog(this, "Empresa registrada exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            txtnit.setText("");
            txtnombreEm.setText("");
            txtcorreoEm.setText("");
            txtsectorEm.setText("");
            txtcontactoEm.setText("");
            txtnombrecontactoEm.setText("");
            txtapellidoscontactoEm.setText("");
            txtcargocontactoEm.setText("");

            txtusuarioEm.setText("");
            PasswordEm.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar empresa.", "Error", JOptionPane.ERROR_MESSAGE);
        }
*/
    }//GEN-LAST:event_BotonResEmpActionPerformed

    private void botonregresarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresarResActionPerformed

        login login = new login();

        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_botonregresarResActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonResCor;
    private javax.swing.JButton BotonResEmp;
    private javax.swing.JButton BotonResEs;
    private javax.swing.JPasswordField PasswordCor;
    private javax.swing.JPasswordField PasswordEm;
    private javax.swing.JPasswordField PasswordEs;
    private javax.swing.JButton botonregresarRes;
    private javax.swing.JComboBox<String> cmbSemestreEs;
    private javax.swing.JLabel jIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel japellidoscontacto;
    private javax.swing.JLabel jcargocontacto;
    private javax.swing.JLabel jcontacto;
    private javax.swing.JLabel jcontraseñaEm;
    private javax.swing.JLabel jcontraseñaEs;
    private javax.swing.JLabel jcorreoCor;
    private javax.swing.JLabel jcorreoEmp;
    private javax.swing.JLabel jcorreoEs;
    private javax.swing.JLabel jnit;
    private javax.swing.JLabel jnombre;
    private javax.swing.JLabel jnombrecontacto;
    private javax.swing.JLabel jsectorEm;
    private javax.swing.JLabel jsemestre;
    private javax.swing.JLabel jusuarioEm;
    private javax.swing.JLabel jusuarioEs;
    private javax.swing.JTextField txtapellidosCor;
    private javax.swing.JTextField txtapellidosEs;
    private javax.swing.JTextField txtapellidoscontactoEm;
    private javax.swing.JTextField txtcargocontactoEm;
    private javax.swing.JTextField txtcontactoEm;
    private javax.swing.JTextField txtcorreoCor;
    private javax.swing.JTextField txtcorreoEm;
    private javax.swing.JTextField txtcorreoEs;
    private javax.swing.JTextField txtidentificacionCor;
    private javax.swing.JTextField txtidentificacionEs;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombreCor;
    private javax.swing.JTextField txtnombreEm;
    private javax.swing.JTextField txtnombreEs;
    private javax.swing.JTextField txtnombrecontactoEm;
    private javax.swing.JTextField txtsectorEm;
    private javax.swing.JTextField txtusuarioCor;
    private javax.swing.JTextField txtusuarioEm;
    private javax.swing.JTextField txtusuarioEs;
    // End of variables declaration//GEN-END:variables
}
