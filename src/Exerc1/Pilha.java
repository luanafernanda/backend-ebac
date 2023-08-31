package Exerc1;

public class Pilha {

    private No topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }

        int valorRemovido = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valorRemovido;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }

        return topo.valor;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return tamanho;
    }
}
