import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void test_should_return_area_of_rectangle_if_we_give_length_and_breadth_as_double() throws Exception {
        double length = 10.0;
        double breadth = 15.0;
        Rectangle rectangle = new Rectangle(length,breadth);
        double expected = 150;
        Assert.assertEquals(expected,rectangle.area(),0.001);
    }

    @Test
    public void test_should_return_area_of_rectangle_if_we_give_length_and_breadth_as_integer() throws Exception {
        int length = 10;
        int breadth = 15;
        Rectangle rectangle = new Rectangle(length,breadth);
        int expected = 150;
        Assert.assertEquals(expected,rectangle.area(),0.001);
    }
    @Test
    public void test_should_return_area_of_rectangle_if_we_give_length_and_breadth_as_float() throws Exception {
        double length = 10.25;
        double breadth = 8.5;
        Rectangle rectangle = new Rectangle(length,breadth);
        double expected = 87.125;
        Assert.assertEquals(expected,rectangle.area(),0.001);
    }

    @Test
    public void test_should_return_perimeter_of_rectangle_if_we_give_length_and_breadth() throws Exception {
        double length = 10;
        double breadth = 15;
        Rectangle rectangle = new Rectangle(length,breadth);
        double expected = 50;
        Assert.assertEquals(expected,rectangle.perimeter(),0.001);
    }
}