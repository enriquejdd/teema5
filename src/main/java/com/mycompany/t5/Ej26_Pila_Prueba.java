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
public class Ej26_Pila_Prueba {

    public static void main(String[] args) {
        Ej26_Pila p1 = new Ej26_Pila(5);
        Ej26_Pila p2 = new Ej26_Pila(5);

        System.out.println("Añadimos valores a la pila p1");
        p1.apliar('a');
        p1.apliar('e');
        p1.apliar('i');
        p1.apliar('o');
        p1.apliar('u');
        System.out.println("");
        p1.apliar('X'); // Al estar compleat de tamaño no entra en el ArrayList.

        System.out.println("¿Está p1 vacia?");
        p1.estaVacia();
        System.out.println("");

        System.out.println("¿Qué tamaño tiene p1?");
        p1.saberTamanio();
        System.out.println("");

        System.out.println("¿Está p1 llena?");
        p1.estaLlena();
        System.out.println("");

        System.out.println("Veamos sus valores de p1");
        p1.mostrarElementos();
        System.out.println("");

        char[] arrayChar = {'h', 'o', 'l', 'a'};

        p2.rellenar(arrayChar);
        System.out.println("¿Qué tamaño tiene p2?");
        p2.saberTamanio();
        System.out.println("");

        System.out.println("Veamos sus valores de p2");
        p2.mostrarElementos();
        System.out.println("");

        p1.rellenar(arrayChar);
        System.out.println("Veamos sus valores de p1");
        p1.mostrarElementos();
        System.out.println("");

        char[] a = null;
        p1.sacarElementos(a);

        System.out.println("Veamos sus valores de p1");
        p1.mostrarElementos();
        System.out.println("");
        


    }

}
