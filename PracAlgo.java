import java.util.Scanner;
/**
 * Created by nafis on 10/9/16.
 */
public class Algoclass1{
    public static void main(String[ ] args){
        int Roll[] = new int [5];
        //String S[] = new String[5];
        for(int i =0; i <5;i++){
            System.out.println("Enter Roll [" +i+ "]: ");
            Scanner input = new Scanner(System.in);
            //S[i] = input.nextLine();
            Roll[i] = input.nextInt();
        }

        System.out.print("\nGiven List  of Roll is: ");
        for(int i =0;i<=4;i++){
            System.out.print(" "+Roll[i]+"  ");

        }
        System.out.print("\nSorted List of Roll is: ");
          for(int i =0;i<5;i++){
              for(int j= i;j<5;j++){
                  if(Roll[i] > Roll[j]){
                      int temp = Roll[i];
                      Roll[i] = Roll[j];
                      Roll[j] = temp;
                  }
              }
          }
          for(int i= 0;i<=4;i++){
              System.out.println(" "+Roll[i]+ "  ");
          }
    }
}
