import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class LaminaCuadrante extends JPanel{

    public LaminaCuadrante(String title, String[] opciones){
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new TitledBorder(title));

        ButtonGroup grupo = new ButtonGroup();

        for(int i=0; i<opciones.length; i++){

            JRadioButton boton = new JRadioButton(opciones[i]);
            grupo.add(boton);
            boton.setActionCommand(opciones[i]);
            boton.setSelected(i==0);
            add(boton);
        }
    }
}