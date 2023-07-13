package br.com.luanaf;

public class FabricaSUV implements FabricaCarros{

    @Override
    public Carro criarCarro() {
        return new SUV("Modelo SUV", "Marca SUV");
    }

}
