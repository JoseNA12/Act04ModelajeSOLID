package Controlador;

import Modelo.Resultado;

public class Algoritmo {

    private Resultado miResultado = new Resultado();


    static Boolean Validar(String pEntrada) {return false;}

    static Resultado Codificar(String pEntrada) {return null;}
    static Resultado Decodificar(String pEntrada) {return null;}

    public Resultado getMiResultado()
    {
        return miResultado;
    }

    public void setMiResultado(Resultado miResultado)
    {
        this.miResultado = miResultado;
    }
}
