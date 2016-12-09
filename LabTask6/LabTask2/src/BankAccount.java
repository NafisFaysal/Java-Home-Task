/**
 * Created by nafis on 12/10/16.
 */
public class BankAccount {
    protected static double balance;
    private String customerName;
    private String accountNo;

    public BankAccount(){

    }
    public BankAccount(String customerName, String acc){
        this.accountNo=acc;
        this.customerName=customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNo() {
        return accountNo;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void deposit(double amount){
        System.out.println(amount+" has been added to your total credit!");
        balance = balance+amount;
        System.out.println("Your current balance is: "+balance);
    }
    public void withdraw(double amount){
        if(amount>=500) {
            System.out.println(amount + " has been withdrawn from your total credit!");
            balance = balance - amount;
        }else
            System.out.println("Amount is too low to withdraw! ");
        System.out.println("Your current balance is: "+balance);
    }

    public String toString(){
        return "Name: "+customerName+"\nAccount no: "+accountNo;
    }
}