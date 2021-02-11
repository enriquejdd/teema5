/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class Ej26_Pila {

    private ArrayList<Character> Pila;
    private int tamaniopila;
    private static int tamPila = 0;

    public Ej26_Pila(int tamaniopila) {
        this.tamaniopila = tamaniopila;
        Pila = new ArrayList<>(tamaniopila);
    }

    public ArrayList<Character> getPila() {
        return Pila;
    }

    public void setPila(ArrayList<Character> Pila) {
        this.Pila = Pila;
    }

    public int getTamaniopila() {
        return tamaniopila;
    }

    public void setTamaniopila(int tamaniopila) {
        this.tamaniopila = tamaniopila;
    }

    public void apliar(char e) {
        if (tamaniopila > tamPila) {
            Pila.add(e);
        } else {
            estaLlena();
            System.out.println("No se pudo apilar " + e);
        }
        tamPila++;
    }

    public void desapilar() {
        Pila.remove(Pila.size() - 1);
        tamPila--;
    }

    public void estaVacia() {
        if (Pila.isEmpty()) {
            System.out.println("La pila se encuentra vacia");
        } else {
            System.out.println("La pila NO se encuentra vacia");
        }
    }

    public void estaLlena() {
        if (tamPila < tamaniopila) {
            System.out.println("La pila No está llena");
        } else {
            System.out.println("La pila está llena");
        }
    }

    public void saberTamanio() {
        System.out.println(Pila.size());
    }

    public void mostrarElementos() {
        if (tamPila == 0) {
            estaVacia();
        } else {
            for (int i = 0; i < Pila.size(); i++) {
                System.out.print(Pila.get(i) + " ");
            }
            System.out.println("");
        }
    }

    public void rellenar(char[] array) {
        // Si la pila se encuentra vacia obtenga el tamaño del array y la rellene.
        if (Pila.isEmpty()) {
            setTamaniopila(array.length);
            for (int i = 0; i < array.length; i++) {
                Pila.add(array[i]);
            }
            // Si la pila tiene elementos que sumen su tamaño y añada los elementos del array.
        } else {
            setTamaniopila((Pila.size() + array.length));
            for (int i = 0; i < array.length; i++) {
                Pila.add(array[i]);
            }
        }

    }

    public char[] sacarElementos(char[] array) {
        array = new char[Pila.size()];
        for (int i = 0; i < Pila.size(); i++) {
            array[i] = Pila.get(i);
        }

        for (int i = Pila.size(); i > 0; i--) {
            Pila.remove(Pila.size() - 1);
        }

        return array;
    }

}
