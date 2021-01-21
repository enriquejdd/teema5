/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

/**
 * Escribe un programa que muestre cada elemento de un array de enteros y sume
 * todos sus elementos. Instancia e inicializa el array en el programa, sin leer
 * nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.
 *
 * @author enrique
 */
public class Ej1 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número es: " + numeros[i]);
            suma = suma + numeros[i];
        }

        System.out.println("El valor final de los números es: " + suma);
    }
}



