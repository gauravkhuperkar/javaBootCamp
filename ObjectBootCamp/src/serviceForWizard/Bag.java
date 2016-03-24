/*
    Job :-
        add and holds balls
*/
package serviceForWizard;

import serviceForWizard.exceptions.BagFullException;
import serviceForWizard.rule.Rule;
import serviceForWizard.rule.Rules;

public class Bag {
    private Rules rules;
    private Balls balls;
    private final int capacity;
    private Summary summary = new Summary();


    public Bag(int capacity, Balls balls, Rules rules) {
        this.capacity = capacity;
        this.balls = balls;
        this.rules = rules;
    }

    public int size() {
        return balls.size();
    }

    public boolean add(Ball ball) throws BagFullException {
        if(isFull())
            throw new BagFullException();
        for (Rule rule : rules) {
            if(rule.canAdd(balls, ball)) {
                summary.update(ball);
                return balls.add(ball);
            }
        }
        return false;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public boolean isSameSummary(Summary otherSummary){
        return summary.equals(otherSummary);
    }

    public String toText(){
        return summary.sequenceSummary();
    };
}
