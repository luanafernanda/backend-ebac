import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();

        Scanner leitor  = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (F - feminino, M - masculino): ");
            String sexo = leitor.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else {
                System.out.println("Sexo inválido! Por favor, digite F ou M.");
            }
        }

        System.out.println("Pessoas do grupo feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        System.out.println("Pessoas do grupo masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
    }
}
