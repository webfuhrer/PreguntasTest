/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopreguntastest;

/**
 *
 * @author CDMFP
 */
public class Pregunta {
    private String texto_pregunta;
    private String[] respuestas;
    private int indiceCorrecta;

    public Pregunta(String texto_pregunta, String[] respuestas, int indiceCorrecta) {
        this.texto_pregunta = texto_pregunta;
        this.respuestas = respuestas;
        this.indiceCorrecta = indiceCorrecta;
    }

    public String getTexto_pregunta() {
        return texto_pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public int getIndiceCorrecta() {
        return indiceCorrecta;
    }

    @Override
    public String toString() {
        String texto=texto_pregunta+"\n";
        int i=1;
        for(String x: respuestas)
        {
            texto=texto+i+"-"+x+"\n";
            i++;
        }
        return texto;
    }
    
    
}
