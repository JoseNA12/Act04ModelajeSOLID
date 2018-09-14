package Modelo;

import javax.sound.sampled.Line;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Resultado {

    private List<LineaResultado> lineasResultados;
    private Date fecha;
    private Time hora;
    private String fraseOriginal;

    public Resultado(String fraseOriginal) {
        this.fraseOriginal = fraseOriginal;
        lineasResultados = new ArrayList<>();
        //this.fecha = METODO PARA OBTENER FECHA
        //this.hora = METODO PARA OBTENER HORA
    }

    public void agregarLineaResultado(LineaResultado linea){
        lineasResultados.add(linea);
    }
}
