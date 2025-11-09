
/**
 *
 * @author Luis Dueñas
 */
public class VentanaCalculo extends javax.swing.JFrame {

    public VentanaCalculo() {
        initComponents();
    }
    void Sumar(){
        String cad1, cad2;
        int a, b, s;
        
        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        s = a + b;
        etiResultado.setText("" + s);
    }
    void Restar(){
        String cad1, cad2;
        int a, b, r;
        
        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        r = a - b;
        etiResultado.setText("" + r);
    }
    void Borrar(){
        txtNumero1.setText("");
        txtNumero2.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        etiResultado = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCalcular = new javax.swing.JMenu();
        menuSumar = new javax.swing.JMenuItem();
        menuRestar = new javax.swing.JMenuItem();
        menuBorrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número 1:");

        jLabel2.setText("Número 2:");

        txtNumero1.setText("0");
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });

        txtNumero2.setText("0");
        txtNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero2ActionPerformed(evt);
            }
        });

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        menuCalcular.setText("Calcular");

        menuSumar.setText("Sumar");
        menuSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSumarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuSumar);

        menuRestar.setText("Restar");
        menuRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuRestar);

        menuBorrar.setText("Borrar");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuBorrar);

        jMenuBar1.add(menuCalcular);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSumar)
                .addGap(18, 18, 18)
                .addComponent(btnRestar)
                .addGap(16, 16, 16)
                .addComponent(btnBorrar)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        Sumar();       
    }//GEN-LAST:event_btnSumarActionPerformed

    private void menuSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSumarActionPerformed
        Sumar();
    }//GEN-LAST:event_menuSumarActionPerformed

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        Sumar();
    }//GEN-LAST:event_txtNumero1ActionPerformed

    private void txtNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero2ActionPerformed
        Sumar();
    }//GEN-LAST:event_txtNumero2ActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        Restar();        
    }//GEN-LAST:event_btnRestarActionPerformed

    private void menuRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestarActionPerformed
        Restar();
    }//GEN-LAST:event_menuRestarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Borrar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        Borrar();
    }//GEN-LAST:event_menuBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenu menuCalcular;
    private javax.swing.JMenuItem menuRestar;
    private javax.swing.JMenuItem menuSumar;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
