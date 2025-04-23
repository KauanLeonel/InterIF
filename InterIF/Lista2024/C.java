import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        int num;
        boolean primo = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor máximo para o sistema: ");
        num =sc.nextInt();
        
        for(int i = 2; i < num + 1; i++){
            primo = true;
            for(int j = 2; j < i - 1 ; j++){
                if(i % j == 0){
                    //System.out.println("O numero " + i + " não é primo\n");
                    primo = false;
                    break;
                } 
            }
            if(primo == true) System.out.print(i + " ");
            
        }
    }
}
