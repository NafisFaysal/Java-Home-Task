package nafishometask;

public class Main {

    public static void main(String[] args){
        CricketPlayer cp1 = new CricketPlayer("Sakib AL Hasan","Bangladesh",5.00,4000);
        CricketPlayer cp2 = new CricketPlayer("Masrafi","Bangladesh",5.00,1000);

        FootBallPlayer fp1 = new FootBallPlayer("Sabbir","Bangladesh",5.00,59);
        FootBallPlayer fp2 = new FootBallPlayer("Tamim","Bangladesh",4.00,342);


        System.out.println(cp1.toString()+"\n\n"+cp2.toString()+"\n");

        if(cp1.compareTo(cp2)==1)
            System.out.println(cp1.getName()+" has more runs!");
        else if(cp1.compareTo(cp2)==-1)
            System.out.println(cp2.getName()+" has more runs!");
        else
            System.out.println("Both have same runs! ");
        System.out.println("\n\n");


        System.out.println(fp1.toString()+"\n\n"+fp2.toString()+"\n");


        if(fp1.compareTo(fp2)==1)
            System.out.println(fp1.getName()+" Scored more!");
        else if(fp1.compareTo(fp2)==-1)
            System.out.println(fp2.getName()+" Scored more!");
        else
            System.out.println("Both scored the same");


    }
}
