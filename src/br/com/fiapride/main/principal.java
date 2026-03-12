package br.com.fiapride.main;
import br.com.fiapride.model.veiculos;

public class principal {
    public static void main(String[] args) {
        veiculos v1 = new veiculos();
        v1.setIndividuo("Carlos");
        v1.setGas(-10);
        v1.setPl("ABC-1234");
        v1.adicionar(50);
        v1.gasta(100);
        System.out.println("Dono: "+ v1.getIndividuo()+"| Placa: "+ v1.getPl()+"| Gas olina: "+ v1.getGas());
    }
}
