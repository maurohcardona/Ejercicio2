import java.util.List;
import java.util.ArrayList;

import javax.swing.BoxLayout;
    import javax.swing.ButtonGroup;
    import javax.swing.JPanel;
    import javax.swing.JRadioButton;
    import javax.swing.border.TitledBorder;

    public class LaminaCuadrante extends JPanel{

        String[][] data = new ArrayManager().getArray();

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

        public LaminaCuadrante[] createLaminaCuadrante() {
            
            List<LaminaCuadrante>lista = new ArrayList<>();
        
            for (String[] panel : data) {
                String title = panel[0];
                String[] opciones = panel[1].split(",");

                lista.add(new LaminaCuadrante(title, opciones));
            }   
            return lista.toArray(new LaminaCuadrante[0]);
        }
    }