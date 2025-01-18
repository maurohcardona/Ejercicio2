
public class Ejercicio_2 {
    public static void main(String[] args) {

       MarcoEjercicio2 miMarco = new MarcoEjercicio2();
       
       LaminaCuadrante[] laminas = new LaminaCuadrante("", new String[0]).createLaminaCuadrante();
       
       for(LaminaCuadrante elemento: laminas){
           miMarco.add(elemento);
        }
        miMarco.setVisible(true);

       
    }
}


