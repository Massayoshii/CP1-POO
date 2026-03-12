package br.com.fiapride.main;
import br.com.fiapride.model.Veiculos;

public class Principal {
    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos();

        veiculo1.setIndividuo("Carlos");
        veiculo1.setGas(-10);
        veiculo1.setPlaca("ABC-1234");

        veiculo1.adicionar(50);
        veiculo1.gasta(100);

        System.out.println("Dono: "+ veiculo1.getIndividuo());
        System.out.println("Placa: "+ veiculo1.getPlaca());
        System.out.println("Gasolina: "+ veiculo1.getGas());
    }
}
