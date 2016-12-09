package nafishometask;
import java.util.Scanner;
/**
 * Created by nafis on 09/10/16.
 */
public class LabTask3 {

    public static void main(String[] args){
        int[][] A = new int[250][250];
        int a,b,m,n,sum=0;
        Scanner mat = new Scanner(System.in);
        System.out.println("Give your (row & column Size): ");
        m=mat.nextInt();
        n=mat.nextInt();


        for(a=0;a<m;a++){
            for(b=0;b<n;b++)
            {
                System.out.println(" A "+(a+1)+(b+1)+" = ");
                A[a][b]=mat.nextInt();
            }
        }
        for(a=0;a<m;a++){
            if((a ==0)||(a==m-1)){
                for(b=0;b<n; b++){
                    sum=sum+A[a][b];
                }
            }
            else{
                sum=sum+A[a][0]+A[a][n-1];
            }
        }

        System.out.println("The sum of all boundary elements of the matrix:  "+sum);
    }
}
