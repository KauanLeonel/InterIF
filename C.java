import java.util.ArrayList;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<int[]> vencedores = new ArrayList<>();
        while (true) {
            int[] numeros = new int[6];
            for (int j = 0; j < 6; j++) {
                numeros[j] = sc.nextInt();
            }
            if (numeros[0] == 0 && numeros[1] == 0) {
                break;
            }
            vencedores.add(numeros);
        }

        // O primeiro conjunto será o sorteado (referência para comparar)
        int[] sorteado = vencedores.get(0);

        // Contadores para acertos 6, 5 e 4
        int[] sorteados = {0, 0, 0};

        // Percorre cada "vencedor" (exceto o sorteado)
        for (int i = 1; i < vencedores.size(); i++) {
            int acertos = 0;
            int[] atual = vencedores.get(i);

            // Conta quantos números batem com o sorteado
            for (int j = 0; j < 6; j++) {
                if (sorteado[j] == atual[j]) {
                    acertos++;
                }
            }

            // Incrementa o contador correspondente
            switch (acertos) {
                case 6:
                    sorteados[0]++;
                    break;
                case 5:
                    sorteados[1]++;
                    break;
                case 4:
                    sorteados[2]++;
                    break;
            }

        }

        System.out.println(6 + " " + sorteados[0]);
        System.out.println(5  + " "  + sorteados[1]);
        System.out.println(4  + " "  + sorteados[2]);
    }
}
