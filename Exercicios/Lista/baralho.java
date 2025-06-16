package Exercicios.Lista;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baralho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        int num;
        String descartadas, ultima;
        while (true) {
            descartadas = "Discarded cards:";
            ultima = "Remaining card: ";
            num = sc.nextInt();
            fila.clear();
            if (num == 0)
                break;
            for (int i = 1; i < num + 1; i++) {
                fila.add(i);
            }
            int tamanho = fila.size();
            for (int i = 0; i < tamanho; i++) {
                if (fila.size() == 1)
                    break;
                if (fila.size() != 2)
                    descartadas += " " + fila.peek() + ",";
                else
                    descartadas += " " + fila.peek();
                fila.poll();
                fila.add(fila.peek());
                fila.poll();

            }
            ultima += fila.peek();

            System.out.println(descartadas);
            System.out.println(ultima);

        }
    }
}
