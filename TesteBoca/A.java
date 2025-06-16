package TesteBoca;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] minutos = new int[num];
        int poAtual = 0;
        for (int i = 0; i < num; i++) {
            minutos[i] = sc.nextInt();
        }


        for (int i = 0; i < num; i++) {
            poAtual += 15;
            if(poAtual > minutos[i]){
                poAtual -= poAtual - minutos[i];
            } else{
                break;
            }
        }

        
        System.out.println(poAtual);
        


    
    }
}
