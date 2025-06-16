package Exercicios.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();

        while (true) {
            String[] entrada = sc.nextLine().split(" ");
            int x = Integer.parseInt(entrada[0]);
            int y = Integer.parseInt(entrada[1]);

            if (x == y) {
                break;
            }

            if (x > y) {
                res.append("Decrescente\n");
            } else {
                res.append("Crescente\n");
            }
        }

        System.out.print(res);
    }
}
