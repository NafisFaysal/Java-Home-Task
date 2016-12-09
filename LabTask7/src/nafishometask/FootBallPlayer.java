package nafishometask;

/**
 * Created by nafis on 12/10/16.
 */
public class FootBallPlayer extends Player implements Comparable<FootBallPlayer> {
    private int goals;

    public FootBallPlayer(String name, String country, double ranking, int goals) {
        super(name, country, ranking);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public int compareTo(FootBallPlayer o2) {

        return Integer.compare(this.getGoals(),o2.getGoals());
    }
}
