/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Scanner;

/**
 * Declara e inicializa una matriz de caracteres de 2x3. Implementa un método
 * que recibe una matriz de caracteres y la imprime por consola.
 *
 * @author enrique
 */
public class Ej12 {

    public static void recorrerMatrizNum(int[][] matrizNum) {
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.println("Posición[" + i + "][" + j + "], valor: " + matrizNum[i][j]);
            }
        }
    }

    public static void recorrerMatrizChar(char[][] matrizNum) {
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.println("Posición[" + i + "][" + j + "], valor: " + matrizNum[i][j]);
            }
        }
    }

    public static char[][] introducirDatos(int fila, int columnas) {
        Scanner teclado = new Scanner(System.in);
        char[][] matriz = new char[fila][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduca un caracter.");
                matriz[i][j] = teclado.nextLine().charAt(0);
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
        int[][] matrizNum = {{5, 7, 9}, {4, 6, 5}};

        recorrerMatrizNum(matrizNum);
        System.out.println("");

        char[][] matrizCaracteres;
        matrizCaracteres = introducirDatos(2, 3);
        recorrerMatrizChar(matrizCaracteres);
    }
}
