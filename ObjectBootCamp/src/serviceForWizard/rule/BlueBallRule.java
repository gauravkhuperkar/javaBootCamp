package serviceForWizard.rule;/*
    Job :-
        cheeck validation for blue balls
*/

import serviceForWizard.Ball;
import serviceForWizard.Balls;
import serviceForWizard.Color;

public class BlueBallRule implements Rule {

    @Override
    public boolean canAdd(Balls balls, Ball ballToAdd) {
        return ballToAdd.isOfColor(Color.BLUE);
    }
}
