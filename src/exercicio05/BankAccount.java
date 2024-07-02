package exercicio05;

/**
 * 5. Crie uma classe BankAccount com atributos accountNumber, accountHolder e balance.
 * Crie uma classe Bank com uma lista estática de contas bancárias e métodos estáticos
 * para abrir uma conta, fechar uma conta, depositar, sacar e transferir dinheiro entre contas.
 */
public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount() {}

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\nConta:" +
                "\nNúmero: " + this.getAccountNumber() +
                "\nTitular: " + this.getAccountHolder() +
                "\nSaldo: " + this.getBalance();
    }

    public void decreaseBalance(double value) throws Exception {
        if (this.getBalance() >= value) {
            this.setBalance(this.getBalance() - value);
        } else {
            throw new Exception("Saldo insuficiente!");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
