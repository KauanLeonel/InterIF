package Exercicios.ArrayList;
import java.util.ArrayList;

public class Exemplo {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Adicionando em posição específica
        frutas.add(1, "Abacaxi"); // Abacaxi na posição 1

        // Acessando elementos
        System.out.println("Fruta na posição 0: " + frutas.get(0));

        // Alterando um elemento
        frutas.set(2, "Pera"); // Substitui "Banana" por "Pera"

        // Verificando se contém
        if (frutas.contains("Laranja")) {
            System.out.println("Tem Laranja na lista.");
        }

        // Mostrando tamanho da lista
        System.out.println("Total de frutas: " + frutas.size());

        // Removendo
        frutas.remove("Pera");  // Remove pelo nome
        frutas.remove(0);       // Remove pelo índice

        // Imprimindo a lista
        System.out.println("Frutas restantes: " + frutas);
    }
}
