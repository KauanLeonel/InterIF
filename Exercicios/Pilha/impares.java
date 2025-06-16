package Exercicios.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int num = sc.nextInt();

        for (int i = num; 0 < i ;i--) {
            if(i % 2 != 0){
                pilha.add(i);
        }
    
    }
    while (!pilha.isEmpty()) {
            System.out.println(pilha.peek());
            pilha.pop();
        }
}
}
