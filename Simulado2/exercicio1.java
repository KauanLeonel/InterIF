package Simulado2;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int tam;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Rodando");
        do{
        tam = sc.nextInt();
        }while(tam <= 1 && tam <= 1000);

        //System.out.println("Passou");
        int vet[] = new int[tam];

        for(int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        int quant = 1;
        int maior = 0;
        int menor = vet[0];
        
        for (int i = 0; i < vet.length; i++) {
            quant = 1;
            menor = vet[i];
            for (int j = 0; j < vet.length; j++) {
                if(menor < vet[j]){
                    menor = vet[j];
                    quant++;
                }
            }
            
            if(quant > maior) maior = quant;
        }

        System.out.println(maior);
    }
}
