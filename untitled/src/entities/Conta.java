package entities;

public class Conta {

    private Integer numeroConta;
    private Double saldo;
    private Double credito;

    public Conta(){
    }

    public Conta(Integer numeroConta, Double saldo, Double credito){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.credito = credito;
    }

    public Integer getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta){
        this.numeroConta = numeroConta;
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
