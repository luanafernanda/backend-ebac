import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparacaoPorGenero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (f - feminino, m - masculino): ");
            String sexo = leitor.nextLine();

            if (sexo.equalsIgnoreCase("f")) {
                nomesFemininos.add(nome);
            } else if (sexo.equalsIgnoreCase("m")) {
                nomesMasculinos.add(nome);
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
            }
        }

        System.out.println("Nomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("Nomes masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }
    }
}
