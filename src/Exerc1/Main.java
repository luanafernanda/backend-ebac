package Exerc1;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(5);
        pilha.push(10);
        pilha.push(15);

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("Valor removido: " + pilha.pop());
        System.out.println("Topo da pilha após remover: " + pilha.top());
        System.out.println("Tamanho da pilha após remover: " + pilha.size());
    }
}

