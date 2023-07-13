package br.com.luanaf;


import br.com.luanaf.FabricaCarros;
import br.com.luanaf.FabricaSedan;
import br.com.luanaf.FabricaSUV;
import br.com.luanaf.Cliente;


public class Main {

    public static void main(String[] args) {
        FabricaCarros sedan = new FabricaSedan();
        FabricaCarros suv = new FabricaSUV();

        Cliente clienteSedan = new Cliente(sedan);
        Cliente clienteSUV = new Cliente(suv);

        clienteSedan.caracteristicasDoCarro();
        clienteSUV.caracteristicasDoCarro();
    }
}
