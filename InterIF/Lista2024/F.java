import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        int teams, matchesNumber;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de times: ");
        teams = sc.nextInt();
        System.out.println("Insira a quantidade de partidas: ");
        matchesNumber = sc.nextInt();
        String[] matches = new String[matchesNumber];
        sc.nextLine();
        for(int i = 0; i < matchesNumber; i++){
            System.out.println("Insira a partida " + (i + 1) );
            matches[i] = sc.nextLine();
        }

        String[][] wordSeparation = new String[matchesNumber][];

        for(int i = 0; i < matchesNumber; i++){
            wordSeparation[i] = matches[i].split(" ");
        }

        String[][] times = new String[teams][];
        int comp = 0;
        for(int i = 0; i < teams; i++){
            comp = 0;
            for(int j = 0; j < teams; j++){
                if(wordSeparation[i][j].equals(times[i][j])){
                    comp = 1;
                }
            }
            if (comp == 0){
                times[i][1] = wordSeparation[i][1];
            }
        }
        
        for(int i = 0; i < wordSeparation.length; i ++){
            for(int j = 0; j< wordSeparation[i].length; j++){
                System.out.println(times[i][j]);
            }
        }
    }
}
