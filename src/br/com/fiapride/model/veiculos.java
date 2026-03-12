package br.com.fiapride.model;

public class veiculos {
    private String individuo;
    private String pl;
    private int gas;

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
    public void adicionar(int v){
        gas = gas + v;
    }
    public void gasta(int v){
        gas = gas - v;
    }
}
