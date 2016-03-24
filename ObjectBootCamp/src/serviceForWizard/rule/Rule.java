package serviceForWizard.rule;

import serviceForWizard.Ball;
import serviceForWizard.Balls;

public interface Rule {
    boolean canAdd(Balls balls, Ball ballToAdd);
}
