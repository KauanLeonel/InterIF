package Simulado2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int n = 0, m = 0, k = 0, l = 0, atual, pontoFinal;
        Scanner sc = new Scanner(System.in);
        String nome = "Não chegou";

        do {
            n = sc.nextInt();
        } while (n < 1 && n >= 1000);
        do {
            m = sc.nextInt();
        } while (m < 1 && m >= 5000);

        int matriz[][] = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            do {
                k = sc.nextInt();
                l = sc.nextInt();
            } while (k > n || k < 0 || l > n || k < 0);

            matriz[k][l] = 1;
            matriz[l][k] = 1;
        }
        do {
            atual = sc.nextInt();
        } while (atual < 0 || atual > matriz.length - 1);

        int anterior = 0;

        do {
            pontoFinal = sc.nextInt();
        } while (atual < 0 || atual > matriz.length - 1 || atual == pontoFinal);

        // #region Mostrar
        for (int z = 0; z < matriz.length; z++) {
            for (int j = 0; j < matriz[k].length; j++) {
                System.out.print(matriz[z][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Passo");
        // #endregion
        int vali = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (vali == 1) {
                break;
            }
            if (pontoFinal != atual) {
                if (i != anterior && matriz[atual][i] == 1) {
                    // System.out.println(i +"\n");
                    anterior = atual;
                    atual = i;
                    matriz[anterior][i] = 9;
                    i = 0;

                    // #region Mostrar
                    for (int z = 0; z < matriz.length; z++) {
                        for (int j = 0; j < matriz[k].length; j++) {
                            System.out.print(matriz[z][j] + " ");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("Passo");
                    // #endregion
                }
                if (i == matriz[atual].length - 1 && matriz[atual][i] == 0) {
                    for (int j = 0; j < matriz.length; j++) {
                        if (matriz[atual][j] == 1) {
                            vali = 1;
                        }
                    }
                    System.out.println("Passou");
                    matriz[anterior][atual] = 0;
                    atual = anterior;
                    i = 0;
                }
            } else {
                nome = "Chegou";
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[k].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println(nome);

    }

}
