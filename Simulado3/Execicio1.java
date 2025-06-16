package Simulado3;

import java.util.Scanner;

public class Execicio1 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.nextLine();
        String[] nomes = new String[num];
    for (int i = 0; i < nomes.length; i++) {
        nomes[i] = sc.nextLine();
    }
    String[] apelidos = new String[num];
    for (int i = 0; i < nomes.length; i++) {
        apelidos[i] = nomes[i].substring(0, 3).toUpperCase();
    }

    for (int i = 0; i < nomes.length; i++) {
        System.out.println(apelidos[i]);
    }
    }
}
