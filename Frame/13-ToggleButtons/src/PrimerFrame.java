
public class PrimerFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrimerFrame.class.getName());

    public PrimerFrame() {
        initComponents();
        tbtnInstalacion.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrecioBase = new javax.swing.JTextPane();
        btnCalcular = new javax.swing.JButton();
        etiTotal = new javax.swing.JTextField();
        tbtnInstalacion = new javax.swing.JToggleButton();
        tbtnFormacion = new javax.swing.JToggleButton();
        tbtnAlimentacionBD = new javax.swing.JToggleButton();
        etiPrecioInstalacion = new javax.swing.JLabel();
        etiPrecioFormacion = new javax.swing.JLabel();
        etiPrecioAlimentacionBD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Precio base");

        jScrollPane2.setViewportView(txtPrecioBase);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        etiTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        tbtnInstalacion.setText("INSTALACIÓN");
        tbtnInstalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnInstalacionActionPerformed(evt);
            }
        });

        tbtnFormacion.setText("FORMACIÓN");

        tbtnAlimentacionBD.setText("ALIMENTACIÓN BD");

        etiPrecioInstalacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiPrecioInstalacion.setText("40");

        etiPrecioFormacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiPrecioFormacion.setText("200");

        etiPrecioAlimentacionBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiPrecioAlimentacionBD.setText("200");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbtnInstalacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(tbtnFormacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tbtnAlimentacionBD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiPrecioAlimentacionBD)
                            .addComponent(etiPrecioInstalacion)
                            .addComponent(etiPrecioFormacion))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbtnInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbtnFormacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiPrecioFormacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbtnAlimentacionBD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiPrecioAlimentacionBD)))
                    .addComponent(etiPrecioInstalacion))
                .addGap(36, 36, 36)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnInstalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnInstalacionActionPerformed

    }//GEN-LAST:event_tbtnInstalacionActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio_base, precio_instal, precio_for, precio_ali;
        
        precio_base = Double.parseDouble(txtPrecioBase.getText()); 
        precio_instal = Double.parseDouble(etiPrecioInstalacion.getText()); // Toma el numero del label
        precio_for = Double.parseDouble(etiPrecioFormacion.getText());
        precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
        
        double precio_total = precio_base;
        
        if(tbtnInstalacion.isSelected())
        {
            precio_total = precio_total+precio_instal;
        }
        if(tbtnFormacion.isSelected())
        {
            precio_total = precio_total+precio_for;
        }
        if(tbtnAlimentacionBD.isSelected())
        {
            precio_total = precio_total+precio_ali;
        }
        etiTotal.setText(precio_total+"€ ");
    }//GEN-LAST:event_btnCalcularActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PrimerFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiPrecioAlimentacionBD;
    private javax.swing.JLabel etiPrecioFormacion;
    private javax.swing.JLabel etiPrecioInstalacion;
    private javax.swing.JTextField etiTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton tbtnAlimentacionBD;
    private javax.swing.JToggleButton tbtnFormacion;
    private javax.swing.JToggleButton tbtnInstalacion;
    private javax.swing.JTextPane txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
