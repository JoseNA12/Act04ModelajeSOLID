package Controlador;

import Modelo.Alfabeto;
import Modelo.TipoAlgoritmo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Controlador implements IValidable {

    // public Alfabeto alfabetoActual; Eliminado del diagrama
    private AlfabetosDAO misAlfabetos = new AlfabetosDAO();
    private IEscritura miEscritura;

    @Override
    public Boolean Validar(String pEntrada) {
        return null;
    }

    public void ProcesarTexto(AlgoritmosDTO miDTO)
    {
        String textoOriginal = miDTO.getTextoOriginal();
        Alfabeto miAlfabeto = miDTO.getAlfabeto();
        List<TipoAlgoritmo> algoritmos = miDTO.getAlgoritmos();
        Boolean modoCodificacion = miDTO.getModoCodificacion();

        Algoritmo misAlgoritmos = new Algoritmo();

        for (int i = 0; i < algoritmos.size(); i++)
        {
            if (modoCodificacion)
            {
                switch (algoritmos.get(i))
                {
                    case TRASLETRALETRA:
                        TrasLetraLetra.Codificar(textoOriginal);

                        break;

                    case CODTELEFONICO:
                        CodTelefonico.Codificar(textoOriginal);
                        break;

                    case SUSTVIGENERE:
                        SustVigenere.Codificar(textoOriginal);
                        break;
                }
            }
            else
            {
                switch (algoritmos.get(i))
                {
                    case TRASLETRALETRA:
                        TrasLetraLetra.Decodificar(textoOriginal);
                        break;

                    case CODTELEFONICO:
                        CodTelefonico.Decodificar(textoOriginal);
                        break;

                    case SUSTVIGENERE:
                        SustVigenere.Decodificar(textoOriginal);
                        break;

                }
            }
        }

        TrasLetraLetra.Codificar(textoOriginal);
    }

    public void ProcesarTexto(AlgoritmosDTO miDTO, String pParametroArg) {}

    // public void EstablecerAlfabeto(String pSimbolos) {} Eliminado del diagrama

    public void EscribirArch(AlgoritmosDTO miDTO) {}

    public ArrayList<Alfabeto> CargarAlfabetos()
    {
        return misAlfabetos.getAlfabetos();
    }
}
