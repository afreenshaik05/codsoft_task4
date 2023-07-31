import java.util.Scanner;
public class ATM {
    private BankAcc bankAcc;
    private Scanner scanner;

    public ATM(BankAcc bankAcc) {
        this.bankAcc = bankAcc;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        int choice;
        do {
            displayOptions();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Machine!!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    private void displayOptions() {
        System.out.println("~~~~~~ ATM Menu ~~~~~~");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void withdraw() {
        System.out.print("Enter the amount you wish to withdraw: ");
        double amount = scanner.nextDouble();
        if (bankAcc.withdraw(amount)) {
            System.out.println("Withdrawal successful. Your Remaining balance: " + bankAcc.getBalance());
        } else {
            System.out.println("Insufficient balance or Invalid amount. Please Try again with proper amount.");
        }
    }

    private void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();
        bankAcc.deposit(amount);
        System.out.println("Deposit successful. The Current balance is " + " "+ bankAcc.getBalance());
    }

    private void checkBalance() {
        System.out.println("Current balance: " + bankAcc.getBalance());
    }
}