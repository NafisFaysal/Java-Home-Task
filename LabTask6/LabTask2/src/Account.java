/**
 * Created by nafis on 12/10/16.
 */
public class Account extends BankAccount {
    private double serviceCharge;
    private double overdraftLimit;

    public Account(String customerName, String acc,double serviceCharge, double overdraftLimit){
        super(customerName,acc);
        this.serviceCharge = serviceCharge;
        this.overdraftLimit = overdraftLimit;
        balance = balance - serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount){
        if(amount<=balance+overdraftLimit) {
            System.out.println(amount + "Withdrawn from your total Credit!");
            balance = balance - amount;
            System.out.println("Your current balance : "+balance);
        }
        else
            System.out.println("Withdrawal was not successful! The amount exceeds the overdraft limit.");
    }

    public String toString(){
        return "\nService Charge: "+serviceCharge+"\nOver draft limit: "+overdraftLimit;
    }
}