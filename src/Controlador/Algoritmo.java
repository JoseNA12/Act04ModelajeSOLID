package Controlador;

import Modelo.LineaResultado;
import Modelo.Resultado;

public class Algoritmo {

    private LineaResultado miResultado;


    static Boolean Validar(String pEntrada) {return false;}

    static LineaResultado Codificar(String pEntrada) {return null;}
    static LineaResultado Decodificar(String pEntrada) {return null;}

    public LineaResultado getMiResultado()
    {
        return miResultado;
    }

    public void setMiResultado(LineaResultado miResultado)
    {
        this.miResultado = miResultado;
    }
}
