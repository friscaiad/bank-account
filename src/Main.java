public class Main {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount myAccount = new BankAccount(
                "123456",
                1000.0,
                "John Doe",
                "john.doe@example.com",
                "123-456-7890");

        // Menampilkan informasi awal
        System.out.println("Initial balance: $" + myAccount.getBalance());

        // Melakukan deposit
        myAccount.deposit(500.0);

        // Melakukan withdraw
        myAccount.withdraw(200.0);

        // Melakukan withdraw dengan saldo tidak mencukupi
        myAccount.withdraw(1500.0);

        // Menampilkan informasi akhir
        System.out.println("Final balance: $" + myAccount.getBalance());
    }
}