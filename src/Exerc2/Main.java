package Exerc2;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Frente da fila: " + fila.front());
        System.out.println("Traseira da fila: " + fila.rear());

        System.out.println("Valor removido: " + fila.dequeue());
        System.out.println("Frente da fila após remover: " + fila.front());

        System.out.println("Tamanho da fila: " + fila.size());
    }
}
