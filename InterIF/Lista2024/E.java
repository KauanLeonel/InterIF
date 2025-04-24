import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        int quant, temp, valorCheque, celulas = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de tipos de células: ");
        quant = sc.nextInt();
        int[] notas = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o valor da nota: " + (i + 1));
            notas[i] = sc.nextInt();
        }

        for (int i = 0; i < quant; i++) {
            for (int j = 0; j < quant; j++) {
                if (notas[i] > notas[j]) {
                    temp = notas[i];
                    notas[i] = notas[j];
                    notas[j] = temp;
                }
            }
        }

        System.out.println("Insira o valor a ser descontado: ");
        valorCheque = sc.nextInt();

        for(int i = 0; i < quant; i++){
            celulas +=  valorCheque/ notas[i];
            valorCheque = valorCheque % notas[i]; 
        }

        for (int i = 0; i < quant; i++) {
            System.out.println(notas[i]);
        }
        System.out.println(celulas);
    }
}
