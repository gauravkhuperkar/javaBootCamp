package serviceForKingdom;
/*
    Job :-
        add and holds balls
*/


import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int totalCapacity = 12;
    private ArrayList<Ball> balls = new ArrayList<>(totalCapacity);
    private HashMap<String , Integer>counts;
    private HashMap<String, Integer> capacity;

    public Bag() {
        this.counts = new HashMap<>();
        counts.put(Color.RED.toText(),0);
        counts.put(Color.GREEN.toText(),0);
        counts.put(Color.BLUE.toText(),0);
    }

    public boolean add(Ball ball) {
        return isValid(ball);
    }

    private boolean isValid(Ball ball) {
        capacity = new HashMap<>();
        capacity.put(Color.GREEN.toText(),3);
        capacity.put(Color.RED.toText(),2*counts.get(Color.GREEN.toText()));
        int capacityForBlue = counts.get(Color.GREEN.toText())+counts.get(Color.RED.toText());
        capacity.put(Color.BLUE.toText(),(12 - capacityForBlue));
        String key = ball.getColor();
        if(capacity.get(key) > counts.get(key)){
            int count = counts.get(key);
            counts.replace(key,count+1);
            balls.add(ball);
            return true;
        }
        return false;
    }
}
