/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ej13_Matriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salir = 1;
        int valor;

        int[] arrayNum = new int[20];

        do {
            do {
                System.out.println("¿Qué valor desea ingresar? 1-20");
                System.out.println("0 para salir.");
                valor = teclado.nextInt();

                while (valor < 0 || valor > 21) {
                    System.out.println("¿Qué valor desea ingresar? 1-20");
                    System.out.println("0 para salir.");
                    valor = teclado.nextInt();
                }

                if (valor == 0) {
                    salir = 0;
                }

                if (valor < 0 || valor > 20) {
                    System.out.println("Valor no válido");
                    System.out.println("");
                }

            } while (valor < 0 || valor > 20);
            arrayNum[valor] =+1;

        } while (salir != 0);
        
        for (int i = 0; i < arrayNum.length; i++) {
            
            
        }
    }
}
