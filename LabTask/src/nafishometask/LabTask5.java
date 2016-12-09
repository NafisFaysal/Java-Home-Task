package nafishometask;
import java.util.Scanner;
/**
 * Created by nafis on 09/10/16.
 */
public class LabTask5 {
    public static void main(String[] args){
        int n,i;
        int[] arr = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        n = input.nextInt();
        arr=fibonacci(n);
        System.out.print("First 8 Fibonacci Number: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] fibonacci(int n){
        int[] a = new int[10];
        int i;
        a[0]=0;
        a[1]=1;
        for(i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a;
    }

}
