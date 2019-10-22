/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopreguntastest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class Datos {
    public static ArrayList<Pregunta> obtenerPreguntas()
    {
        ArrayList<Pregunta> lista_preguntas=new ArrayList();
        try {
            FileReader fr=new FileReader("C:\\preguntas\\preguntas.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                String[] datos=linea.split(",");
                String texto_pregunta=datos[0];
                String[] respuestas={datos[1], datos[2], datos[3], datos[4]};
                int indice=Integer.parseInt(datos[5]);
                Pregunta p=new Pregunta(texto_pregunta, respuestas, indice);
                lista_preguntas.add(p);
                linea=br.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista_preguntas;
        
    }
            
}
