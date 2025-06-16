package Simulado2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String nome = "";
        int add = 0, comp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase:  ");
        do{
            nome = sc.nextLine();
        }while(nome.length() >= 1000 && nome.length() < 1);
        int tamanho = nome.length();
        for (int i = 0; i < nome.length(); i++) {
            for (int j = 0; j < nome.length(); j++) {
                if(nome.charAt(i) == nome.charAt(j)){
                    comp++;
                    
                }
            }
            if(comp > 1){
                tamanho--;
                System.out.println("AA");
                add++;
            }
            comp = 0;
        }
        int total = 0;
        if(tamanho > 0)
         total = 2;
        for(int i = tamanho - 1; i >= 1; i-- ){
            if(tamanho > 0)
            total *= 2;
        }
        if(tamanho > 0)
        total = total - 1 + add;
        else{
            total =+ add;
        }
        System.out.println(total);
    }
}
