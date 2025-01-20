import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JRadioButton;

public class Ejercicio_2 {
    public static void main(String[] args) {

        List<JRadioButton> listaGlobalBotones = new ArrayList<>();

       MarcoEjercicio2 miMarco = new MarcoEjercicio2();

       LaminaSuperior laminaSuperior = new LaminaSuperior();

       LaminaCuadrante[] laminas = new LaminaCuadrante("", new String[0], listaGlobalBotones).createLaminaCuadrante();
       
       LaminaBoton laminaBoton = new LaminaBoton(listaGlobalBotones, miMarco);

       for(LaminaCuadrante elemento: laminas){
           laminaSuperior.add(elemento);
        }

        miMarco.add(laminaSuperior, BorderLayout.CENTER);
        miMarco.add(laminaBoton, BorderLayout.SOUTH);

        miMarco.setVisible(true);

       
    }
}


