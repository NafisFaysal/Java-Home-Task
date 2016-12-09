/**
 * Created by nafis on 12/10/16.
 */
public class Point3d extends Point2d{
    protected double z;
    protected double zSpeed;

    public Point3d(double x, double y, double xSpd, double ySpd, double z, double zSpd){
        super(x,y,xSpd,ySpd);
        this.z=z;
        this.zSpeed=zSpd;
    }

    public String calculateDistanceFromCenter(){
        return "Distance : "+Math.sqrt((x*x)+(y*y)+(z*z));
    }

    public void moveZDown(){
        z=z-zSpeed;
    }
    public void moveZUp(){
        z=z+zSpeed;
    }


    public String toString(){
        return super.toString()+"\n Z Coordinate: "+z;
    }
}