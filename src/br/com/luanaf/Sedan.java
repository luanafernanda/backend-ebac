package br.com.luanaf;

public class Sedan extends Carro {

    public Sedan(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void montadora() {
        System.out.println("Características do carro: " + marca + ", " + modelo);
    }
}
