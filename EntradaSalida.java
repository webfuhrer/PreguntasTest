/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopreguntastest;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int hacerPregunta(Pregunta x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(x);
        int n=sc.nextInt();
        return n;
    }
}
