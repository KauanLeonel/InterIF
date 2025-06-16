package Exercicios.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        ArrayList pares = new ArrayList<>();
        ArrayList impares = new ArrayList<>();
        int num = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }

            if (pares.size() == 5) {
                for (int j = 0; j < pares.size() ; j++) {
                    System.out.println("par["+j+"] = " + pares.get(j));
                }
                pares.clear();
            }

            if (impares.size() == 5) {
                for (int j = 0; j < impares.size(); j++) {
                    System.out.println("impar["+j+"] = " +impares.get(j));
                }
                impares.clear();
            }
        }
        for (int i = 0; i < impares.size() ; i++) {
            System.out.println("impar["+i+"] = " +impares.get(i));

        }
        for (int i = 0; i < pares.size() ; i++) {
            System.out.println("par["+i+"] = " +pares.get(i));

        }

    }
}
