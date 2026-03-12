package br.com.fiapride.main;
import br.com.fiapride.model.Veiculos;

public class Principal {
    public static void main(String[] args) {
        Veiculos veiculo1 = new Veiculos();
        System.out.println("Iniciando Sistema de Cadastro de Carro:");
        veiculo1.setIndividuo("Carlos");
        veiculo1.setGas(0);
        veiculo1.setPlaca("ABC-1234");

        veiculo1.adicionarGasolina(100);
        veiculo1.gastarGasolina(50);

        System.out.println("Dono: "+ veiculo1.getIndividuo());
        System.out.println("Placa: "+ veiculo1.getPlaca());
        System.out.println("Gasolina: "+ veiculo1.getGas());
    }
}
