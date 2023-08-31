import com.fasterxml.jackson.databind.ObjectMapper;

public class Jacksons {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"nome\":\"Luana\"}";

        try {
            Pessoa pessoa = mapper.readValue(jsonString, Pessoa.class);
            System.out.println(pessoa.getNome());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Pessoa {
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
}
