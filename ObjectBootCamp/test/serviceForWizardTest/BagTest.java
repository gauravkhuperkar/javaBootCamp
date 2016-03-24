package serviceForWizardTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import serviceForWizard.*;
import serviceForWizard.exceptions.BagFullException;
import serviceForWizard.rule.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BagTest {

    private Rules rules;
    private Balls balls;

    @Before
    public void setUp() throws Exception {
        rules = new Rules();
        rules.add(new GreenBallRule());
        rules.add(new RedBallRule());
        rules.add(new YellowBallRule());
        rules.add(new BlueBallRule());

        balls = new Balls();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void bag_can_add_one_green_ball_initially() throws BagFullException {
        Bag bag = new Bag(12, balls, rules);

        assertTrue(bag.add(new Ball(Color.GREEN)));
    }

    @Test
    public void bag_throws_exception_if_red_ball_try_to_add_even_there_is_no_green_ball_in_the_collection() throws BagFullException {
        Bag bag = new Bag(12, balls, rules);

        assertFalse(bag.add(new Ball(Color.RED)));
    }

    @Test
    public void bag_can_add_red_ball_only_when_there_is_at_least_one_green_ball() throws BagFullException {
        Bag bag = new Bag(12, balls, rules);
        bag.add(new Ball(Color.GREEN));
        bag.add(new Ball(Color.RED));

        assertEquals(2, bag.size());
    }



    @Test
    public void bag_can_add_40percent_yellow_balls() throws BagFullException {

        Bag bag = new Bag(12, balls, rules);
        Ball redBall = new Ball(Color.RED);
        Ball greenBall = new Ball(Color.GREEN);
        Ball yellowBall = new Ball(Color.YELLOW);

        bag.add(greenBall);
        bag.add(greenBall);
        bag.add(redBall);
        bag.add(redBall);
        bag.add(redBall);
        bag.add(yellowBall);
        bag.add(yellowBall);

        assertEquals(7, bag.size());
    }


    @Test
    public void bag_can_not_add__yellow_ball_initially() throws BagFullException {
        Bag bag = new Bag(2, balls, rules);

        assertFalse(bag.add(new Ball(Color.YELLOW)));
    }

    @Test
    public void bag_should_add_any_number_of_blue_balls() throws BagFullException {
        Bag bag = new Bag(3, balls, rules);
        Ball blueBall = new Ball(Color.BLUE);

        bag.add(blueBall);
        bag.add(blueBall);
        bag.add(blueBall);

        assertEquals(3, bag.size());
    }

    @Test
    public void bag_should_give_summary() throws BagFullException {
        Bag bag = new Bag(4,balls,rules);
        Ball greenBall = new Ball(Color.GREEN);
        Ball blueBall = new Ball(Color.BLUE);

        bag.add(blueBall);
        bag.add(greenBall);
        bag.add(blueBall);

        Summary summary = new Summary();
        summary.update(blueBall);
        summary.update(greenBall);
        summary.update(blueBall);

        assertTrue( bag.isSameSummary(summary));
    }
}