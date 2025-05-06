package OBI2021;

import java.util.Scanner;

public class ogro {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dedos = 0;
    do{
    dedos = sc.nextInt();
    }while(dedos < 0 || dedos > 10);
    String mao1 = "*";
    String mao2 = "*";
    if(dedos < 6){
        mao1 = "";
        for(int i = 0; i < dedos; i++){
            mao1 += "I";
        }
    } else{
        mao1 = "IIIII";
        mao2 = "";
        dedos = dedos - 5;
        for(int i = 0; i < dedos; i ++){
            mao2 += "I";
        }
    }
    System.out.println(mao1);
    System.out.println(mao2);
}   
}
