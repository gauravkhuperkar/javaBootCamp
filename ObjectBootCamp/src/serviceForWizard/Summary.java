package serviceForWizard;
/*
    Job :-
        keep the log of balls
*/

import java.util.ArrayList;

public class Summary {

    private final ArrayList<Ball> ballsSummary;

    public Summary() {
        this.ballsSummary = new ArrayList<>();
    }

    public void update(Ball ball) {
        ballsSummary.add(ball);
    }

    public String sequenceSummary(){
        String summary = "";
        for (Ball ball : ballsSummary) {
            summary+=ball+"\n";
        }
        return summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Summary summary = (Summary) o;

        return ballsSummary != null ? ballsSummary.equals(summary.ballsSummary) : summary.ballsSummary == null;

    }

    @Override
    public int hashCode() {
        return ballsSummary != null ? ballsSummary.hashCode() : 0;
    }
}
