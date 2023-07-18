

public class ExemploTabela {

    public static void main(String[] args) {
        Class<Carro> classeCarro = Carro.class;

        if (classeCarro.isAnnotationPresent(Tabela.class)) {
            Tabela annotationTabela = classeCarro.getAnnotation(Tabela.class);
            String nomeTabela = annotationTabela.value();
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A classe Carro não possui a annotation @Tabela.");
        }
    }
}
