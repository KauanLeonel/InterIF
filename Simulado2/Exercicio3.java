package Simulado2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int n = 0, m= 0, quant = 0 ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o n");
        do{
            n = sc.nextInt();
        } while(n <= 1);
        System.out.println("Insira o m");
        do{
            m = sc.nextInt();
        } while(m >= 1000);
        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < matriz.length; i+= 2) {
            for (int j = 0; j < matriz[i].length; j+= 2) {
                quant++;
            }
        }

        for (int i = 1; i < matriz.length; i+= 2) {
            for (int j = 1; j < matriz[i].length; j+= 2) {
                quant++;
            }
        }

        // for (int i = 0; i < matriz.length; i ++) {
        //     for (int j = 0; j < matriz.length; j++) {
        //         if(i == 0){
        //             if(j == 0){
        //                 if(matriz[i + 1][j] != 0 && matriz[i][j + 1] != 0){
        //                     quant++;
        //                 }
        //             }
        //         }
        //     }
        // }

        System.out.println(quant);
    }


}
