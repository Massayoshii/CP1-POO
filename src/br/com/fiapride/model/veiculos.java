package br.com.fiapride.model;

public class veiculos {
    private String individuo;
    private String placa;
    private int gas;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
    public void adicionar(int valor){
        gas = gas + valor;
    }
    public void gasta(int valor){
        gas = gas - valor;
    }
}
