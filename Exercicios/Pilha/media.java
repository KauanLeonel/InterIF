package Exercicios.Pilha;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        double[] notas = new double[2];
        do{
            do{
            notas[0] = sc.nextDouble();
            if(notas[0] < 0 || notas[0] > 10)
            System.out.println("nota invalida");
            }while(notas[0] < 0 || notas[0] > 10);
            do{
            notas[1] = sc.nextDouble();
            if(notas[1] < 0 || notas[1] > 10)
            System.out.println("nota invalida");
            }while(notas[1] < 0 || notas[1] > 10);
            System.out.printf("media = %.2f%n", (notas[0] + notas[1])/2);
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = sc.nextInt();
            }while(x != 2 && x != 1);
        }while(x != 2);
    }
}
