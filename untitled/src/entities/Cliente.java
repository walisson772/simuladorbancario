package entities;

public class Cliente extends Conta{

    private String name;
    private Integer cpf;
    private Integer senha;

    public Cliente(){
        super();
    }

    public Cliente(Double saldo, Double credito, String name, Integer cpf, Integer senha){
        super(saldo, credito);
        this.name = name;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCpf(){
        return cpf;
    }

    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public void deposito(Double valor){
        setSaldo(valor);
    }

    public Double saque(Double valor){
        return getSaldo() - valor;
    }

    public void opPricipal(){
        System.out.println("1 - Criar uma conta");
        System.out.println("2 - Realizar um saque");
        System.out.println("3 - Realizar um deposito");
        System.out.println("4 - Sair");
        System.out.print("O que deseja fazer? ");
    }
}
