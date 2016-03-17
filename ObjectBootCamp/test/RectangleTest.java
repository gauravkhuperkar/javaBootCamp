import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void calculateArea_should_throw_an_illegal_argument_exception_if_length_is_negative() throws Exception {
        double length = -4;
        double breadth = 15.0;
        thrown.expect(NonPositiveInputException.class);
        thrown.expectMessage(startsWith("length and breadth"));
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test
    public void calculateArea_should_throw_an_illegal_argument_exception_if_breadth_is_negative() throws Exception {
        double length = 40;
        double breadth = -15;
        thrown.expect(NonPositiveInputException.class);
        thrown.expectMessage(startsWith("length and breadth"));
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test
    public void calculateArea_should_throw_an_illegal_argument_exception_if_dimensions_are_zero() throws Exception {
        double length = 0;
        double breadth = 15.0;
        thrown.expect(NonPositiveInputException.class);
        thrown.expectMessage(startsWith("length and breadth"));
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test
    public void calculateArea_should_return_area_of_rectangle_if_we_give_length_and_breadth_as_double() throws Exception{
        double length = 10.0;
        double breadth = 15.0;
        Rectangle rectangle = Rectangle.create(length,breadth);
        double expected = 150;
        assertEquals(expected,rectangle.calculateArea(),0.001);
    }


    @Test
    public void calculatePerimeter_should_throw_an_illegal_argument_exception_if_dimentions_are_negative() throws Exception {
        double length = -25;
        double breadth = -62;
        thrown.expect(NonPositiveInputException.class);
        thrown.expectMessage(startsWith("length and breadth"));
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test
    public void calculatePerimeter_should_return_perimeter_of_rectangle_if_we_give_length_and_breadth() throws Exception {
        double length = 10;
        double breadth = 15;
        Rectangle rectangle = Rectangle.create(length,breadth);
        double expected = 50;
        assertEquals(expected,rectangle.calculatePerimeter(),0.001);
    }
}