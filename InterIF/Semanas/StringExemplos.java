package Semanas;

public class StringExemplos {
    public static void main(String[] args) {
        //Uma String é inalterável, precisa criar outras variáveis
        String alfabeto = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        //CharAt
        char letraA = alfabeto.charAt(0); //Ele usa o código ascci
        char letraZ = alfabeto.charAt(25);
        //SubString
        String metade = alfabeto.substring(alfabeto.length()/2); //Pega metade da String para frente ("nOpQrStUvWxYz")
        String primeiraMetade = alfabeto.substring(0, alfabeto.length()/2); //Pega a primeira metade ("AbCdEfGhIjKlM")
        //toLowerCase
        String diminuto = alfabeto.toLowerCase(); //Transforma tudo em minúsculo
        String aumentado = alfabeto.toUpperCase(); // Transforma tudo em maíusculo

        //SPLIT
        String entrada = "10 20 30";
        String[] parte = entrada.split(" "); //Virou uma array onde [0] = 10, [1] = 20, [2] = 30, porém, elas ainda são String
        // ao invés de aspas com espaço vazio, pode-se usar "\\s+", ele irá cortar caso haja um, ou mais espaços.
        int a = Integer.parseInt(parte[0]); //10
        int b = Integer.parseInt(parte[1]); //20
        int c = Integer.parseInt(parte[2]); //30

        // alternativa mais robusta para múltiplos espaços: split("\\s+")
        String entradaComEspacosExtras = "40   50  60";
        String[] numeros = entradaComEspacosExtras.split("\\s+"); // ["40", "50", "60"]

    }
}
