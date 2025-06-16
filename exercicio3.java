import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String teste = " ";
        int k = 0;
        String[][] alunos = new String[n][2];
        for (int i = 0; i < n + 1; i++) {
            teste = sc.nextLine();
           
            for (int j = 0; j < teste.length(); j++) {
                if(teste.charAt(j) == '0' || teste.charAt(j) == '1' || teste.charAt(j) == '2' || teste.charAt(j) == '3'
                || teste.charAt(j) == '4' || teste.charAt(j) == '5' || teste.charAt(j) == '6' || teste.charAt(j) == '7'
                || teste.charAt(j) == '8' || teste.charAt(j) == '9'){
                    alunos[k][0] = teste.substring(0, j);
                    alunos[k][1] = teste.substring(j);
                    
                }
            }
        }
        for (int i = 0; i < alunos.length; i++) {
            if(Float.parseFloat(alunos[k][1]) > 6){
                System.out.println("APROVADO: " + alunos[i][0]);
            }
            System.out.println(alunos[i][0] + " " + alunos[i][1]);
        }
    }
}
