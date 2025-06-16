package Exercicios.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        String res = "";
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(0,1,1));
        
        for (int i = 3; i < num ; i++) {
            if(num > 2){
            numeros.add(numeros.get(numeros.size() - 1) + numeros.get(numeros.size() - 2));
        
        }
        }
    
        for (int i = 0; i < numeros.size(); i++) {
            if (i == numeros.size() - 1) {
                res += numeros.get(i);
            }
            else{
                res += numeros.get(i) + " ";
            }
        }
        System.out.println(res);
    }
}
