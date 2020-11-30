/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import Controlador.EstudianteDAO;
import Modelos.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Karen Benedetti M
 */
public class FrmEstudiantes extends javax.swing.JFrame {

    DefaultListModel modeloEstudiante = new DefaultListModel();

    /**
     * Creates new form FrmEstudiantes
     */
    public FrmEstudiantes() {
        initComponents();
        crearModelo();
    }

    private void crearModelo() {
        lstEstudiantes.setModel(modeloEstudiante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        chkEstado = new javax.swing.JCheckBox();
        cmbCiclo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Documento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 90, 20);
        getContentPane().add(txtDocumento);
        txtDocumento.setBounds(140, 60, 220, 26);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 100, 70, 50);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(150, 110, 210, 30);

        jLabel3.setText("Genero");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 60, 40);

        btgGenero.add(rbMasculino);
        rbMasculino.setText("Masculino");
        getContentPane().add(rbMasculino);
        rbMasculino.setBounds(170, 190, 110, 29);

        btgGenero.add(rbFemenino);
        rbFemenino.setText("Femenino");
        getContentPane().add(rbFemenino);
        rbFemenino.setBounds(310, 190, 101, 29);

        chkEstado.setText("Estado");
        getContentPane().add(chkEstado);
        chkEstado.setBounds(360, 30, 79, 29);

        cmbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una", "Python", "Java", "Web" }));
        getContentPane().add(cmbCiclo);
        cmbCiclo.setBounds(240, 240, 200, 40);

        jLabel4.setText("Ciclo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 230, 60, 40);

        lstEstudiantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado estudiantes"));
        jScrollPane1.setViewportView(lstEstudiantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 290, 360, 140);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(80, 440, 93, 29);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(200, 450, 93, 29);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(310, 440, 110, 29);

        setBounds(0, 0, 570, 552);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Estudiante estudiante = new Estudiante();
        estudiante.setDocumento(Integer.parseInt(txtDocumento.getText()));
        estudiante.setNombre(txtNombre.getText());
        estudiante.setGenero(rbFemenino.isSelected() ? "F" : "M");
        estudiante.setCiclo(cmbCiclo.getSelectedItem().toString());

        if (EstudianteDAO.guardar(estudiante)) {
            JOptionPane.showMessageDialog(this, "Guardado con exito!");
        } else {
            JOptionPane.showMessageDialog(this, "Error: No se pudo guardar");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        ArrayList<Estudiante> vectorEstudiante;
        vectorEstudiante = EstudianteDAO.listar();
        for (Estudiante estudianteRecorrido : vectorEstudiante) {
            modeloEstudiante.addElement(estudianteRecorrido.getNombre());
        }

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Estudiante estudiante = new Estudiante();
        Connection con = Conexion.conectar();
        String sql = "SELECT * FROM estudiantes WHERE documento = ? ";
        ResultSet rs;

        try {
            PreparedStatement prepararSentencia = con.prepareStatement(sql);
            prepararSentencia.setInt(1, Integer.parseInt(txtDocumento.getText()));
            rs = prepararSentencia.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));

                txtNombre.setText(estudiante.getNombre());
                if (estudiante.getGenero().equals("Femenino")) {
                    rbFemenino.setSelected(true);
                } else {
                    rbMasculino.setSelected(true);
                }
                cmbCiclo.setSelectedItem(estudiante.getCiclo());
                chkEstado.setSelected(estudiante.isEstado());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGenero;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JComboBox<String> cmbCiclo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
