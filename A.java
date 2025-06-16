import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] minutos = new int[n];
        
        for (int i = 0; i < n; i++) {
            minutos[i] = sc.nextInt();
        }

        int ultimoInteressante = 0;

        for (int i = 0; i < n; i++) {
            if (minutos[i] - ultimoInteressante > 15) {
                System.out.println(ultimoInteressante + 15);
                return;
            }
            ultimoInteressante = minutos[i];
        }

        System.out.println(Math.min(ultimoInteressante + 15, 90));
    }
}
