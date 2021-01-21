/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Scanner;

/**
 * Realizar un programa que lea de la entrada un número y utilice ese número
 * para crear un array de enteros de ese tamaño. A continuación, el programa
 * inicializa el array con los valores que el usuario introduzca por teclado.
 * Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como
 * indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2
 * producirán la siguiente salida:
 *
 * *****
 * ****
 * ***
 * **
 *
 * @author enrique
 */
public class Ej8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es la longitud del array?");
        int longitud = teclado.nextInt();

        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            System.out.println("¿Qué valor tiene la casilla " + i + " del array?");
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
