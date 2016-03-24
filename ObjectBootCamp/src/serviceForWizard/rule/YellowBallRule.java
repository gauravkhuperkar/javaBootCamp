package serviceForWizard.rule;

import serviceForWizard.Ball;
import serviceForWizard.Balls;
import serviceForWizard.Color;

public class YellowBallRule implements Rule{
    Double THRESHOLD = 0.4;
    @Override
    public boolean canAdd(Balls balls, Ball ballToAdd){
        return ((ballToAdd.isOfColor(Color.YELLOW)) && (balls.numberOfBalls(Color.YELLOW) < (balls.size() * (THRESHOLD))));
    }
}
