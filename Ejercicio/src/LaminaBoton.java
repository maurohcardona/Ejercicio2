import java.util.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaBoton extends JPanel {
    
    JButton boton;
    List<JRadioButton>listaGlobalBotones = new ArrayList<>();
    MarcoEjercicio2 miMarco = new MarcoEjercicio2();

    public LaminaBoton(List<JRadioButton>listaGlobalBotones, MarcoEjercicio2 miMarco){
        this.listaGlobalBotones = listaGlobalBotones;
        this.miMarco = miMarco;
        boton = new JButton("Mostrar");
        boton.addActionListener(new MostrarAccion(listaGlobalBotones, miMarco));
        add(boton);

    }
}
