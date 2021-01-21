/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Random;

/**
 * Mejora el ejercicio 15 para que el número de lanzamientos pueda ser variable.
 *
 * @author Enrique
 */
public class Ej17_LanzarMoneda2 {

    private boolean[] arrayMoneda;

    public Ej17_LanzarMoneda2(int tamanioArray) {
        this.arrayMoneda = new boolean[tamanioArray];
    }

    public static boolean lanzar(int numLanzamientos) {
        Random aleatorio = new Random();
        do {
            numLanzamientos--;
            return aleatorio.nextBoolean();
        } while (numLanzamientos == 0);

    }

    public void llenarArray(int tamanioArray) {
        for (int i = 0; i < arrayMoneda.length; i++) {
            arrayMoneda[i] = lanzar(tamanioArray);
        }

    }

    public int caras() {
        int contadorCaras = 0;
        for (int i = 0; i < arrayMoneda.length; i++) {
            if (arrayMoneda[i]) {
                contadorCaras++;
            }
        }
        return contadorCaras;
    }

    public int cruces() {
        int contadorCruz = 0;
        for (int i = 0; i < arrayMoneda.length; i++) {
            if (!arrayMoneda[i]) {
                contadorCruz++;
            }
        }
        return contadorCruz;
    }

    public void imprimir() {
        for (int i = 0; i < arrayMoneda.length; i++) {
            String caraCruz;
            if (!arrayMoneda[i]) {
                caraCruz = "Cruz";
            } else {
                caraCruz = "Cara";
            }
            System.out.println("En la tirada " + i + " el resultado fue " + caraCruz);

        }
    }
}
