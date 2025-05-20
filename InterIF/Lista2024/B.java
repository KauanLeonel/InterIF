import javax.swing.JOptionPane;

public class B {

   
    public static void main(String[] arg) {
        int a, b, c;
        boolean vali = false;
        String phrase;
        do {
            phrase = JOptionPane.showInputDialog(null,
                    "Insira \n[1] Quantidade de pilotos \n[2] Quantidade de voltas \n[3] Quantidade de voltas válidas \nRespectvamente:");
            String[] valores = phrase.split(" ");

            a = Integer.parseInt(valores[0]);
            b = Integer.parseInt(valores[1]);
            c = Integer.parseInt(valores[2]);

            System.out.println(a + " " + b + " " + c);

            if (a > 0 && a < 40 && b > 0 && 0 < 1000 && c > 0 && c < b){
                vali = true;
            }
        } while (vali == false);

        String[] participantes = new String[a];
        String siglas[] = new String[a];
        for (int i = 0; i < participantes.length; i++){
            participantes[i] = JOptionPane.showInputDialog(null, "Insira o nome do participante [" + (i + 1)+ "]: " );
            siglas[i] = participantes[i].substring(0, 3).toUpperCase();
            System.out.println(siglas[i]);
        }
    }
}
