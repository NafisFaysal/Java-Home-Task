/**
 * Created by nafis on 12/10/16.
 */
public class Main {
    public static  void  main(String [] args){
    BankAccount a1 = new BankAccount("Person1","najkd3213");
    SavingAccount b1 = new SavingAccount("Person2","aad3223323",90000.00);
    Account C1 = new Account("Person1","najkd3213",150,1000);

        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(C1.toString()+"  ");

        a1.withdraw(400);
        b1.deposit(2000);
        C1.withdraw(750);
    }

}
