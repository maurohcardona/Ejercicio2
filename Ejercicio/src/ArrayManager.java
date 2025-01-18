public class ArrayManager {
    
    private String[][] arrayDeStrings;

    public ArrayManager() {
        this.arrayDeStrings = new String[][]{
            {"Tipo", "Mensaje,Confirmar,Opcion,Entrada"},
            {"Tipo de Mensaje", "ERROR_MESSAGE,NFORMATION_MESSAGE,WARNING_MESSAGE,QUESTION_MESSAGE,PLAIN_MESSAGE"},
            {"Mensaje", "Cadena,Icono,Componente,Otros,Object[]"},
            {"Confirmar", "DEFAULT_OPTION,YES_NO_OPTION,YES_NO_CANCEL_OPTION,OK_CANCEL_OPTION"},
            {"Ocion", "String[],Icon[],Object[]"},
            {"Entrada", "Campo de Texto,Combo"}
        };
    }

    public String[][] getArray() {
        return arrayDeStrings;
    }

}

