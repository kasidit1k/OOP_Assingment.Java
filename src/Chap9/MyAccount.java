package Chap9;

public class MyAccount {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(654295001, "Kasidit", 0);

        ba.printDetails();

        ba.deposit(5000); // ฝาก
        System.out.println("---------------------------------------");
        ba.printDetails();

        ba.withdraw(200); // ถอน

        ba.printDetails();

        System.out.println("=========== SavingAccount ===========");
        // SavingAccount
        SavingAccount sa = SavingAccount.createSV(654295001, "Kasdit", 100);
        if (sa != null) {
            sa.printDetails();

            sa.deposit(200); //ฝาก
            System.out.println("---------------------------------------");
            sa.printDetails();

            sa.withdraw(1000);
            System.out.println("---------------------------------------");

            sa.printDetails();

        }

        System.out.println("========= FixedDepositAccount =========");

        // FixedDepositAccount
        FixedDepositAccount fa = FixedDepositAccount.createSV(654295001, "Kasidit", 500);
        if (fa != null) {
            fa.printDetails();

            fa.deposit(400); // ฝาก
            System.out.println("---------------------------------------");
            fa.printDetails();

            fa.withdraw(500); // ถอน
            System.out.println("---------------------------------------");

            fa.printDetails();

        }
    }
}
