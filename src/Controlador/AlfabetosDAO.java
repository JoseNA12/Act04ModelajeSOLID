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
        miLista.add(new Alfabeto(0, ".ñ{}vfsbhjSDVhjab"));

        return miLista;
    }

    public Boolean CrearAlfabeto(AlgoritmosDTO miDTO)
    {

        int identificador = miDTO.getAlfabeto().getIdentificador();
        String simbolos = miDTO.getAlfabeto().getSimbolos();

        // Aqui se mandará a crear el txt con el alfabeto

        return true;
    }

    public Alfabeto LeerAlfabeto()
    {
        return null;
    }

    public Boolean ActualizarAlfabeto()
    {
        return true;
    }

    public Boolean EliminarAlfabeto()
    {
        return false;
    }
}
