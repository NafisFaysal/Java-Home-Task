import java.util.Scanner;

public class anothertes {
    public static void  main(String[] args){
        int array[] = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Give the interger Element: ");
        for (int i =0;i<array.length;i++){
            array[i] = input.nextInt();
        }

        System.out.println(getMax(array));
    }

public static int getMax(int [] inputArray){
    int maxValue = inputArray[0];
    for (int i =1;i<inputArray.length;i++){
        if(inputArray[i] >maxValue){
            maxValue = inputArray[i];
        }
    }
    return maxValue;
}

    public static int getMin(int [] inputArray){
        int minValue = inputArray[0];
        for (int i =1;i<inputArray.length;i++){
            if(inputArray[i]<minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

}
