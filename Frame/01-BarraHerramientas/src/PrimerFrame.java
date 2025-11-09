import javax.swing.JOptionPane;

public class PrimerFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrimerFrame.class.getName());

    public PrimerFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraHerramientas = new javax.swing.JToolBar();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraHerramientas.setRollover(true);

        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno (1).gif"))); // NOI18N
        btnUno.setFocusable(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnUno);

        btnDos.setText("DOS");
        btnDos.setFocusable(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnDos);

        btnTres.setText("TRES");
        btnTres.setFocusable(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnTres);

        btnCuatro.setText("CUATRO");
        btnCuatro.setFocusable(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerramientas.add(btnCuatro);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        JOptionPane.showMessageDialog(null, "Activaste el botón uno");
    }//GEN-LAST:event_btnUnoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PrimerFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
