import java.util.ArrayList;
import java.util.List;

import javax.swing.JRadioButton;

public class Ejercicio_2 {
    public static void main(String[] args) {

        List<JRadioButton> listaGlobalBotones = new ArrayList<>();

       MarcoEjercicio2 miMarco = new MarcoEjercicio2();
       
       LaminaCuadrante[] laminas = new LaminaCuadrante("", new String[0], listaGlobalBotones).createLaminaCuadrante();
       
       for(LaminaCuadrante elemento: laminas){
           miMarco.add(elemento);
        }
        miMarco.setVisible(true);

       
    }
}


