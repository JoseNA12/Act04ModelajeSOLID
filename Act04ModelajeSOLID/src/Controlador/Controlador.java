package Controlador;

import Modelo.Alfabeto;

import java.util.ArrayList;

public class Controlador implements IValidable {

    public Alfabeto alfabetoActual;

    public void ProcesarTexto(AlgoritmosDTO miDTO) {}
    public  void ProcesarTexto(AlgoritmosDTO miDTO, String pParametroArg) {}
    public void EstablecerAlfabeto(String pSimbolos) {}
    public void EscribirArch(AlgoritmosDTO miDTO) {}
    public ArrayList CargarAlfabetos() {return null;}

    @Override
    public Boolean Validar(String pEntrada) {
        return null;
    }
}
