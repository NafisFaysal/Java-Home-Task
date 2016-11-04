/**
 * Created by nafis on 11/4/16.
 */
public class PossibleBirthday {
    public static void main(String [] args){
        boolean [] used;
        int count;
        used = new boolean[365];
        count = 0;

        while (true){
            int birthday;
            birthday = (int)(Math.random()*365);
            count++;

            System.out.println("Person "+count+" has birthday "+birthday);
            System.out.println();

            if (used[birthday]){
                //this day was found before;it' a duplicate.we are done.
                break;
            }
            used[birthday] = true;
        }

        System.out.println();
        System.out.println("A duplicate birthday was found after "+count+ " tries");
    }
}
