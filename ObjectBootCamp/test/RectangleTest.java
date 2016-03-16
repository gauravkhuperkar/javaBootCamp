import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void test_should_return_area_of_rectangle_if_we_give_length_and_breadth() throws Exception {
        int length = 10;
        int breadth = 15;
        Rectangle rectangle = new Rectangle(length,breadth);
        int expected = 150;
        Assert.assertEquals(expected,rectangle.area());
    }

    @Test
    public void test_should_return_zero_if_any_diamension_is_zero() throws Exception {
        int length = 0;
        int breadth = 10;
        Rectangle rectangle = new Rectangle(length,breadth);
        int expected = 0;
        Assert.assertEquals(expected,rectangle.area());
    }

    @Test
    public void test_should_return_zero_if_both_diamension_are_zero() throws Exception {
        int length = 0;
        int breadth = 0;
        Rectangle rectangle = new Rectangle(length,breadth);
        int expected = 0;
        Assert.assertEquals(expected,rectangle.area());
    }
}