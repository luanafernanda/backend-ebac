import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Jeep("Wrangler"));
        carros.add(new Saveiro("Cross"));
        carros.add(new Civic("SI"));

        for (Carro carro : carros) {
            System.out.println(carro.descricao());
        }
    }
}
