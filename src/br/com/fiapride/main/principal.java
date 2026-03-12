package br.com.fiapride.main;
import br.com.fiapride.model.veiculos;

public class principal {
    public static void main(String[] args) {
        veiculos veiculos1 = new veiculos();
        veiculos1.setIndividuo("Carlos");
        veiculos1.setGas(-10);
        veiculos1.setPlaca("ABC-1234");
        veiculos1.adicionar(50);
        veiculos1.gasta(100);
        System.out.println("Dono: "+ veiculos1.getIndividuo()+"| Placa: "+ veiculos1.getPlaca()+"| Gas olina: "+ veiculos1.getGas());
    }
}
