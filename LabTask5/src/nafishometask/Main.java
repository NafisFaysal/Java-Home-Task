package nafishometask;

public class Main {

    public static void main(String[] args){
        QuadraticEquation QR = new QuadraticEquation(1,-5,6);

        System.out.println(QR.getDiscriminant());

        if(QR.getDiscriminant()>=0)
            System.out.println("Roots are:  "+QR.getRoot1()+" and "+QR.getRoot2());
        else
            System.out.println("No roots! ");
    }
}
