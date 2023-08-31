package Exerc3;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));

        lista.printList();  // 10 -> 20 -> 30 -> null

        lista.insert(1, new Node(15));
        lista.printList();  // 10 -> 15 -> 20 -> 30 -> null

        System.out.println("Elemento no índice 2: " + lista.elementAt(2));  // Deve imprimir 20

        lista.remove(1);
        lista.printList();  // 10 -> 20 -> 30 -> null

        System.out.println("Elemento removido: " + lista.pop());  // Deve imprimir 30
        lista.printList();  // 10 -> 20 -> null
    }
}
