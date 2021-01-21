/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Se desea manejar dos listas (ArrayList) de Integer. La cantidad de elementos
 * de la lista 1 debe ser un número aleatorio entre 5 y 15.
 *
 * La cantidad de elementos de la lista 2 debe ser un número aleatorio entre 10
 * y 20. El rango de los números que serán agregados a la lista DEBE estar entre
 * 50 y 100.
 *
 * Se pide construir una aplicación en Java que permita cumplir con la siguiente
 * funcionalidad:
 *
 * Imprimir las listas que han sido generadas. Usa for-each.
 *
 * Crear una tercera lista que contenga los elementos que están en la lista 1 y
 * NO ESTÁN en la lista 2 Imprimir la tercera lista.
 *
 * Crear una cuarta lista que contenga los elementos de la lista 1 que son pares
 * y los elementos de la lista 2 que son impares Imprimir la cuarta lista.
 *
 * Usa una expresión lambda.(foreach)
 *
 * @author enrique
 */
public class Ej24 {

    static Random aleatorio = new Random();

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>(aleatorio.nextInt(15 - 5 + 1) + 5);
        ArrayList<Integer> lista2 = new ArrayList<>(aleatorio.nextInt(20 - 10 + 1) + 10);

        Ej24.rellenar(lista1, aleatorio.nextInt(15 - 5 + 1) + 5);
        Ej24.rellenar(lista2, aleatorio.nextInt(20 - 10 + 1) + 10);
        
        System.out.println(lista1.size());
        System.out.println(lista2.size());
        System.out.println("");
        

        System.out.print("Lista 1:");
        Ej24.imprimirLista(lista1);

        System.out.println("");
        System.out.print("Lista 2:");
        Ej24.imprimirLista(lista2);

        ArrayList<Integer> lista3 = new ArrayList<>();
        Ej24.generarLista3(lista1, lista2, lista3);
        System.out.println("");
        System.out.print("Lista 3:");
        Ej24.imprimirLista(lista3);

        ArrayList<Integer> lista4 = new ArrayList<>();

    }

    public static void rellenar(ArrayList e, int num) {
        for (int i = 0; i < num; i++) {
            e.add(aleatorio.nextInt(100 - 50 + 1) + 50);

        }
    }

    public static void imprimirLista(ArrayList e) {
//        e.forEach(System.out::println);
        e.forEach(u->System.out.print("\t" + u));
    }
    
//    public Ej24 clonar(ArrayList e){
//        
//    }

    
    public static void generarLista3(ArrayList a, ArrayList b, ArrayList c) {
        // Clonar la lista 1 y borramos los numeros que si estan en la lista 2

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i).equals(b.get(i))) {
                    c.remove(a.get(i));
                } 
            }
        }
    }

//    public static void generarLista4(ArrayList a, ArrayList b, ArrayList c) {  
//
//        for (int i = 0; i < a.size(); i++) {
//            if (a.get(i) % 2 == 0) {
//                c.add(a.get(i));
//            }
//        }
//
//        for (int i = 0; i < b.size(); i++) {
//            if (b.get(i) % 2 == 1) {
//                c.add(b.get(i));
//            }
//        }
//    }
}
