/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

/**
 *
 * @author Enrique
 */
public class Ej16_Prueba {

    public static void main(String[] args) {
        Ej15_LanzarMoneda ale1 = new Ej15_LanzarMoneda();
        System.out.println(Ej15_LanzarMoneda.lanzar());
        System.out.println("");
        
        ale1.llenarArray();
        System.out.println("En total fueron " + ale1.caras() + " caras");
        System.out.println("");
        System.out.println("En total fueron " + ale1.cruces() + " cruces");
        System.out.println("");

        ale1.imprimir();
    }
}
