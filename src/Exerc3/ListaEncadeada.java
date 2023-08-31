package Exerc3;

public class ListaEncadeada {
    private Node cabeca;
    private int tamanho;

    public ListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void push(Node node) {
        if (cabeca == null) {
            cabeca = node;
        } else {
            Node atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = node;
        }
        tamanho++;
    }

    public Node pop() {
        if (cabeca == null) {
            throw new RuntimeException("A lista está vazia!");
        }
        Node atual = cabeca;
        Node anterior = null;
        while (atual.proximo != null) {
            anterior = atual;
            atual = atual.proximo;
        }
        if (anterior != null) {
            anterior.proximo = null;
        } else {
            cabeca = null;
        }
        tamanho--;
        return atual;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista!");
        }
        if (index == 0) {
            node.proximo = cabeca;
            cabeca = node;
        } else {
            Node atual = cabeca;
            for (int i = 1; i < index; i++) {
                atual = atual.proximo;
            }
            node.proximo = atual.proximo;
            atual.proximo = node;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista!");
        }
        if (index == 0) {
            cabeca = cabeca.proximo;
        } else {
            Node atual = cabeca;
            for (int i = 1; i < index; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
        }
        tamanho--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista!");
        }
        Node atual = cabeca;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print(atual + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}

