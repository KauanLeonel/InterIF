import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        String palavraPadrao = "";
        float comp = 0, media = 0;
        int quantLote, analises;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tubo padrão separado por espaços: ");
        palavraPadrao = sc.nextLine();
        String[] padrao = palavraPadrao.split(" ");

        do {
            System.out.println("Insira a quantidade de tubos para analisar: ");
            quantLote = sc.nextInt();
        } while (quantLote < 1 || quantLote > 100);

        String[][] lote = new String[quantLote][8];

        sc.nextLine(); // Limpar o buffer

        for (int i = 0; i < quantLote; i++) {
            System.out.println("Insira o tubo padrão separado por espaços do lote: ");
            palavraPadrao = sc.nextLine();
            lote[i] = palavraPadrao.split(" ");
        }

        /*
         * for (int i = 0; i < lote.length; i++) {
         * for (int j = 0; j < lote[i].length; j++) {
         * System.out.print(lote[i][j] + " ");
         * }
         * System.out.print("\n");
         * }
         */

        do {
            System.out.println("Quantas analises serão feitas: ");
            analises = sc.nextInt();
        } while (analises < 1 || analises > 100);

        for (int i = 0; i < analises; i++) {
            System.out.println("Qual o percentual dessa analise: ");
            float percentual = sc.nextFloat();
            for (int j = 0; j < lote.length; j++) {
                comp = 0;
                for (int k = 0; k < lote[j].length; k++) {
                    if (padrao[k].equals(lote[j][k])) {
                        comp++;
                    }

                }
                comp = (100 * comp) / padrao.length;
                if (comp >= percentual) {
                    media += comp;
                }

            }
            media /= lote.length;
            System.out.println(media);
        }

    }
}
