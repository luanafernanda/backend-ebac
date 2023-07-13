package br.com.luanaf;

public abstract class Carro {
    protected String modelo;
    protected String marca;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public abstract void montadora();
}
