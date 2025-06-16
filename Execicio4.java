import java.util.Scanner;

public class Execicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavras = sc.nextLine();
        String[] teste = palavras.split(" ");
        String[][] sla = new String[teste.length][2];
        int soma = 1;
        for (int i = 0; i < teste.length; i++) {
            soma = 1;
            for (int j = 0; j < teste.length; j++) {
                if(teste[i] == teste[j]){
                    soma++;
                }
            }
            sla[i][0] = teste[i];
            sla[i][1] = soma;
        }

        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i]);
        }

    }
}
