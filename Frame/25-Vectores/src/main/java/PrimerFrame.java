
/**
 *
 * @author Luis Alberrto Dueñas
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class PrimerFrame extends javax.swing.JFrame {
    
    JCheckBox vCuadros[];
    JButton btnAceptar;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrimerFrame.class.getName());

    public PrimerFrame() {
        initComponents();
        CreacionVentana();
    }
    public void CreacionVentana(){
        this.setTitle("Ejemplo de vector de componentes");
        this.setSize(300, 600);
        
        String vTextos[] = {"Rojo", "Verde", "Azul", "Rosa", "Celeste", "Morado", "Amarillo", "Marrón", "Naranja", "Blanco"};
        
        vCuadros = new JCheckBox[10];
        
        int i;
        for (i=0; i<vCuadros.length; i++)
        {
            vCuadros[i]=new JCheckBox();
            vCuadros[i].setText(vTextos[i]);
            vCuadros[i].setBounds(10, 10+30*i, 100, 20);
            this.getContentPane().add(vCuadros[i]);
        }
        
        btnAceptar = new JButton();
        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(10,360,100,20);
        this.getContentPane().add(btnAceptar);
        
        btnAceptar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               btnAceptarActionPerformed(evt);
           } 
        });
    }
    
    public void btnAceptarActionPerformed(ActionEvent evt){
        int i;
        int cont=0;
        
        for(i=0; i<vCuadros.length;i++){
            if(vCuadros[i].isSelected()){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+ cont +" cuadros seleccionados");
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
