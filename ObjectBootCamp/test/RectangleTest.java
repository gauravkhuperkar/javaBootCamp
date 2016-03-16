import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void calculateArea_should_return_area_of_rectangle_if_we_give_length_and_breadth_as_double() {
        double length = 10.0;
        double breadth = 15.0;
        Rectangle rectangle = new Rectangle(length,breadth);
        double expected = 150;
        Assert.assertEquals(expected,rectangle.calculateArea(),0.001);
    }

    @Test
    public void calculatePerimeter_should_return_perimeter_of_rectangle_if_we_give_length_and_breadth() {
        double length = 10;
        double breadth = 15;
        Rectangle rectangle = new Rectangle(length,breadth);
        double expected = 50;
        Assert.assertEquals(expected,rectangle.calculatePerimeter(),0.001);
    }
}