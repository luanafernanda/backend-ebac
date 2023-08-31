package Exerc2;

public class Fila {
    private No frente;
    private No tras;
    private int tamanho;

    public Fila() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    public void enqueue(int valor) {
        No novoNo = new No(valor);
        if (this.tras == null) {
            this.frente = this.tras = novoNo;
            return;
        }
        this.tras.proximo = novoNo;
        this.tras = novoNo;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!");
        }
        int valor = this.frente.valor;
        this.frente = this.frente.proximo;
        if (this.frente == null) {
            this.tras = null;
        }
        tamanho--;
        return valor;
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!");
        }
        return this.frente.valor;
    }

    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!");
        }
        return this.tras.valor;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return this.frente == null;
    }
}
