package livro_EntAlgoritmos_Aditya;

import java.util.Scanner;

public class RecursaoContagemRegressiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        regressiva(i);
        System.out.println();
        regressiva2(i);
    }

    public static void regressiva(Integer i) {
        if (i <= 0) {
            // caso base
            System.out.print(i);
        }
        else {
            // caso recursivo
            System.out.print(i+"...");
            regressiva(i - 1);
        }
    }

    public static void regressiva2(Integer i) {
        System.out.print(i + " "); //cuidado com as aspas simples ' ', pois é char e é lido tb como valor numérico ASCII 32.
        if(i <= 0) {
            //caso base
        }
        else {
            //caso recursivo
            regressiva2(i - 1);
        }
    }

}
