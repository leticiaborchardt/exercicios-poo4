package exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * 5. Crie uma classe BankAccount com atributos accountNumber, accountHolder e balance.
 * Crie uma classe Bank com uma lista estática de contas bancárias e métodos estáticos
 * para abrir uma conta, fechar uma conta, depositar, sacar e transferir dinheiro entre contas.
 */
public class Bank {
    public static List<BankAccount> bankAccounts = new ArrayList<>();

    public static void oppenAccount() {
        System.out.println("--------Abrir nova conta--------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        int accountNumber = sc.nextInt();

        System.out.println("Informe o nome do titular conta:");
        String accountHolder = sc.next();

        System.out.println("Informe o saldo inicial da conta:");
        double initialBalance = sc.nextDouble();

        bankAccounts.add(new BankAccount(accountNumber, accountHolder, initialBalance));
        System.out.println("Sua conta foi aberta com sucesso!");
    }

    public static void closeAccount() {
        System.out.println("--------Fechar conta--------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número da conta para fechar:");
        int accountNumber = sc.nextInt();

        try {
            bankAccounts.remove(findAccountByNumber(accountNumber));

            System.out.println("Conta fechada com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deposit(double value, int accountNumber) {
        try {
            BankAccount account = findAccountByNumber(accountNumber);

            account.setBalance(account.getBalance() + value);
            System.out.println("Depósito feito com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double value, int accountNumber) {
        try {
            BankAccount account = findAccountByNumber(accountNumber);
            account.decreaseBalance(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void transfer(double value, int originAccountNumber, int destinyAccountNumber) {
        try {
            BankAccount originAccount = findAccountByNumber(originAccountNumber);
            originAccount.decreaseBalance(value);

            deposit(value, destinyAccountNumber);

            System.out.println("Transferência feita com sucesso!");
        } catch (Exception e) {
            System.out.println("Não foi possível fazer a transferência: " + e.getMessage());
        }
    }

    public static void listAccounts() {
        System.out.println("--------Contas cadastradas--------");

        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
            System.out.println("\n");
        }
    }

    private static BankAccount findAccountByNumber(int accountNumber) throws Exception {
        return bankAccounts.stream()
                .filter(a -> a.getAccountNumber() == accountNumber)
                .findFirst()
                .orElseThrow(() -> new Exception("Conta não encontrada!"));
    }
}
