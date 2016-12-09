package nafishometask;

import java.util.Scanner;

/**
 * Created by nafis on 09/10/16.
 */
public class LabTask1 {
    public static void main(String[] args) {
        int [] n = new int[100];
        int a,b;
        boolean l;
        Scanner len = new Scanner(System.in);
        System.out.println("Length of the Matrix: ");
        b = len.nextInt();
        for(a=0;a<b;a++){
            System.out.println("Matx "+(a+1)+" element ");
            n[a]=len.nextInt();
        }
        l=check(n,b);
        if(l)
            System.out.println("Found 3 Consecutive integers ");
        else
            System.out.println("No Consecutive integers found ");


    }

    public static boolean check(int arr[], int a){
        int i;
        for(i=0;i<a;i++){
            if((arr[i]==arr[i+1]) && (arr[i]==arr[i+2]))
                return true;
        }

        return false;
    }
}
