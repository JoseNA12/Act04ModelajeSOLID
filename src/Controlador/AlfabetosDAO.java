package Controlador;

import Modelo.Alfabeto;

import java.io.File;
import java.util.ArrayList;

public class AlfabetosDAO implements IValidable {


    @Override
    public Boolean Validar(String pEntrada) {
        return null;
    }

    public ArrayList<Alfabeto> getAlfabetos()
    {
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

    public Boolean CrearAlfabeto(AlgoritmosDTO miDTO)
    {
        return true;
    }
}
