import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test(expected= IllegalArgumentException.class)
    public void calculateArea_should_throw_an_illegal_argument_exception_if_length_is_negative() {
        double length = -4;
        double breadth = 15.0;
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test(expected= IllegalArgumentException.class)
    public void calculateArea_should_throw_an_illegal_argument_exception_if_breadth_is_negative() {
        double length = 40;
        double breadth = -15;
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test
    public void calculateArea_should_return_area_of_rectangle_if_we_give_length_and_breadth_as_double() {
        double length = 10.0;
        double breadth = 15.0;
        Rectangle rectangle = Rectangle.create(length,breadth);
        double expected = 150;
        assertEquals(expected,rectangle.calculateArea(),0.001);
    }


    @Test(expected= IllegalArgumentException.class)
    public void calculatePerimeter_should_throw_an_illegal_argument_exception_if_dimentions_are_negative() {
        double length = -25;
        double breadth = -62;
        Rectangle rectangle = Rectangle.create(length, breadth);
    }

    @Test
    public void calculatePerimeter_should_return_perimeter_of_rectangle_if_we_give_length_and_breadth() {
        double length = 10;
        double breadth = 15;
        Rectangle rectangle = Rectangle.create(length,breadth);
        double expected = 50;
        assertEquals(expected,rectangle.calculatePerimeter(),0.001);
    }
}