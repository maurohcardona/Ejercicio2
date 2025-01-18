import javax.swing.JFrame;

import java.awt.GridLayout;

class MarcoEjercicio2 extends JFrame{

    public MarcoEjercicio2(){

        setTitle("Ejercicio 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridLayout(2,3));

        String[] a_tipo = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
        String[] a_tipoMensaje = {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"};
        String[] a_mensajes = {"Cadena", "Icono", "Componente", "Otros", "Object[]"};
        String[] a_confirmar = {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"};
        String[] a_opcion = {"String[]", "Icon[]", "Object[]"};
        String[] a_entrada = {"Campo de Texto", "Combo"};
         
        LaminaCuadrante l_tipo = new LaminaCuadrante("Tipo", a_tipo);
        LaminaCuadrante l_tipoMensaje =  new LaminaCuadrante("Tipo de Mensaje", a_tipoMensaje);
        LaminaCuadrante 
        

        add(l_tipo);
        add(l_tipoMensaje);
    }
}
