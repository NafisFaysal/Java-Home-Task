package nafishometask;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        EmployeeRegular c1 = new EmployeeRegular ("Person1","Dhaka", 50, 320000, 2000,200);
        EmployeesHour d1 = new EmployeesHour("Person2","Dhaka", 32, 8,12200);


        System.out.println(c1.toString());
        System.out.println("");
        System.out.println("");
        System.out.println(d1.toString());
    }
}
