/**
 * Created by nafis on 12/10/16.
 */
public class SavingAccount extends BankAccount {
        private double interestAmount;

        public SavingAccount(String customerName, String acc, double inAmount){
            super(customerName,acc);
            this.interestAmount = inAmount;
            balance = balance+inAmount;

        }

        public void setInterestAmount(double interestAmount) {
            this.interestAmount = interestAmount;
        }

        public double getInterestAmount() {

            return interestAmount;
        }

        public String toString(){
            return "\nInterest amount: "+interestAmount;
        }
}
