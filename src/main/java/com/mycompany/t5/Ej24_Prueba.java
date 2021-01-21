/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Ej24_Prueba {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        ArrayList<Integer> lista1 = new ArrayList<>(aleatorio.nextInt(15 - 5 + 1) + 5);
        ArrayList<Integer> lista2 = new ArrayList<>(aleatorio.nextInt(20 - 10 + 1) + 10);

    }
}
