import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        String words = "";
        boolean vali = false;
        int people, relation, test;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Insira respectvamente o número de pessoas, o número de relações e o número de casos teste: ");
        words = sc.nextLine();
           String[] nums = words.split(" ");

            people = Integer.parseInt(nums[0]);
            relation = Integer.parseInt(nums[1]);
            test = Integer.parseInt(nums[2]);
           if(people >= 3 && people <= 15 && relation >= 0 && relation <= people && test > 0 && test < (people * (people - 1))){
            vali = true;
           }
        } while (vali == false);
        String[] rela = new String[relation];
        for(int i = 0; i < relation; i++){
            System.out.println("Insira a relação " + i + 1);
            rela[i] = sc.nextLine();
        }
    }
}
