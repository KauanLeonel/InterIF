package Exercicios.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int num;
        String temp;
        while (sc.hasNextLine()) {
            pilha.clear();
            temp = "";
            num = sc.nextInt();
            if (num == 0) {
                System.out.println(num);
            } else {
                while (num >= 2) {
                    pilha.add(num % 2);
                    num = num / 2;
                }
                pilha.add(num);
                while (!pilha.empty()) {
                    temp += Integer.toString(pilha.peek());
                    pilha.pop();
                }
                System.out.println(temp);
            }

        }
        sc.close();
    }
}
