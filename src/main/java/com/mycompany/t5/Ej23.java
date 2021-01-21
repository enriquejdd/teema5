/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Ej23 {

    Random aleatorio = new Random();

    private ArrayList<Integer> Numeros;

    public Ej23(int numelementos) {
        Numeros = new ArrayList<>(numelementos);
        for (int i = 0; i < numelementos; i++) {
            Numeros.add(aleatorio.nextInt(100) + 10);
        }
    }

    public void imprimir() {
        Numeros.forEach(System.out::println);
//        for (Integer elemento : Numeros) {
//            System.out.println(elemento);
//        }
    }

    public void imprimirSumaPares() {
        int sum = 0;
        for (int i = 0; i < Numeros.size(); i++) {
            if (Numeros.get(i) % 2 == 0) {
                sum += Numeros.get(i);
            }
        }

        System.out.println("La suma de pares es: " + sum);

    }

    public void imprimirSumaImpares() {
        int sum = 0;
        for (int i = 0; i < Numeros.size(); i++) {
            if (Numeros.get(i) % 2 == 1) {
                sum += Numeros.get(i);
            }
        }

        System.out.println("La suma de impares es: " + sum);

    }

    public void cantImpares() {
        int contador = 0;
        for (int i = 0; i < Numeros.size(); i++) {
            if (Numeros.get(i) % 2 != 0) {
                contador++;
            }
        }
        System.out.println("La cantidad de impares es: " + contador);
    }

    public int devolverMenor() {
        return Collections.min(Numeros);

    }

    public int devolverMayor() {
        return Collections.max(Numeros);

    }

    public void tamanio() {
        System.out.println(Numeros.size());
    }

    public void borrar(int posicion) {
        Numeros.remove(posicion);
    }

    public void borrarValor(int valor) {
        for (int i = 0; i < Numeros.size(); i++) {
            if (Numeros.get(i) == valor) {
                Numeros.remove(i);
                i--;
            }

        }
    }

    public void modificar(int indice, int posicion) {
        Numeros.set(indice, posicion);
    }

}
