package entities;

public class Cliente extends Conta{

    private String name;
    private String cpf;

    public Cliente(){
        super();
    }

    public Cliente(Integer numeroConta, Double saldo, Double credito, String name, String cpf){
        super(numeroConta, saldo, credito);
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }


}
