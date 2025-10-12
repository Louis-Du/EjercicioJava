
/**
 *
 * @author Luis Dueñas
 */

public class PrimerFrame extends javax.swing.JApplet {

@Override
    public void init() {
        try {
            javax.swing.SwingUtilities.invokeAndWait(() -> {
                initComponents(); // esto crea la interfaz
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        lblSegundos = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Horas - Minutos y Segundos");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de días:");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        jLabel3.setText("Horas:");

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        jLabel4.setText("Minutos:");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        jLabel5.setText("Segundos:");

        lblHoras.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        lblHoras.setText(" jLabelHoras");

        lblMinutos.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        lblMinutos.setText(" jLabelMinutos");

        lblSegundos.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        lblSegundos.setText("jLabelSegundos");

        lblResultado.setFont(new java.awt.Font("Monospaced", 0, 19)); // NOI18N
        lblResultado.setText("jLabelResultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(lblHoras))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSegundos)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(32, 32, 32)
                                    .addComponent(lblMinutos))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultado)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblHoras))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblMinutos))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSegundos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dias = (int) jSpinner.getValue();
        int horas = dias * 24;
        int minutos = dias * 1440;
        int segundos = dias * 86400;
        String resultado = dias + " días tienen "+horas+" horas "+minutos+" minutos y "+segundos+" segundos.";
        
        lblHoras.setText(String.valueOf(horas));
        lblMinutos.setText(String.valueOf(minutos));
        lblSegundos.setText(String.valueOf(segundos));
        lblResultado.setText(resultado);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundos;
    // End of variables declaration//GEN-END:variables
}
