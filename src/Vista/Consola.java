package Vista;

import Controlador.Algoritmo;
import Modelo.ModoCodificacion;
import Modelo.TipoAlgoritmo;

import java.util.*;

public class Consola {

    private static Scanner in;
    private static final int OPCIONES_ALGORITMOS_INICIALES = 2; // 0 - Confirmar, 1 - Volver

    private static List<TipoAlgoritmo> algoritmos;

    private static List<TipoAlgoritmo> algoritmos_seleccionados;
    private static boolean modoCodificacion;

    //private static List

    public static void main(String args[]){
        inicializar();
        run();
    }

    private static void inicializar(){
        algoritmos = Arrays.asList(TipoAlgoritmo.values());
        algoritmos_seleccionados = new ArrayList<>();
        modoCodificacion = false;
        //algoritmos_seleccionados.add(TipoAlgoritmo.SUSTVIGENERE);
        //algoritmos_seleccionados.add(TipoAlgoritmo.TRASLETRALETRA);
        in = new Scanner(System.in);
    }

    private static void run(){
        desplegarMenuInicio();
    }

    private static void desplegarMenuInicio(){
        println(Consola_Display.MENU_PRINCIPAL.getValor());
        println(Consola_Display.SELECCION_OPCION.getValor());
        int seleccion = obtener_Seleccion();

        switch (seleccion){
            case 1: //Herramienta de cifrado
                desplegarPantallaAlgoritmos();
                desplegarPantallaModo();
                break;
            case 2: //Configuracion
                break;
            case 3: //Salir
                break;
            default:
                break;
        }
    }

    private static void desplegarPantallaAlgoritmos(){
        println(Consola_Display.SELECCION_ALGORITMO_HEADER.getValor());
        boolean confirmado = false;

        while (!confirmado){
            println(Consola_Display.SELECCION_ALGORITMO_OPCIONES.getValor());
            imprimirListaAlgoritmos();
            int seleccion = obtener_Seleccion();

            if(seleccion == 0){ //Confirmar
                confirmado = true;
            } else if(seleccion == 1){ //Volver
                //Codigo para volver
            } else if(
                    seleccion >= OPCIONES_ALGORITMOS_INICIALES &&
                    seleccion <= algoritmos.size() + OPCIONES_ALGORITMOS_INICIALES
            ){
                toggle_Seleccion_Algoritmo(algoritmos.get(seleccion - OPCIONES_ALGORITMOS_INICIALES));
            }
        }
    }

    private static void desplegarPantallaModo(){
        println(Consola_Display.SELECCION_MODO.getValor());
        int seleccion = obtener_Seleccion();

        switch (seleccion){
            case 0:
                //Codigo para volver
                break;
            case 1:
                //Codificar
                modoCodificacion = true;
                break;
            case 2:
                //Descodificar
                modoCodificacion = false;
                break;
            default:
                break;
        }
    }

    private static void imprimirListaAlgoritmos(){
        int numOpcion = OPCIONES_ALGORITMOS_INICIALES;
        for (TipoAlgoritmo algoritmo : algoritmos) {
            print(numOpcion + " - " + algoritmo.getNombre() + " ");

            if(algoritmos_seleccionados.contains(algoritmo)){
                println("[X]");
            } else{
                println("[ ]");
            }
            numOpcion++;
        }
    }

    private static int obtener_Seleccion(){
        return in.nextInt();
    }

    private static void toggle_Seleccion_Algoritmo(TipoAlgoritmo algoritmo){
        if(algoritmos_seleccionados.contains(algoritmo)){
            algoritmos_seleccionados.remove(algoritmo);
        }else{
            algoritmos_seleccionados.add(algoritmo);
        }
    }

    private static void print(String s){
        System.out.print(s);
    }

    private static void println(String s){
        System.out.println(s);
    }
}
