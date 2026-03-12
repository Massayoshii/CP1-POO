package br.com.fiapride.model;

public class Veiculos {
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
        if(gas >= 0){
            this.gas = gas;
        }else{
            System.out.println("Erro no sistema:Tentativa de definir gas negativo bloqueada!");
        }
    }
    public void adicionarGasolina(int valor){
        if(valor >= 0){
            gas = gas + valor;
        }else{
            System.out.println("Erro no sistema,coloque um valor positivo");
        }
    }
    public void gastarGasolina(int valor){
        if(valor >= 0){
            gas = gas - valor;
        }else {
            System.out.println("Erro no sistema,coloque um valor positivo");
        }

    }
}
