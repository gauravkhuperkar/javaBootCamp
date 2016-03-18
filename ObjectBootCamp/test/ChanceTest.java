import Exceptions.IllegalInputException;
import chance.Chance;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChanceTest {
    @Test
    public void chanceShouldAbleToCalculateNotOfItself() throws IllegalInputException {
        Chance chance = Chance.create(0.23);
        assertEquals(Chance.create(0.77), chance.not());
    }

    @Test
    public void chanceOfGettingTailsShouldBe0Point5WhenOnlyOneCoinIsFlipped() throws IllegalInputException {
        Chance chance = Chance.create(0.5);
//        Assert.assertEquals(chance.equals(chance));

    }

    //    chanceOfGettingTailsShouldBe0Point5WhenOnlyOneCoinIsFlipped
//    @Test
//    public void chanceOfNotGettingTailsShouldBe0Point5WhenOnlyOneCoinIsFlipped() throws IllegalInputException {
//        Chance chance = Chance.create(0.23);
//        assertEquals(0.5, chance.getProbabilityOfNotTail(), 0);
//    }
//    @Test
//    public void chanceOfGettingTailsShouldBe0Point25WhenTwoCoinsAreFlipped() throws IllegalInputException {
//        Chance chance = Chance.create(0.23);
//        assertEquals(0.25, chance.getProbabilityOfTail(), 0);
//    }
//    @Test
//    public void chanceOfNotGettingTailsShouldBe0Point75WhenTwoCoinsAreFlipped() throws IllegalInputException {
//        Chance chance = Chance.create(0.23);
//        assertEquals(0.75, chance.getProbabilityOfNotTail(), 0);
//    }
//    @Test
//    public void chanceOfGettingAtleastOneTailsShouldBe0Point75WhenTwoCoinsAreFlipped() throws IllegalInputException {
//        Chance chance = Chance.create(0.23);
//        assertEquals(0.75, chance.getProbabilityOfAtleastOneTail(), 0);
//    }
}
