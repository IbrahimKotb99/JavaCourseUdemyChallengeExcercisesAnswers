public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String Email;
    private int phoneNo;

    public BankAccount(){
        this(1232, 3700, "dangerawy");
        System.out.println("hi this is the first constructor ");

    }
    public BankAccount(int accountNumber, int accountBalance, String customerName){

        System.out.println("and this is the sec constructor ");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;

    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getAccountBalance(){
        return accountBalance;
    }
    public String getEmail(){
        return Email;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountBalance(int accountBalance){
        this.accountBalance=accountBalance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    public void depositing(int depositedNo){
        accountBalance=accountBalance+depositedNo;
        System.out.println("dep of "  + depositedNo + " is done and your acc now is " + accountBalance);
    }
    public void withdrawing(int withdrawedNo){
        if (withdrawedNo>accountBalance){
            System.out.println("there is no enough money in your balance ");
        }else {
            accountBalance=accountBalance-withdrawedNo;
            System.out.println("your account balance after withdrawing " + withdrawedNo + " is " + accountBalance);
        }
    }
}
