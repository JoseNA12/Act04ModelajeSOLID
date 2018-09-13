package Controlador;

import Modelo.Resultado;
import Modelo.TipoAlgoritmo;

import java.util.List;

public class AlgoritmosDTO {

    private String textoOriginal;
    private String parametroArg;
    private Resultado miResultado;
    private int idAlfabeto;
    private List<TipoAlgoritmo> algoritmos;
    private Boolean modoCodificacion;

    public AlgoritmosDTO(String textoOriginal, Resultado miResultado, int idAlfabeto, List<TipoAlgoritmo> algoritmos, Boolean modoCodificacion) {
        this.textoOriginal = textoOriginal;
        this.miResultado = miResultado;
        this.idAlfabeto = idAlfabeto;
        this.algoritmos = algoritmos;
        this.modoCodificacion = modoCodificacion;
    }
}
