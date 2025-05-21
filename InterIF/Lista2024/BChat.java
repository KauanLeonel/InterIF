
import java.util.Scanner;

public class BChat {


    //função para determinar o tempo em MS, ele recebe a String, corta com o split em várias partes
    public static int tempoParaMs(String tempo) {
        //String recebida, ex: 01:02.123
        String[] partes1 = tempo.split(":"); // Ficaria assim (01, 02.123). A gente só vai usar o primeiro indice
        String[] partes2 = partes1[1].split("\\."); //Ficaria assim (01:02.,123). A gente só vai usar o segundo indice
        int minutos = Integer.parseInt(partes1[0]);
        int segundos = Integer.parseInt(partes2[0]);
        int milissegundos = Integer.parseInt(partes2[1]);
        return minutos * 60000 + segundos * 1000 + milissegundos; //retorna tudo em milisegundos
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX_PILOTOS = 100;
        int MAX_VOLTAS = 1000;

        int a = sc.nextInt(); // número de pilotos
        int b = sc.nextInt(); // voltas registradas
        int c = sc.nextInt(); // voltas inválidas
        sc.nextLine();

        String[] nomes = new String[a];
        String[] siglas = new String[a];
        int[][] temposMs = new int[a][MAX_VOLTAS];
        String[][] temposStr = new String[a][MAX_VOLTAS];
        int[] qtdVoltas = new int[a];

        // Leitura dos nomes e geração de siglas
        for (int i = 0; i < a; i++) {
            nomes[i] = sc.nextLine().trim(); //Pega o nome e tira os espaços em branco
            siglas[i] = nomes[i].substring(0, 3).toUpperCase(); //Utilização do substring para pegar só as três primeiras letras  
        }

        String[] voltasSigla = new String[b];
        String[] voltasTempo = new String[b];

        //ARMAZENA TODAS AS VOLTAS, INDEPENDENTE DE CORREDOR E MINUTO, ELE APENAS ARMAZENA E NÃO ASSOCIA
        for (int i = 0; i < b; i++) {
            String[] linha = sc.nextLine().split(" ");
            voltasSigla[i] = linha[0];
            voltasTempo[i] = linha[1];
        }

        //TIRAR AS VOLTAS INVALÁIDAS
        //Ele fez desse jeito: criou um array do tamanho do array que contém as voltas. Cada possição de voltaInvalida representa se a volta é válida no outro array
        boolean[] voltaInvalida = new boolean[b];
        for (int i = 0; i < c; i++) {
            String[] linha = sc.nextLine().split(" ");
            String invalidaSigla = linha[0];
            String invalidaTempo = linha[1];
            //Aqui ele pegou a volta e separou
            
            for (int j = 0; j < b; j++) {
                //Faz um for percorrendo o array e vê se a volta é válida, se ela for a posiçaõ fica como true
                if (voltasSigla[j].equals(invalidaSigla) && voltasTempo[j].equals(invalidaTempo)) {
                    voltaInvalida[j] = true;
                }
            }
        }

        // Associar voltas válidas aos pilotos
        for (int i = 0; i < b; i++) {
            if (voltaInvalida[i])
                continue; //Se a volta for inválida ele ignora o restante do código e vai pro próximo do looping

            String sigla = voltasSigla[i];
            String tempoStr = voltasTempo[i];
            int tempoMs = tempoParaMs(tempoStr);

            for (int j = 0; j < a; j++) {
                if (sigla.equals(siglas[j])) { //Ele vai comparar a sigla com o nome, exemplo, foi a ana e ela é indice [0] 
                    temposMs[j][qtdVoltas[j]] = tempoMs; //tempoMs[0][0] = tempo da Ana
                    temposStr[j][qtdVoltas[j]] = tempoStr; //tempoMs[0][0] = tempo da Ana em Ms
                    qtdVoltas[j]++; //Incrementar em cada volta
                    break;
                }
            }
        }

        // Encontrar melhor volta de cada piloto
        int[] melhorTempoMs = new int[a];
        String[] melhorTempoStr = new String[a];
        int[] melhorOrdem = new int[a];
        for (int i = 0; i < a; i++) {
            melhorTempoMs[i] = Integer.MAX_VALUE; //Ele inicia o valor de melhor tempo de cada corredor com um número muito grande
            for (int j = 0; j < qtdVoltas[i]; j++) {
                if (temposMs[i][j] < melhorTempoMs[i] ||
                        (temposMs[i][j] == melhorTempoMs[i] && j < melhorOrdem[i])) {//Se o tempo for menor ele atualiza, se ele for igual, ele atualiza com a menor posição 
                    melhorTempoMs[i] = temposMs[i][j];
                    melhorTempoStr[i] = temposStr[i][j];
                    melhorOrdem[i] = j;
                }
            }
        }

        // Ordenar os pilotos com base na melhor volta
        int[] indices = new int[a]; //cria um array só com os indíces dos pilotos
        for (int i = 0; i < a; i++)
            indices[i] = i;


            //Ele faz um método de ordenação com base nos índices, preservando o índice original
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                int pi = indices[i];
                int pj = indices[j];
                if (melhorTempoMs[pi] > melhorTempoMs[pj] ||
                        (melhorTempoMs[pi] == melhorTempoMs[pj] && melhorOrdem[pi] > melhorOrdem[pj])) {
                    int tmp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = tmp;
                }
            }
        }

        // Imprimir resultado
        for (int i = 0; i < a; i++) {
            int idx = indices[i];
            System.out.printf("%d %s %s%n", i + 1, nomes[idx], melhorTempoStr[idx]);
        }
    }
}
