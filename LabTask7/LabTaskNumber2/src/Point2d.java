/**
 * Created by nafis on 12/10/16.
 */
public class Point2d implements Movable {
    protected double x;
    protected double y;
    protected double xSpeed;
    protected double ySpeed;

    public Point2d(){

    }

    public Point2d(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double getX() {

        return x;
    }

    public double getY() {
        return y;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public String calculateDistanceFromCenter(){
        return "Distance: "+Math.sqrt((x*x)+(y*y));
    }


    public void moveUp() {
        y=y+ySpeed;
    }

    public void moveDown() {
        y=y-ySpeed;
    }

    public void moveLeft() {
        x=x-xSpeed;
    }

    public void moveRight() {
        x=x+xSpeed;
    }

    public String toString(){
        return "The Current Position is:\nx Coordinate "+x+"\ny Coordinate "+y;
    }
}