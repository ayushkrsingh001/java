public class BankAccount {
    private String name;
    private double balance;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Omkar", 5000);

        System.out.println(a.getName());
        System.out.println(a.getBalance());

        a.deposit(1500);
        System.out.println(a.getBalance());

        a.withdraw(2000);
        System.out.println(a.getBalance());

        a.withdraw(10000);
    }
}