package serviceForWizard.rule;
/*
    Job :-
        check validations for red balls
*/

import serviceForWizard.Ball;
import serviceForWizard.Balls;
import serviceForWizard.Color;

public class RedBallRule implements Rule {

    @Override
    public boolean canAdd(Balls balls, Ball ballToAdd){
        return ((ballToAdd.isOfColor(Color.RED)) && (balls.numberOfBalls(Color.RED) < (balls.numberOfBalls(Color.GREEN) * 2) - 1));
    }
}
