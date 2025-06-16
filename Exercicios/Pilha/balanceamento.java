package Exercicios.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class balanceamento {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        String teste = "correct";
        String formula;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            pilha.clear();
            teste = "correct";
            formula = sc.nextLine();
            for (int i = 0; i < formula.length(); i++) {
                if(formula.charAt(i) == '('){
                    pilha.add("(");
                }
                if(formula.charAt(i) == ')'){
                    if(pilha.size() == 0){
                        teste = "incorrect";
                        break;
                    }
                    pilha.pop();
                }
            }
            if(!pilha.isEmpty()) teste = "incorrect";
            System.out.println(teste);
        }
        sc.close();
    }
}
