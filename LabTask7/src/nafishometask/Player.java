package nafishometask;

/**
 * Created by nafis on 12/10/16.
 */
public class Player {

    protected String name;
    protected String country;
    protected double ranking;

    public Player(){

    }

    public Player(String name, String country, double ranking) {
        this.name = name;
        this.country = country;
        this.ranking = ranking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public String getName() {

        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getRanking() {
        return ranking;
    }

    public String toString(){
        return "Name: "+name+"\nCountry: "+country+"\nRanking: "+ranking;
    }


}
