package formularios;

import java.util.HashSet;
import javax.swing.JOptionPane;
import práctico4.Materia;

public class FormularioMaterias extends javax.swing.JInternalFrame {

    private HashSet<Materia> listaMaterias;

    public FormularioMaterias(HashSet<Materia> materias) {
        initComponents();
        this.listaMaterias = materias;
    }

    public FormularioMaterias() {
         initComponents(); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jbl3 = new javax.swing.JLabel();
        jbl4 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombreMateria = new javax.swing.JTextField();
        jtAño = new javax.swing.JTextField();
        jbGuardar2 = new javax.swing.JButton();
        jbN2 = new javax.swing.JButton();
        jbSalir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jbl1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jbl1.setText("Formulario De Materias");

        lbl2.setText("codigo de materias");

        jbl3.setText("Nombre de la materia");

        jbl4.setText("Año al que pertenece");

        jbGuardar2.setText("Guardar");
        jbGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardar2ActionPerformed(evt);
            }
        });

        jbN2.setText("Nuevo");
        jbN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbN2ActionPerformed(evt);
            }
        });

        jbSalir2.setText("Salir");
        jbSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl3)
                                    .addComponent(lbl2))
                                .addGap(50, 50, 50)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jtCodigo)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbGuardar2)
                                    .addComponent(jbl4))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtAño)))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(284, 284, 284)
                                        .addComponent(jbSalir2))))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jbN2)))
                .addGap(0, 128, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jbl1)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl3)
                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbl4)
                    .addComponent(jtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jbN2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar2)
                    .addComponent(jbSalir2))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardar2ActionPerformed
        int codigo = 
                Integer.parseInt(jtAño.getText());
        String nombre = jtNombreMateria.getText();
        int año =
                Integer.parseInt(jtAño.getText());
        Materia materia = new Materia (codigo, nombre, año);
        listaMaterias.add(materia);
    }//GEN-LAST:event_jbGuardar2ActionPerformed

    private void jbN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbN2ActionPerformed
        jtCodigo.setText(" ");
        jtNombreMateria.setText(" ");
        jtAño.setText(" ");
    }//GEN-LAST:event_jbN2ActionPerformed

    private void jbSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir2ActionPerformed
         // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jbSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton jbGuardar2;
    private javax.swing.JButton jbN2;
    private javax.swing.JButton jbSalir2;
    private javax.swing.JLabel jbl1;
    private javax.swing.JLabel jbl3;
    private javax.swing.JLabel jbl4;
    private javax.swing.JTextField jtAño;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombreMateria;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
