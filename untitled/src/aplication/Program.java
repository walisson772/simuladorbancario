package aplication;

import entities.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Cliente cliente = new Cliente();
        List<Cliente> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            cliente.opPricipal();
            int escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.print("Informe seu cpf: ");
                    int cpf = sc.nextInt();
                    System.out.print("Informe seu nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Digite uma senha para acessar a sua conta: ");
                    int senha = sc.nextInt();
                    System.out.print("Deseja fazer um deposito inicial (s/n): ");
                    char depositoInicial = sc.next().charAt(0);
                    if (depositoInicial == 's'){
                        System.out.print("Qual valor deseja depositar: ");
                        double deposito = sc.nextDouble();
                        double credito = deposito * 1.10;
                        System.out.print("Valor adicionado a conta: "+String.format("%.2f", credito)+" Bonus de 10%");
                        System.out.println();
                        list.add(new Cliente(deposito, credito, nome, cpf, senha));
                    }
                    else {
                        list.add(new Cliente( 0.0, 0.0, nome, cpf, senha));
                    }
                    break;
                case 2:
                    System.out.print("Digite sua senha para acessar a sua conta: ");
                    int acesso = sc.nextInt();
                    Cliente result = list.stream().filter(x -> x.getSenha() == acesso).findFirst().orElse(null);
                    if (result == null){
                        System.out.println("Senha invalida");
                    }else {
                        System.out.println("Bem vindo sr "+result.getName());
                        System.out.println("Saldo disponivel: "+result.getSaldo());
                        System.out.print("Valor a ser sacado: ");
                        double saque = sc.nextDouble();
                        double saldo = result.getSaldo() - saque;
                        if (saldo <= 0){
                            System.out.println("Você sacou todo dinheiro disponivel.");
                            result.setSaldo(0.0);
                        }else{
                            result.setSaldo(saldo);
                            System.out.println("Saque realizado com sucesso.");
                            System.out.println("Valor ainda disponivel: "+result.getSaldo());
                        }
                    }
                    break;

                case 5:
                    sc.close();
                    break;
            }
        }

    }
}
