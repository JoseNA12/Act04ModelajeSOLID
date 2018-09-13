package Controlador;

import Modelo.Alfabeto;

import java.io.File;
import java.util.ArrayList;

public class Controlador implements IValidable {

    public Alfabeto alfabetoActual;
    private AlfabetosDAO misAlfabetos;

    @Override
    public Boolean Validar(String pEntrada) {
        return null;
    }

    public void ProcesarTexto(AlgoritmosDTO miDTO)
    {

    }

    public void ProcesarTexto(AlgoritmosDTO miDTO, String pParametroArg) {}

    public void EstablecerAlfabeto(String pSimbolos) {}

    public void EscribirArch(AlgoritmosDTO miDTO) {}

    public ArrayList<Alfabeto> CargarAlfabetos()
    {
        return misAlfabetos.getAlfabetos();
    }



}
