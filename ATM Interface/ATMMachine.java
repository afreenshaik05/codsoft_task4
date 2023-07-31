public class ATMMachine {
    public static void main(String[] args) {
        BankAcc bankAcc = new BankAcc(20000.0); // Initializing the bank account with some initial balance
        ATM newatm = new ATM(bankAcc);
        newatm.run();
    }
}
