package edu.renata.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        // Conta , Agencia, Nome, Saldo
        System.out.println("Digite o número da conta: ");
        int conta = entrada.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = entrada.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = entrada.nextDouble();
    

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " + 
        "sua agência é " + agencia +", conta "+conta+" e seu saldo R$ "+saldo+" já está disponível para saque!");
        
        entrada.close();
    }
}