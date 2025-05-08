package Simulado2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int n = 0, m = 0, k = 0, l = 0;
        Scanner sc = new Scanner(System.in);
        String nome = "Não chegou";
        
        do{
            n = sc.nextInt();
        }while(n < 1 && n >= 1000);
        do{
            m = sc.nextInt();
        }while(m < 1 && m >= 5000);


        int matriz[][] = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            k = sc.nextInt();
            l = sc.nextInt();
            matriz[k][l] = 1;
            matriz[l][k] = 1;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == 3){
                    nome = "Chegou";
                } else{
                    if(i != matriz[i][j] && matriz[i][j] == 1){
                        i = j;
                    }
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[k].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println(nome);
    
    
    
    
    
    }


    
}
