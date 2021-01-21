/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Random;

/**
 * Escribe una clase LanzarMoneda que tenga como único atributo un array de
 * booleanos de tamaño 1000. La clase tendrá los siguientes métodos:
 *
 * un constructor que inicializa el array.
 *
 * un método de clase, llamado lanzar(), que devuelve un booleano (cara o cruz).
 *
 * llenarArray(), para rellenar el array, de forma que simule 1000 lanzamientos
 * de una moneda. El método debe almacenar el resultado de cada tirada cada
 * elemento del array.
 *
 * caras(), método para saber cuántas “caras” hay almacenadas en el array. Este
 * método devuelve los datos en formato entero.
 *
 * cruces(), método para saber cuántas “cruces” hay almacenadas en el array.
 * Este método devuelve los datos en formato entero.
 *
 * imprimir(), método para imprimir el resultado de los 1000 lanzamientos, de
 * forma que aparezca el número de lanzamiento y el resultado (cara o cruz).
 *
 * En todo momento se controlará que el programa no genere las excepciones
 * NullPointer y ArrayIndexOutOfBounds.
 *
 * @author Enrique
 */
public class Ej15_LanzarMoneda {

    private boolean[] array;

    public Ej15_LanzarMoneda() {
        array = new boolean[1000];
    }

    public static boolean lanzar() {
        Random aleatorio = new Random();
        return aleatorio.nextBoolean();// Si es true será cara, si es false será cruz.
    }

    public void llenarArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = lanzar();
        }

    }

    public int caras() {
        int contadorCaras = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                contadorCaras++;
            }
        }
        return contadorCaras;
    }

    public int cruces() {
        int contadorCruz = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                contadorCruz++;
            }
        }
        return contadorCruz;
    }

    public void imprimir() {
        for (int i = 0; i < array.length; i++) {
            String caraCruz;
            if (!array[i]) {
                caraCruz = "Cruz";
            }else{
                caraCruz = "Cara";
            }
            System.out.println("En la tirada " + i + " el resultado fue " + caraCruz);
            
        }
    }
}
