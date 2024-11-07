package org.example;

public class NoSumar {



    public static int noSumar(int n1, int n2){
        int suma = 0;
        int numero2Invertido = (-n2);
        int numero1Invertido = (-n1);

        if (n1 > n2){
            while (n1 != numero2Invertido){
                suma++;
                numero2Invertido++;
            }
        }

        if (n1 < n2){
            while (n2 != numero1Invertido){
                suma++;
                numero1Invertido++;
            }
        }
        return suma;
    }

}
