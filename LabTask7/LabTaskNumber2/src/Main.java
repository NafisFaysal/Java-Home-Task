/**
 * Created by nafis on 12/10/16.
 */
public class Main {
    public static void main(String[] args){
        Point2d a2d = new Point2d(8,3,4,2);
        Point3d a3d = new Point3d(9,6,4,2,1,6);


        System.out.println(a2d.toString());
        System.out.println(a3d.toString());

        a2d.moveUp();
        System.out.println(a2d.toString());

        a3d.moveZDown();
        System.out.println(a3d.toString());


        System.out.println(a2d.calculateDistanceFromCenter()+"\n"+a3d.calculateDistanceFromCenter());
    }
}
