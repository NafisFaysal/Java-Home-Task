package nafishometask;

/**
 * Created by nafis on 12/10/16.
 */
public class CricketPlayer extends Player implements Comparable<CricketPlayer> {
    private int runs;


    public CricketPlayer(String name, String country, double ranking, int runs) {
        super(name, country, ranking);
        this.runs = runs;
    }

    public int getRuns() {

        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int compareTo(CricketPlayer o) {
        return Integer.compare(this.getRuns(),o.getRuns());
    }
}
