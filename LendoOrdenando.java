//DEUS seja louvado!

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @apiNote_Vinícius_Pelizzari
 */
public class LendoOrdenando {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        lendoOrdenando(scanner);
    }

    private static void lendoOrdenando(Scanner scanner) {
        System.out.println("Digite os nomes para a lista: ");
        Set<String> lista = new TreeSet<>();

        while (scanner.hasNext()) {
            String nome = scanner.next();
            // lista.add(nome);

            if (nome.equals("ok")) {
                // System.out.println(nome);
                break;
            }
            lista.add(nome);
        }
        System.out.println(lista);
    }
}
