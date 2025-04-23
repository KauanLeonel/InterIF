
//package Lista2024;
import javax.swing.JOptionPane;

public class A {

    public static void main(String[] args) {
        String monster;
        boolean ver = false;
        int vogais = 0;
        do {
            monster = JOptionPane.showInputDialog("Insira o nome do monstro: ");
            if (monster.length() > 0 && monster.length() < 21) {
                ver = true;
            }
        } while (ver == false);

        monster = monster.toLowerCase();

        for (int i = 0; i < monster.length(); i++) {
            if(monster.charAt(i) == 'a' || monster.charAt(i) == 'e' || monster.charAt(i) == 'i' || monster.charAt(i) == 'o' || monster.charAt(i) == 'u'){
                vogais++;
            }
        }
        vogais = vogais % 3;
        
        JOptionPane.showMessageDialog(null, "frasco " + vogais);
    }
}