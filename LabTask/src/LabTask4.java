/**
 * Created by nafis on 09/10/16.
 */
public class LabTask4 {
    public static void main(String[] args){
        int[] arr = new int[10];
        int i,j;
        for(i=0;i<10;i++){
            arr[i]= (int)(10+Math.random()*(20-10+1));
            System.out.println(arr[i]);
        }

        deviation(arr);


    }
    public static void deviation(int[] a){
        int i,j=0,n;
        float sum=0,result;
        for(i=0;i<10;i++){
            j=j+a[i];
        }
        n=i+1;
        j=j/n;

        for(i=0;i<10;i++){
            sum=sum+(float)Math.pow((a[i]-j),2);
        }
        sum=sum/(n-1);
        result = (float) Math.sqrt(sum);
        System.out.println("Result: "+result);
    }
}
