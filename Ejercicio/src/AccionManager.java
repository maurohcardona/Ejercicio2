import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JRadioButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccionManager implements ItemListener {

    private final List<JRadioButton> botones; // Lista de botones dentro de un panel

    public AccionManager(List<JRadioButton> botones) {
        
        this.botones = botones; // Los botones asociados a este manejador
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        JRadioButton button = (JRadioButton) e.getItem();
        
        List<String> a_botones1 = new ArrayList<>(Arrays.asList("String[]", "Icon[]", "Object[]", "Campo de Texto", "Combo"));
        List<String> a_botones2 = Arrays.asList("DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION", "Campo de Texto", "Combo");
        List<String> a_botones3 = Arrays.asList("String[]", "Icon[]", "Object[]", "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" );
        List<String> a_botones4 = Arrays.asList("String[]", "Icon[]", "Object[]", "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION", "Campo de Texto", "Combo" );

        if (button.getText().equals("Confirmar") && button.isSelected()) {

            for (JRadioButton boton : botones) {
                
                for(String opcion: a_botones1){

                    if (boton.getText().equals(opcion)) {
                        
                        boton.setEnabled(false); // Deshabilita "String[]"
                    }
                }
            }

        } else if (button.getText().equals("Confirmar") && !button.isSelected()) {

            for (JRadioButton boton : botones) {

                for(String opcion: a_botones1){

                    if (boton.getText().equals(opcion)) {

                        boton.setEnabled(true); // Vuelve a habilitar "String[]"
                    }
                }
            }
        }

        else if (button.getText().equals("Opcion") && button.isSelected()) {


            for (JRadioButton boton : botones) {
                
                for(String opcion: a_botones2){

                    if (boton.getText().equals(opcion)) {
                        
                        boton.setEnabled(false); // Deshabilita "String[]"
                    }
                }
            }

        } else if (button.getText().equals("Opcion") && !button.isSelected()) {

            for (JRadioButton boton : botones) {

                for(String opcion: a_botones2){

                    if (boton.getText().equals(opcion)) {

                        boton.setEnabled(true); // Vuelve a habilitar "String[]"
                    }
                }
            }
        }

        else if (button.getText().equals("Entrada") && button.isSelected()) {

            for (JRadioButton boton : botones) {
                
                for(String opcion: a_botones3){

                    if (boton.getText().equals(opcion)) {
                        
                        boton.setEnabled(false); // Deshabilita "String[]"
                    }
                }
            }

        } else if (button.getText().equals("Entrada") && !button.isSelected()) { 

            for (JRadioButton boton : botones) {

                for(String opcion: a_botones3){

                    if (boton.getText().equals(opcion)) {

                        boton.setEnabled(true); // Vuelve a habilitar "String[]"
                    }
                }
            }
        }

        else if (button.getText().equals("Mensaje") && button.isSelected()) {

            for (JRadioButton boton : botones) {
                
                for(String opcion: a_botones4){

                    if (boton.getText().equals(opcion)) {
                        
                        boton.setEnabled(false); // Deshabilita "String[]"
                    }
                }
            }

        } else if (button.getText().equals("Mensaje") && !button.isSelected()) { 

            for (JRadioButton boton : botones) {

                for(String opcion: a_botones4){

                    if (boton.getText().equals(opcion)) {

                        boton.setEnabled(true); // Vuelve a habilitar "String[]"
                    }
                }
            }
        }
    }
}