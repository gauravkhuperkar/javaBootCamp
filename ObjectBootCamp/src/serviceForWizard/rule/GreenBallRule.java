package serviceForWizard.rule;
/*
    Job :-
        Should give green ball's validation 
*/

import serviceForWizard.Ball;
import serviceForWizard.Balls;
import serviceForWizard.Color;

public class GreenBallRule implements Rule {
    private final int MAX_NUMBER_OF_BALLS = 3;

    @Override
    public boolean canAdd(Balls balls, Ball ballToAdd) {
        return (ballToAdd.isOfColor(Color.GREEN) && (balls.numberOfBalls(Color.GREEN) <= MAX_NUMBER_OF_BALLS));
    }
}