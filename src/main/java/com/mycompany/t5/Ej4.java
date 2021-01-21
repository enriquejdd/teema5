/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Arrays;
import java.lang.Comparable;
import java.util.Scanner;

/**
 * Escribe un programa que, dado un array de enteros, busque si un número
 * obtenido por teclado se encuentra en el array e imprima la primera posición
 * en la que se encuentra el número. Realiza el ejercicio utilizando el método
 * de búsqueda secuencial. Repite la búsqueda usando el método de la clase
 * Arrays (pág 22 de los apuntes).
 *
 * @author enrique
 */
public class Ej4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;

        int[] array = {1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14, 15};

        System.out.println("¿Qué numero quiere comprobar si está en el array?");
        int buscArray = teclado.nextInt();

        System.out.println("");
        System.out.println("Busqueda normal del dato");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscArray) {
                System.out.println("El número indicado se encuentra en la posición " + posicion);
            }
            posicion++;
        }
        System.out.println("");
        System.out.println("Probemos a buscara otro numero con la busqueda binaria.");
        buscArray = teclado.nextInt();
        Arrays.binarySearch(array, buscArray);
    }
}
