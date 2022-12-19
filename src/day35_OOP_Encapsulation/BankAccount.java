package day35_OOP_Encapsulation;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

public String getAccountHolder(){
    return accountHolder;
}

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
    return balance;
    }

    public void setAccountHolder(String accountHolder){
    if (!accountHolder.isBlank()) this.accountHolder=accountHolder;
    else return;
    }

    public void setAccountNumber(int accountNumber){
    if (accountNumber>0) this.accountNumber=accountNumber;
    else return;
    }

    public void deposit(double amount){
if (amount<=0) {
    System.out.println("deposit amount can not be zero or negative");
    System.exit(1);
}
        System.out.println("depositing "+amount+"$ to the account number "+accountNumber);
balance+=amount;
    }

    public void withdraw(double amount){
        if (amount<=0) {
            System.out.println("withdraw amount can not be zero or negative");
            System.exit(1);
        }
            else if (amount>balance){
                System.out.println("withdraw amount can not be more than your balance");
                System.exit(1);
            }
        System.out.println("Withdrawing "+amount+"$ from the account number "+accountNumber);
    balance-=amount;
    }

    public double checkBalance(){
    return balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        checkBalance();
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + getAccountHolder() + '\'' +
                ", accountNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                '}';
    }
}
