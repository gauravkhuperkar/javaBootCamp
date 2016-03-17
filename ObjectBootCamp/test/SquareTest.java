import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.StringStartsWith.startsWith;

public class SquareTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea_should_calculte_area_of_a_square() throws Exception {
        Square square = Square.create(5);
        Assert.assertEquals(square.calculateArea(),25,0);
    }

    @Test
    public void calculatePerimiter_should_calculate_perimiter_of_a_square() throws Exception {
        Square square = Square.create(4);
        Assert.assertEquals(square.calculatePerimeter(),16,0);
    }
    @Test
    public void calculatePerimeter_should_throw_an_illegal_argument_exception_if_side_is_negative() throws Exception {
        thrown.expect(NonPositiveInputException.class);
        thrown.expectMessage(startsWith("length and breadth"));
        Square square = Square.create(-5);
    }
}