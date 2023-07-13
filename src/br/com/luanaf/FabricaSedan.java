package br.com.luanaf;

public class FabricaSedan implements FabricaCarros {

    @Override
    public Carro criarCarro() {
        return new Sedan("Marca Sedan", "Modelo Sedan");
    }
}
