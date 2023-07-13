package br.com.luanaf;

public class Cliente {
    private FabricaCarros fabricaDeCarros;

    public Cliente(FabricaCarros fabricaDeCarros) {
        this.fabricaDeCarros = fabricaDeCarros;
    }

    public void caracteristicasDoCarro(){
        Carro carro = fabricaDeCarros.criarCarro();
        carro.montadora();
    }
}
