import java.util.Scanner;

public class InterIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de aluno e a prioridade: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] array= new String[n];
        for(int i = 0 ; i < n; i++){
            array[i] = sc.nextLine();
            
        }

        for(int i = 0 ; i < n; i++){
          System.out.println(array[i]);
        }
    }
}
