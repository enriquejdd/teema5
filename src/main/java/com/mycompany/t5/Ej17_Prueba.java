/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Ej17_Prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cual es el tamaño del array?");
        int numArray = teclado.nextInt();
        Ej17_LanzarMoneda2 moneda1 = new Ej17_LanzarMoneda2(numArray);
        
        System.out.println(Ej17_LanzarMoneda2.lanzar(5));
        System.out.println("");
        
        moneda1.llenarArray(numArray);
        
        System.out.println("En total fueron " + moneda1.caras() + " caras");
        System.out.println("");
        System.out.println("En total fueron " + moneda1.cruces() + " cruces");
        System.out.println("");
        
        moneda1.imprimir();
    }
}
