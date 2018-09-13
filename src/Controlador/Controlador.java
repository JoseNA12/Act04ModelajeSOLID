package Controlador;

import Modelo.Alfabeto;

import java.io.File;
import java.util.ArrayList;

public class Controlador implements IValidable {

    public Alfabeto alfabetoActual;

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

    public ArrayList<Alfabeto> CargarAlfabetos() {
        File directory = new File("/path");
        File[] listOfFiles = directory.listFiles();

        if (listOfFiles != null)
        {
            for (File file : listOfFiles)
            {
                // Aqui se obtienen los alfabetos, almacenandolos en una lista para ser retornada
            }
        }

        // Alfabeto de prueba
        ArrayList<Alfabeto> miLista = new ArrayList<Alfabeto>();
        miLista.add(new Alfabeto(1, "abcdefghijklmnñopqrstuvwxyz"));

        return miLista;
    }



}
