/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Scanner;

/**
 * Escribe un programa para leer la altura de un número determinado de personas
 * y calcular la altura media. El número de personas se pide por teclado y debe
 * ser entero un entero mayor que cero. Posteriormente el programa irá pidiendo
 * la altura, en cm, de cada una de las personas y las guardará en una
 * estructura de almacenamiento. Si la altura leída no es positiva, el programa
 * la pasará a número positivo. También es necesario saber cuántas personas
 * tienen una altura superior a la media e inferior a la media. *
 *
 * @author enrique
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumaAlturas = 0;
        int media;
        int supMedia = 0;
        int infMedia = 0;

        System.out.println("¿Cuántas personas hay?");
        int nPersonas = teclado.nextInt();

        while (nPersonas < 0) {
            System.out.println("Valor no válido, escriba otro.");
            nPersonas = teclado.nextInt();
        }

        int[] altura = new int[nPersonas];

        // Bucle que se repite tantas veces como personas esten y a cada iteracion le da un valor.
        for (int i = 0; i < nPersonas; i++) {
            System.out.println("¿Cuál es su altura? En centimetros");
            altura[i] = teclado.nextInt();

            if (altura[i] < 0) {
                int positivo = altura[i] * -1;
                altura[i] = positivo;
            }
            sumaAlturas = sumaAlturas + altura[i];
        }

        media = sumaAlturas / nPersonas;
        System.out.println("La media de la altura es: " + media);

        // Bucle para guardar el numero de personas por encima y debajo de la media
        for (int i = 0; i < nPersonas; i++) {
            if (altura[i] < media) {
                infMedia++;
            } else {
                supMedia++;
            }
        }

        // Mostramos cuantas personas hay por encima de la media
        if (supMedia > 1) {
            System.out.print("Entre todas las personas que se han medido hay " + supMedia + " personas que miden más que la media y");
        } else if (supMedia == 1) {
            System.out.print("Entre todas las personas que se han medido hay 1 persona que mide más que la media y");
        } else {
            System.out.print("No hay personas que midan más que la media y");
        }

        // Mostramos cuantas personas hay por debajo de la media
        if (infMedia > 1) {
            System.out.print(" hay " + infMedia + " personas que miden menos que la media");
        } else if (infMedia == 1) {
            System.out.print(" hay 1 persona que mide menos que la media");
        } else {
            System.out.print(" no hay personas que midan menos que la media");
        }

    }
}
