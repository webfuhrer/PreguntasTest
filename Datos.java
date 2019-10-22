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
public class Datos {
    public static ArrayList<Pregunta> obtenerPreguntas()
    {
        ArrayList<Pregunta> lista_preguntas=new ArrayList();
        String[] respuestas={"Colon", "Bonaparte", "Pinzón", "Pérez"};
        Pregunta p=new Pregunta("¿Cómo se apellidaba el emperador Napoleón?", respuestas, 2);
        lista_preguntas.add(p);
        String[] respuestas2={"Arsuaga", "Pérez", "Zapatero", "Rajoy"};
        Pregunta p2=new Pregunta("¿Cómo se apellida el descubridor de Atapuerca?", respuestas2,1);
        String[] respuestas3={"Real Madrid", "Atleti", "Espanyol", "Barcelona"};
        Pregunta p3=new Pregunta("El equipo del Gobierno, la vergüenza del país...", respuestas3,1);
         lista_preguntas.add(p2);
          lista_preguntas.add(p3);
          return lista_preguntas;
        
    }
            
}
