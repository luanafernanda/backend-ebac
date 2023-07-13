package br.com.luanaf;

public class SUV extends Carro {

    public SUV(String marca, String modelo) {
        super(modelo, marca);
    }

    @Override
    public void montadora(){
        System.out.println("Características do carro: " + marca + ", " + modelo);
    }
}
