import java.util.Scanner;

public class ValorNumerico {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    System.out.print("Digite um valor númerico: ");
    int valorPrimitivo = console.nextInt();

    Integer valorWrapper = Integer.valueOf(valorPrimitivo);
    System.out.println("Valor númerico em wrapper: " + valorWrapper);
  }
}
