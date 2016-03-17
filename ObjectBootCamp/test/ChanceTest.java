import chance.Chance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {
    @Test
    public void chanceOfGettingTailsShouldBe0Point5WhenOnlyOneCoinIsFlipped() throws Exception {
        Chance chance = new Chance(2, 1);
        assertEquals(0.5, chance.getProbabilityOfTail(), 0);
    }
    @Test
    public void chanceOfNotGettingTailsShouldBe0Point5WhenOnlyOneCoinIsFlipped() throws Exception {
        Chance chance = new Chance(2, 1);
        assertEquals(0.5, chance.getProbabilityOfNotTail(), 0);
    }
    @Test
    public void chanceOfGettingTailsShouldBe0Point25WhenTwoCoinsAreFlipped() throws Exception {
        Chance chance = new Chance(2, 2);
        assertEquals(0.25, chance.getProbabilityOfTail(), 0);
    }
    @Test
    public void chanceOfNotGettingTailsShouldBe0Point75WhenTwoCoinsAreFlipped() throws Exception {
        Chance chance = new Chance(2, 2);
        assertEquals(0.75, chance.getProbabilityOfNotTail(), 0);
    }
    @Test
    public void chanceOfGettingAtleastOneTailsShouldBe0Point75WhenTwoCoinsAreFlipped() throws Exception {
        Chance chance = new Chance(2, 2);
        assertEquals(0.75, chance.getProbabilityOfAtleastOneTail(), 0);
    }
}
