
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Dashboard extends javax.swing.JFrame {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList<Profesor> listaProfesores = new ArrayList<>();
    ArrayList<Curso> listaCursos = new ArrayList<>();

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setNombresComponentes();
        llenarListaEstudiante();

    }

    private void setNombresComponentes() {
        lstProfesores.setName("listaProfesor");
        lstCursos.setName("listaEstudiante");
        lstEstudiantes.setName("listaCurso");

        btnAgregarProfesor.setName("agregarProfesor");
        btnAgregarCurso.setName("agregarEstudiante");
        btnAgregarEstudiante.setName("agregarCurso");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarProfesor = new javax.swing.JButton();
        btnAgregarCurso = new javax.swing.JButton();
        btnAgregarEstudiante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProfesores = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarProfesor.setText("Agregar profesor");

        btnAgregarCurso.setText("Agregar curso");

        btnAgregarEstudiante.setText("Agregar estudiante");

        lstProfesores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstProfesores);

        lstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstCursos);

        lstEstudiantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstEstudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnAgregarProfesor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAgregarCurso)
                        .addGap(102, 102, 102)
                        .addComponent(btnAgregarEstudiante)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarProfesor)
                    .addComponent(btnAgregarCurso)
                    .addComponent(btnAgregarEstudiante))
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarListaEstudiante() {
        Estudiante estudiante = new Estudiante();
        listaEstudiantes = estudiante.leer();
        DefaultListModel modeloLista = new DefaultListModel();
        for (Estudiante estudianteRecorrido : listaEstudiantes) {
            modeloLista.addElement("Estuadiante ID:" + estudianteRecorrido.getId());
        }
        lstProfesores.setModel(modeloLista);
    }

    public void llenarListaProfesor() {
        Profesor profesor = new Profesor();
        listaProfesores = profesor.leer();
        DefaultListModel modeloLista = new DefaultListModel();
        for (Profesor profesorRecorrido : listaProfesores) {
            modeloLista.addElement("Profesor ID:" + profesorRecorrido.getId());
        }
        lstProfesores.setModel(modeloLista);
    }

    public void llenarListaCurso() {
        Curso curso = new Curso();
        listaCursos = curso.leer();
        DefaultListModel modeloLista = new DefaultListModel();
        for (Curso cursoRecorrido : listaCursos) {
            modeloLista.addElement("Curso ID:" + cursoRecorrido.getId());
        }
        lstCursos.setModel(modeloLista);
    }

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCurso;
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnAgregarProfesor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstCursos;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JList<String> lstProfesores;
    // End of variables declaration//GEN-END:variables
}
