package Vista;

public enum Consola_Display {
    MENU_PRINCIPAL(
            "Menú principal:\n" +
            "1 - Herramienta de cifrado\n" +
            "2 - Agregar un alfabeto\n" +
            "4 - Salir"
    ),
    SELECCION_ALGORITMO_HEADER(
            "Seleccione los algoritmos de cifrado deseados:"
    ),
    SELECCION_ALGORITMO_OPCIONES(
            "0 - Confirmar\n" +
            "1 - Volver"
    ),
    SELECCION_MODO(
            "Seleccione el modo:\n" +
            "0 - Volver\n" +
            "1 - Codificar\n" +
            "2 - Descodificar:"
    ),
    SELECCION_ALFABETO(
            "Seleccione el alfabeto:"
    ),
    SELECCION_OPCION(
            "Seleccione una opción:"
    ),
    ENTRADA_TEXTO(
            "Ingrese el texto a ser procesado:"
    ),
    ENTRADA_PATH_ALFABETO(
            "Agregar un alfabeto\n" +
            "Ingrese el path del  archivo (.txt) que contiene los simbolos del alfabeto:"
    ),
    ENTRADA_NOMBRE_ALFABETO(
            "Ingrese el nombre (identificador) del alfabeto:"
    );


    String valor;
    Consola_Display(String p_valor){
        this.valor = p_valor;
    }

    public String getValor() {
        return valor;
    }
}
