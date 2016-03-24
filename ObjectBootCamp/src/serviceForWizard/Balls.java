package serviceForWizard;
/*
    Job :-
        holds collection of balls and give state information
*/

import java.util.ArrayList;

public class Balls{
    private final ArrayList<Ball> balls;

    public Balls() {
        this.balls = new ArrayList<>();
    }

    public int size(){
        return this.balls.size();
    }

    public boolean add(Ball ball) {
        return balls.add(ball);
    }

    public int numberOfBalls(Color color) {
        int count = 0;
        for (Ball ball: balls) {
            if(ball.isOfColor(color))
                count++;
        }
        return count;
    }
}