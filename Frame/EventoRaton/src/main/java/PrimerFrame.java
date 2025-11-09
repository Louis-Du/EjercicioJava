
/**
 *
 * @author Luis Alberto Dueñas
 */
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class PrimerFrame extends javax.swing.JFrame {
    JLabel etiTexto, etiZona;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrimerFrame.class.getName());

    public PrimerFrame() {
        initComponents();
        CreacionVentana();
    }
    
    public void CreacionVentana(){
        this.setTitle("Programación de eventos de ratón");
        this.setSize(400, 400);
        this.setLocation(100, 100);
        
        etiTexto = new JLabel();
        etiTexto.setBounds(50,10,300,20);
        etiTexto.setText("---");
        this.getContentPane().add(etiTexto);
        
        etiZona = new JLabel();
        etiZona.setBounds(50,50,300,250);
        etiZona.setText("");
        etiZona.setOpaque(true);
        etiZona.setBackground(Color.RED);
        this.getContentPane().add(etiZona);
        
        etiZona.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent evt) {
                etiZonaMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                etiZonaMouseExited(evt);
            }
            public void mousePressed(MouseEvent evt){
                etiZonaMousePressed(evt);
            }
        });
    }
    
    public void etiZonaMouseEntered(MouseEvent evt){
        etiTexto.setText("El ratón acaba de entrar en la etiqueta");
    }
    public void etiZonaMouseExited(MouseEvent evt){
        etiTexto.setText("El ratón acaba de salir de la etiqueta");
    }
    public void etiZonaMousePressed(MouseEvent evt){
        if (evt.getButton()==MouseEvent.BUTTON1){
            etiTexto.setText("Se acaba de pulsar un botón izquierdo");
        }
        else if (evt.getButton()==MouseEvent.BUTTON2){
            etiTexto.setText("Se acaba de pulsar un botón central");
        }
        else if (evt.getButton()==MouseEvent.BUTTON3){
            etiTexto.setText("Se acaba de pulsar un botón derecho");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PrimerFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
