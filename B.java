import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int num = 0;
        int temp = 0;
        int maior;
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> resultados = new ArrayList<>();
        ArrayList<Integer> vencedores = new ArrayList<>();
        while (true) {
        
            ArrayList<Integer> resultados = new ArrayList<>();
            num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                temp = sc.nextInt();
                resultados.add(temp);
            }
            if(num == 0){
                break;
            }
            maior = resultados.get(0);
            for (int i = 1; i < resultados.size(); i++) {
                if (maior < resultados.get(i)) {
                    maior = resultados.get(i);
                    temp = i;
                }
            }
            vencedores.add(temp);
        }

        for (int i = 0; i < vencedores.size(); i++) {
            System.out.println(vencedores.get(i) + 1);
        }
    }
}
