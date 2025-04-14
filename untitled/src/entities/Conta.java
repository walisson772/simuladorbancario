package entities;

public class Conta {

    private Double saldo;
    private Double credito;

    public Conta(){
    }

    public Conta(Double saldo, Double credito){
        this.saldo = saldo;
        this.credito = credito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }
}
