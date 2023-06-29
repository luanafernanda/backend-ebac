public class Carro {
  //Propriedades
  private String marca;
  private String modelo;
  private int ano;
  private String cor;
  private boolean ligado;
  


  //Construtores
  public Carro(String marca, String modelo, int ano, String cor, boolean ligado) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
    this.ligado = false;
  }


  
  //Métodos
  public void ligar() {
    if (!ligado) {
      ligado = true;
      System.out.println("O carro está ligado");
    } else {
      System.out.println("O carro já está ligado"); 
    }
  }

  public void desligar() {
    if (ligado) {
      ligado = false;
      System.out.println("O carro está desligado");
    } else {
      System.out.println("O carro já está desligado");
    }
  }
}