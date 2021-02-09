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
        int[][] matriz2 = {{15, 7, 9}, {1, 2, 3}, {5, 15, 17}};

        recorrerMatrizChar(matriz);
        System.out.println("");
        System.out.println("El número mayor de su fila y menor de su columna es el: " + buscarValor(matriz));
        System.out.println("");
        indicarMayor(matriz);
        System.out.println("----------------------");
        System.out.println("");

        recorrerMatrizChar(matriz2);
        System.out.println("");
        System.out.println("El número mayor de su fila y menor de su columna es el: " + buscarValor(matriz2));
        System.out.println("");
        indicarMayor(matriz2);

    }

    public static void recorrerMatrizChar(int[][] matrizNum) {
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.print(matrizNum[i][j] + "\t");

            }
            System.out.println("");
        }
    }

    public static int buscarValor(int[][] matriz) {
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
            if (i == 0) {
                // RECORREMOS NUEVAMENTE EL ARRAY
                for (int h = 0; h < matriz.length; h++) {
                    // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 1) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor2 = matriz[h][valorJ];
                        }
                    }
                    // CUANDO SEA LA TERCERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 2) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor3 = matriz[h][valorJ];
                        }
                    }
                }
                // COMPROBAMOS SI EL VALOR MAYOR DE LA PRIMERA COLUMNA SEA MENOR QUE EL DE LA SEGUNDA Y DE LA TERCERA
                if (numMayor < valor2 && numMayor < valor3) {
                    num = numMayor;
                }

            }
            // EN ESTE CASO ES PARA COMPROBAR EL MAYOR DE LA SEGUNDA COLUMNA
            if (i == 1) {
                // RECORREMOS NUEVAMENTE EL ARRAY
                for (int h = 0; h < matriz.length; h++) {
                    // CUANDO SEA LA PRIMERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 0) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor2 = matriz[h][valorJ];
                        }
                    }
                    if (h == 2) {
                        // CUANDO SEA LA TERCERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor3 = matriz[h][valorJ];
                        }
                    }
                }
                // COMPROBAMOS SI EL VALOR MAYOR DE LA PRIMERA COLUMNA SEA MENOR QUE EL DE LA PRIMERA Y DE LA TERCERA
                if (numMayor < valor2 && numMayor < valor3) {
                    num = numMayor;
                }
            }
            // EN ESTE CASO ES PARA COMPROBAR EL MAYOR DE LA TERCERA COLUMNA
            if (i == 2) {
                // RECORREMOS NUEVAMENTE EL ARRAY
                for (int h = 0; h < matriz.length; h++) {
                    // CUANDO SEA LA PRIMERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 0) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor2 = matriz[h][valorJ];
                        }
                    }
                    // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 1) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor3 = matriz[h][valorJ];
                        }
                    }
                }
                // COMPROBAMOS SI EL VALOR MAYOR DE LA TERCERA COLUMNA SEA MENOR QUE EL DE LA PRIMERA Y DE LA SEGUNDA
                if (numMayor < valor2 && numMayor < valor3) {
                    num = numMayor;
                }
            }
            // EN CADA REPETICION VOLVEMOS A 0 EL VALOR MÁS ALTO Y EL VALOR DE J
            numMayor = 0;
            valorJ = 0;
        }
        return num;
    }

    // NOSE ME OCURRE MANERA DE USAR EL MÉTODO ANTERIOR PARA SACAR ESTE MÉTODO Y HACE MUCHA REDUNDANCIA, PREGUNTAR VICO.
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
            if (i == 0) {
                // RECORREMOS NUEVAMENTE EL ARRAY
                for (int h = 0; h < matriz.length; h++) {
                    // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 1) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor2 = matriz[h][valorJ];
                        }
                    }
                    // CUANDO SEA LA TERCERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 2) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor3 = matriz[h][valorJ];
                        }
                    }
                }
                // COMPROBAMOS SI EL VALOR MAYOR DE LA PRIMERA COLUMNA SEA MENOR QUE EL DE LA SEGUNDA Y DE LA TERCERA
                if (numMayor < valor2 && numMayor < valor3) {
                    num = numMayor;
                }

            } // EN ESTE CASO ES PARA COMPROBAR EL MAYOR DE LA SEGUNDA COLUMNA
            if (i == 1) {
                // RECORREMOS NUEVAMENTE EL ARRAY
                for (int h = 0; h < matriz.length; h++) {
                    // CUANDO SEA LA PRIMERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 0) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor2 = matriz[h][valorJ];
                        }
                    }
                    if (h == 2) {
                        // CUANDO SEA LA TERCERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor3 = matriz[h][valorJ];
                        }
                    }
                }
                // COMPROBAMOS SI EL VALOR MAYOR DE LA PRIMERA COLUMNA SEA MENOR QUE EL DE LA PRIMERA Y DE LA TERCERA
                if (numMayor < valor2 && numMayor < valor3) {
                    num = numMayor;
                }
            } // EN ESTE CASO ES PARA COMPROBAR EL MAYOR DE LA TERCERA COLUMNA
            if (i == 2) {
                // RECORREMOS NUEVAMENTE EL ARRAY
                for (int h = 0; h < matriz.length; h++) {
                    // CUANDO SEA LA PRIMERA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 0) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor2 = matriz[h][valorJ];
                        }
                    }
                    // CUANDO SEA LA SEGUNDA COLUMNA LA RECORREREMOS Y GUARDAREMOS SU VALOR MAS ALTO
                    if (h == 1) {
                        for (int k = 0; k < matriz[i].length; k++) {
                            // GUARDAMOS EL VALOR QUE SE ENCUENTRE EN LA MISMA COLUMNA QUE EL VALRO MÁS ALTO
                            valor3 = matriz[h][valorJ];
                        }
                    }
                }
                // COMPROBAMOS SI EL VALOR MAYOR DE LA TERCERA COLUMNA SEA MENOR QUE EL DE LA PRIMERA Y DE LA SEGUNDA
                if (numMayor < valor2 && numMayor < valor3) {
                    num = numMayor;
                }
            } // DESPUES DE COMPROBAR EL NÚMERO QUE BUSCABAMOS MOSTRAREMOS LA TABLA CON EL NÚMERO EN NEGRITA PARA SOBRESALTARLO.
            if (i + 1 == matriz.length) {
                for (int h = 0; h < matriz.length; h++) {
                    for (int k = 0; k < matriz[i].length; k++) {
                        if (matriz[h][k] == num) {
                            // EN JAVA \033[0;1m PERMITE QUE SE VEA EN "negrita" EL TEXTO.
                            System.out.println("\033[0;1m" + matriz[h][k] + "\t\033[0m");
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

    }
}
