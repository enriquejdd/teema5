/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t5;

/**
 *
 * @author Enrique
 */
public class MatrizCuadrada {

    public static void main(String[] args) {
        int[][] matriz = {{15, 7, 9}, {5, 15, 17}, {1, 2, 3}};
        int[][] matriz2 = {{15, 7, 9}, {5, 15, 17}, {1, 2, 3}, {5, 15, 17}, {5, 15, 17}, {1, 2, 3}};

        System.out.println("MOSTRAMOS LA MATRIZ");
        recorrerMatrizChar(matriz);
        System.out.println("");
        System.out.println("MOSTRAMOS LA MATRIZ Y EL NÚMERO REMARCADO");
        indicarMayor(matriz);
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");

        System.out.println("MOSTRAMOS LA MATRIZ");
        recorrerMatrizChar(matriz2);
        System.out.println("");
        System.out.println("MOSTRAMOS LA MATRIZ Y EL NÚMERO REMARCADO");
        buscarMayor(matriz2);

    }

    public static void recorrerMatrizChar(int[][] matrizNum) {
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.print(matrizNum[i][j] + "\t");

            }
            System.out.println("");
        }
    }

    public static void indicarMayor(int[][] matriz) {
        int num = 0;
        int numMayor = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valorJ = 0;

        // RECORREMOS EL ARRAY
        for (int i = 0; i < matriz.length; i++) {
            // RECORREMOS LA PRIMERA FILA DEL ARRAY
            for (int j = 0; j < matriz[i].length; j++) {
                // UNA VEZ RECORRIDA BUSCAMOS EL VALOR MÁS ALTO.
                int numPrueba = matriz[i][j];
                if (numPrueba > numMayor) {
                    numMayor = numPrueba;
                }
                // GUARDAMOS EL Nº DE LA COLUMNA CON EL VALOR MÁS ALTO
                valorJ = j;
            }
            // AL TENER YA UN VALOR MAS ALTO LO COMPROBAMOS CON LAS OTRAS 2 OPCIONES DE LA COLUMNA DEPENDIENDO SU ITERACIÓN
            // EN ESTE CASO ES PARA COMPROBAR EL MAYOR DE LA PRIMERA COLUMNA
            // AL TENER YA UN VALOR MAS ALTO LO COMPROBAMOS CON LAS OTRAS 2 OPCIONES DE LA COLUMNA DEPENDIENDO SU ITERACIÓN
            switch (i) {
                // EN ESTE CASO ES PARA COMPROBAR EL MAYOR DE LA PRIMERA COLUMNA
                case 0:
                    // RECORREMOS NUEVAMENTE EL ARRAY
                    for (int h = 0; h < matriz.length; h++) {

                        switch (h) {
                            // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                            case 1:
                                for (int k = 0; k < matriz[i].length; k++) {
                                    // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                                    valor2 = matriz[h][valorJ];
                                }
                                break;
                            // CUANDO SEA LA TERCERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                            case 2:
                                for (int k = 0; k < matriz[i].length; k++) {
                                    // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                                    valor3 = matriz[h][valorJ];
                                }
                                break;
                        }
                    }
                    // COMPROBAMOS SI EL VALOR MAYOR DE LA PRIMERA COLUMNA SEA MENOR QUE EL DE LA SEGUNDA Y DE LA TERCERA
                    if (numMayor < valor2 && numMayor < valor3) {
                        num = numMayor;
                    }
                    break;
                // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                case 1:
                    // RECORREMOS NUEVAMENTE EL ARRAY
                    for (int h = 0; h < matriz.length; h++) {
                        switch (h) {
                            // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                            case 0:
                                for (int k = 0; k < matriz[i].length; k++) {
                                    // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                                    valor2 = matriz[h][valorJ];
                                }
                                break;
                            // CUANDO SEA LA TERCERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                            case 2:
                                for (int k = 0; k < matriz[i].length; k++) {
                                    // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                                    valor3 = matriz[h][valorJ];
                                }
                                break;
                        }
                    }
                    // COMPROBAMOS SI EL VALOR MAYOR DE LA PRIMERA COLUMNA SEA MENOR QUE EL DE LA SEGUNDA Y DE LA TERCERA
                    if (numMayor < valor2 && numMayor < valor3) {
                        num = numMayor;
                    }
                    break;

                case 2:

                    // RECORREMOS NUEVAMENTE EL ARRAY
                    for (int h = 0; h < matriz.length; h++) {
                        // CUANDO SEA LA PRIMERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                        switch (h) {
                            // CUANDO SEA LA PRIMERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                            case 0:
                                for (int k = 0; k < matriz[i].length; k++) {
                                    // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                                    valor2 = matriz[h][valorJ];
                                }
                                break;
                            // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                            case 1:
                                for (int k = 0; k < matriz[i].length; k++) {
                                    // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                                    valor3 = matriz[h][valorJ];
                                }
                                break;
                        }

                    }
                    // COMPROBAMOS SI EL VALOR MAYOR DE LA TERCERA COLUMNA SEA MENOR QUE EL DE LA PRIMERA Y DE LA SEGUNDA
                    if (numMayor < valor2 && numMayor < valor3) {
                        num = numMayor;
                    }
                    break;
            }

            // DESPUES DE COMPROBAR EL NÚMERO QUE BUSCABAMOS MOSTRAREMOS LA TABLA CON EL NÚMERO EN NEGRITA PARA SOBRESALTARLO.
            if (i + 1 == matriz.length) {
                for (int h = 0; h < matriz.length; h++) {
                    for (int k = 0; k < matriz[i].length; k++) {
                        if (matriz[h][k] == num) {
                            // EN JAVA \u001B[31m PERMITE QUE SE VEA EN ROJO EL TEXTO.
                            System.out.print("\u001B[31m" + matriz[h][k] + "\t\u001B[0m");
                        } else {
                            System.out.print(matriz[h][k] + "\t");
                        }

                    }
                    System.out.println("");
                }
            } // EN CADA REPETICION VOLVEMOS A 0 EL VALOR MÁS ALTO Y EL VALOR DE J
            valorJ = 0;
            numMayor = 0;
        }
        System.out.println("");
        System.out.println("El número mayor de su fila y menor de su columna es el: " + num);
    }

    // IDEA CREAR UN FOR QUE RECORRA EL ARRAY, GUARDE EL VALOR MAYOR Y SU POSICION. DENTRO DEL MISMO FOR LO VUELVA A RECORRER PERO ESTA VEZ BUSCANDO LA POSICION COGIDA ANTERIORMENTE 
    // SI EL NUÚMERO ES MENOR QUE EL MAYOR DE LA OTRA FILA SUMARA 1 AL POS. SI POS LLEGA A SER IGUAL DE GRANDE QUE EL TAM DEL ARRAY SIGNIFICA QUE ES EL MENOR DE LA COLUMNA Y DEBE DE MARCARLO EN ROJO
    // QUE LO COMPRUEBE EN CADA UNA DE LAS FILAS PARA VER SI HAY MÁS DE UN NÚMERO MARCADO EN EL ARRAY CUADRADO.
    public static void buscarMayor(int[][] matriz) {
        int lugarNumMayor = 0;
        int pos = 0;
        int mayor = 0;
        int numero = 0;
        int num = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                numero = matriz[i][j];
                if (numero > mayor) {
                    mayor = numero;
                    lugarNumMayor = j;
                }
            }

            for (int k = 0; k < matriz.length; k++) {
                for (int l = 0; l < matriz[k].length; l++) {
                    if (matriz[k][lugarNumMayor] > mayor) {
                        pos++;
                    }
                    if (pos == matriz.length) {
                        num = mayor;
                    }
                }

            }

            if (i + 1 == matriz.length) {
                for (int h = 0; h < matriz.length; h++) {
                    for (int a = 0; a < matriz[i].length; a++) {
                        if (matriz[h][a] == num) {
                            // EN JAVA \u001B[31m PERMITE QUE SE VEA EN ROJO EL TEXTO.
                            System.out.print("\u001B[31m" + matriz[h][a] + "\t\u001B[0m");
                        } else {
                            System.out.print(matriz[h][a] + "\t");
                        }

                    }
                    System.out.println("");
                }
            } // EN CADA REPETICION VOLVEMOS A 0 EL VALOR MÁS ALTO Y EL VALOR DE J
            lugarNumMayor = 0;
            mayor = 0;
            pos = 0;
        }
        System.out.println("");
        System.out.println("El número mayor de su fila y menor de su columna es el: " + num);

    }
}
