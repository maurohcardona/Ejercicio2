import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JRadioButton;
import java.util.List;

public class AccionManager implements ItemListener {

    private final List<JRadioButton> botones; // Lista de botones dentro de un panel

    public AccionManager(List<JRadioButton> botones) {
        
        this.botones = botones; // Los botones asociados a este manejador
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        JRadioButton button = (JRadioButton) e.getItem();
        
        if (button.getText().equals("Confirmar") && button.isSelected()) {
            
            for (JRadioButton boton : botones) {
                
                if (boton.getText().equals("String[]")) {
                    System.out.println("desactivar String[]");
                    boton.setEnabled(false); // Deshabilita "String[]"
                }
            }
        } else if (button.getText().equals("Confirmar") && !button.isSelected()) {
            for (JRadioButton boton : botones) {
                if (boton.getText().equals("String[]")) {
                    boton.setEnabled(true); // Vuelve a habilitar "String[]"
                }
            }
        }
    }
}