class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Dados da Pessoa Jurídica:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}