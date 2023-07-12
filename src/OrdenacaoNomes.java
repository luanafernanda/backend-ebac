import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoNomes {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String entrada = leitor.nextLine();

        String[] nomes = entrada.split(",");

        List<String> listaNomes = new ArrayList<>();

        for (String nome : nomes) {
            String nomeFormatado = nome.trim();
            listaNomes.add(nomeFormatado);
        }

        Collections.sort(listaNomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
