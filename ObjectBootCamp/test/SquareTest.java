import Exceptions.NonPositiveInputException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import shaps.Rectangle;
import shaps.Square;

import static org.hamcrest.core.StringStartsWith.startsWith;

public class SquareTest {
    private Rectangle square;

    @Before
    public void setUp() throws Exception {
        square = Square.create(5);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea_should_calculte_area_of_a_square() throws Exception {
        Assert.assertEquals(square.calculateArea(),25,0);
    }

    @Test
    public void calculatePerimiter_should_calculate_perimiter_of_a_square() throws Exception {
//        shaps.Square square = shaps.Square.create(4);
        Assert.assertEquals(square.calculatePerimeter(),20,0);
    }
    @Test
    public void calculatePerimeter_should_throw_an_illegal_argument_exception_if_side_is_negative() throws Exception {
        thrown.expect(NonPositiveInputException.class);
        thrown.expectMessage(startsWith("side"));
        Square squareNotExist = Square.create(-5);
    }
}