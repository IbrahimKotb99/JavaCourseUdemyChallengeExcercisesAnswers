public class Main {


    public static void main(String[] args) {


        BankAccount bank = new BankAccount();

        BankAccount bank1 = new BankAccount(1234, 2500,"hima");

        System.out.println(bank.getCustomerName());

        bank.setAccountBalance(200);

        System.out.println(bank.getAccountBalance());

        bank.depositing(200);

        bank.withdrawing(300);




    }
}
