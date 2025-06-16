package Exercicios.ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class roupas {
    public static void main(String[] args) {
        int num = 0;
        // String temp = "";
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> roupas = new ArrayList<>();
        while (true) {
            num = sc.nextInt();
            sc.nextLine();
            if (num == 0) {
                break;
            }

            for (int i = 0; i < num; i++) {
                String[] nomes = new String[3];
                nomes[0] = sc.nextLine();
                String[] temp = sc.nextLine().split(" ");
                nomes[1] = temp[0];
                nomes[2] = temp[1];
                roupas.add(nomes);
            }

            //Cores
               for (int i = 0; i < roupas.size() - 1; i++) {
                if (roupas.get(i)[1].equals("branco") && roupas.get(i + 1)[1].equals("vermelho")) {
                    String[] temporaria = roupas.get(i);
                    roupas.set(i, roupas.get(i + 1));
                    roupas.set(i + 1, temporaria);
                }
            }

            for (int i = roupas.size() - 1; i > 0; i--) {
         {       if(roupas.get(i)[1].equals(roupas.get(i + 1)[1]))
                if (roupas.get(i)[2].equals("p") && !roupas.get(i - 1)[2].equals("p")) {
                    String[] temporaria = roupas.get(i);
                    roupas.set(i, roupas.get(i - 1));
                    roupas.set(i - 1, temporaria);
                }}
            }
            for (int i = 0; i < roupas.size() - 1; i++) {
                if(roupas.get(i)[1].equals(roupas.get(i + 1)[1])){
                if (roupas.get(i)[2].equals("g") && !roupas.get(i + 1)[2].equals("g")) {
                    String[] temporaria = roupas.get(i);
                    roupas.set(i, roupas.get(i + 1));
                    roupas.set(i + 1, temporaria);
                }}
            }
          

              // nome
            for (int pass = 0; pass < roupas.size() - 1; pass++) {
                  if(roupas.get(pass)[1].equals(roupas.get(pass + 1)[1]) && roupas.get(pass)[2].equals(roupas.get(pass + 1)[2])){{
                for (int i = 0; i < roupas.size() - 1 - pass; i++) {
                    
                    if (roupas.get(i)[0].charAt(0) > roupas.get(i + 1)[0].charAt(0)) {
                        String[] temporaria = roupas.get(i);
                        roupas.set(i, roupas.get(i + 1));
                        roupas.set(i + 1, temporaria);
                    }}
                }
            }
        }
        for (int i = 0; i < roupas.size(); i++) {
            String[] item = roupas.get(i);
            System.out.println(item[0] + " - " + item[1] + " - " + item[2]);
        }

    }
}
}