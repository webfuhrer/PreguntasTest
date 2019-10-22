/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopreguntastest;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Pregunta> lista_preguntas=Datos.obtenerPreguntas();
        for(Pregunta p: lista_preguntas)
        {
            int opcion_seleccionada=EntradaSalida.hacerPregunta(p);
            if(opcion_seleccionada==p.getIndiceCorrecta())
            {
                System.out.println("ENHORABUENA");
            }
        }
    }
}
