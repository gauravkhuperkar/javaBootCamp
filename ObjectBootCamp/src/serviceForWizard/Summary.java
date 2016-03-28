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
    
    @Override
    public boolean equals(Object ) {
        if (this == ) return true;
        if ( == null || getClass() != .getClass()) return false;

        Summary summary = (Summary) ;

        return ballsSummary != null ? ballsSummary.equals(summary.ballsSummary) : summary.ballsSummary == null;

    }
}
