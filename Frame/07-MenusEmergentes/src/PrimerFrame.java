import java.awt.Color;
import javax.swing.JOptionPane; 
        
public class PrimerFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrimerFrame.class.getName());


    public PrimerFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEmergente = new javax.swing.JPopupMenu();
        menuItemRojo = new javax.swing.JMenuItem();
        menuItemVerde = new javax.swing.JMenuItem();
        menuItemAzul = new javax.swing.JMenuItem();

        menuItemRojo.setText("ROJO");
        menuItemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRojoActionPerformed(evt);
            }
        });
        menuEmergente.add(menuItemRojo);

        menuItemVerde.setText("VERDE");
        menuItemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerdeActionPerformed(evt);
            }
        });
        menuEmergente.add(menuItemVerde);

        menuItemAzul.setText("AZUL");
        menuItemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAzulActionPerformed(evt);
            }
        });
        menuEmergente.add(menuItemAzul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        menuEmergente.show(this,evt.getX(),evt.getY()); 
    }//GEN-LAST:event_formMouseClicked

    private void menuItemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRojoActionPerformed
        this.getContentPane().setBackground(Color.RED); 
    }//GEN-LAST:event_menuItemRojoActionPerformed

    private void menuItemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAzulActionPerformed
        this.getContentPane().setBackground(Color.BLUE); 
    }//GEN-LAST:event_menuItemAzulActionPerformed

    private void menuItemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerdeActionPerformed
        this.getContentPane().setBackground(Color.GREEN); 
    }//GEN-LAST:event_menuItemVerdeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PrimerFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuItem menuItemAzul;
    private javax.swing.JMenuItem menuItemRojo;
    private javax.swing.JMenuItem menuItemVerde;
    // End of variables declaration//GEN-END:variables
}
