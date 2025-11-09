import javax.swing.DefaultComboBoxModel;

public class PrimerFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrimerFrame.class.getName());

    public PrimerFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboNumeros = new javax.swing.JComboBox<>();
        btnPares = new javax.swing.JButton();
        btnImpares = new javax.swing.JButton();
        etiResultado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNumerosActionPerformed(evt);
            }
        });

        btnPares.setText("PARES");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        btnImpares.setText("IMPARES");
        btnImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImparesActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnPares)
                            .addGap(18, 18, 18)
                            .addComponent(btnImpares))
                        .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
        int i;
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        for (i=0; i<10; i += 2)
        {
            modelo.addElement("N° "+i);
        }
        cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnParesActionPerformed

    private void btnImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImparesActionPerformed
        int i;
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i=1; i<10;i+=2)       
        {
            modelo.addElement("N° "+i);
        }
        cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnImparesActionPerformed

    private void cboNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumerosActionPerformed
        etiResultado.setText(cboNumeros.getSelectedItem().toString());
    }//GEN-LAST:event_cboNumerosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int i;
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i=0; i<10; i++)
        {
            modelo.addElement("");
        }
        cboNumeros.setModel(modelo);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PrimerFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpares;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPares;
    private javax.swing.JComboBox<String> cboNumeros;
    private javax.swing.JTextField etiResultado;
    // End of variables declaration//GEN-END:variables
}
