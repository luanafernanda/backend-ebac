import java.util.Scanner;

public class CalculaMedia {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos fazer a média de 4 notas");
    System.out.print("Digite a 1º nota: ");
    int nota1 = scanner.nextInt();
    System.out.print("Digite a 2º nota: ");
    int nota2 = scanner.nextInt();
    System.out.print("Digite a 3º nota: ");
    int nota3 = scanner.nextInt();
    System.out.print("Digite a 4º nota: ");
    int nota4 = scanner.nextInt();


    int resultado = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("A média das 4 notas é: " + resultado);
    scanner.close();
  }
}