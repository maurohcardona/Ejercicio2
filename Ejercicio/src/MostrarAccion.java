import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class MostrarAccion implements ActionListener {

    private final List<JRadioButton> listaGlobalBotones;
    MarcoEjercicio2 miMarco = new MarcoEjercicio2();

    private String cadena_mensaje = "Mensaje de ejemplo";
    private Icon icono_mensaje = new ImageIcon("Ejercicio\\src\\icono.png");
    private Object objetoMensaje = new Date();
    private LaminaEjemplo componenteMensaje = new LaminaEjemplo();
    

    public MostrarAccion(List<JRadioButton> listaGlobalBotones, MarcoEjercicio2 miMarco){

        this.listaGlobalBotones = listaGlobalBotones;
        this.miMarco = miMarco;
    }

    public Object dameMensaje(){

        for(JRadioButton boton: listaGlobalBotones){

            if(boton.getActionCommand().equals("Cadena")){
                if (boton.isSelected()){
                    return cadena_mensaje;
                }
            }
            else if(boton.getActionCommand().equals("Icono")){
                if(boton.isSelected()){
                    return icono_mensaje;
                }
            }
            else if(boton.getActionCommand().equals("Componente")){
                if(boton.isSelected()){
                    return componenteMensaje;
                }
            }
            else if(boton.getActionCommand().equals("Otros")){
                if(boton.isSelected()){
                    return objetoMensaje;
                }
            }
            else if(boton.getActionCommand().equals("OBject[]")){
                if(boton.isSelected()){
                    return new Object[]{cadena_mensaje, icono_mensaje, componenteMensaje, objetoMensaje};
                }
            }    
        }   
        return null;
    }

    public int dameTipoMensaje(){

        for(JRadioButton boton: listaGlobalBotones){

            if(boton.getActionCommand().equals("ERROR_MESSAGE")){
                if (boton.isSelected()){
                    return JOptionPane.ERROR_MESSAGE;
                }
            }
            else if(boton.getActionCommand().equals("NFORMATION_MESSAGE")){
                if(boton.isSelected()){
                    return JOptionPane.INFORMATION_MESSAGE;
                }
            }
            else if(boton.getActionCommand().equals("WARNING_MESSAGE")){
                if(boton.isSelected()){
                    return JOptionPane.WARNING_MESSAGE;
                }
            }
            else if(boton.getActionCommand().equals("QUESTION_MESSAGE")){
                if(boton.isSelected()){
                    return JOptionPane.QUESTION_MESSAGE;
                }
            }   
        }   
        return 0;
    }

    public int dameConfirmar(){

        for(JRadioButton boton: listaGlobalBotones){

            if(boton.getActionCommand().equals("DEFAULT_OPTION")){
                if (boton.isSelected()){
                    return JOptionPane.DEFAULT_OPTION;
                }
            }
            else if(boton.getActionCommand().equals("YES_NO_OPTION")){
                if(boton.isSelected()){
                    return JOptionPane.YES_NO_OPTION;
                }
            }
            else if(boton.getActionCommand().equals("YES_NO_CANCEL_OPTION")){
                if(boton.isSelected()){
                    return JOptionPane.YES_NO_CANCEL_OPTION ;
                }
            }
            else if(boton.getActionCommand().equals("OK_CANCEL_OPTION")){
                if(boton.isSelected()){
                    return JOptionPane.OK_CANCEL_OPTION;
                }
            } 
        }   
        return JOptionPane.DEFAULT_OPTION;
    }

    public Object[] dameOpcion(){

        String[] string_opcion = {"azul", "amarillo", "rojo"};
        Icon[] icon_opcion = {
            new ImageIcon("Ejercicio\\src\\amarillo.jpg"),
            new ImageIcon("Ejercicio\\src\\azul.jpg"),
            new ImageIcon("Ejercicio\\src\\rojo.jpg")
        };
        Object[] object_opcion = {cadena_mensaje, icono_mensaje,objetoMensaje};

        for(JRadioButton boton: listaGlobalBotones){

            if(boton.getActionCommand().equals("String[]")){
                if (boton.isSelected()){
                    return string_opcion;
                }
            }
            else if(boton.getActionCommand().equals("Icon[]")){
                if(boton.isSelected()){
                    return icon_opcion;
                }
            }
            else if(boton.getActionCommand().equals("Object[]")){
                if(boton.isSelected()){
                    return object_opcion;
                }
            }
        }   
        return null;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(JRadioButton boton: listaGlobalBotones){

            if(boton.getActionCommand().equals("Mensaje")){
                if (boton.isSelected()){
                    JOptionPane.showMessageDialog(miMarco, dameMensaje(), boton.getActionCommand(), dameTipoMensaje());
                }
            }
            else if(boton.getActionCommand().equals("Confirmar")){
                if (boton.isSelected()){
                    JOptionPane.showConfirmDialog(miMarco, dameMensaje(), boton.getActionCommand(), dameConfirmar(), dameTipoMensaje());
                }
            }
            else if(boton.getActionCommand().equals("Opcion")){
                if(boton.isSelected()){
                    JOptionPane.showOptionDialog(miMarco, dameMensaje(), boton.getActionCommand(), dameTipoMensaje(), dameConfirmar(), new ImageIcon("Ejercicio\\src\\icono.png"), dameOpcion(), dameMensaje());
                }
            }
            else if (boton.getActionCommand().equals("Entrada")){
                for(JRadioButton botones: listaGlobalBotones){
                    if(botones.getActionCommand().equals("Campo de Texto")){
                        if(botones.isSelected()){
                            JOptionPane.showInputDialog(miMarco, dameMensaje(), boton.getActionCommand(), dameTipoMensaje());
                        }
                    }
                    else if(botones.getActionCommand().equals("Combo")){
                        if(botones.isSelected()){
                                JOptionPane.showInputDialog(miMarco, dameMensaje(), boton.getActionCommand(), dameTipoMensaje(), new ImageIcon("Ejercicio\\src\\icono.png"), new String[] {"Rojo","Azul","Amarillo"}, "Rojo");
                        }
                    
                        
                    }
                }    
            }
        }
        
    }
    
}
