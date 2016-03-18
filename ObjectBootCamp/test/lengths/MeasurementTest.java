package lengths;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gauravkh on 18/03/16.
 */
public class MeasurementTest {
    @Test
    public void compare_gives_true_for_12inch_is_equal_to_12Inch() throws Exception {
        Scale inch =  Inch.create(12);
        Scale otherInch = Inch.create(12);
        Measurement measurement = new Measurement(inch);
        Assert.assertTrue(measurement.compare(otherInch));
    }
    @Test
    public void compare_gives_false_for_difrent_value_of_same_unit() throws Exception {
        Scale inch =  Inch.create(2);
        Scale otherInch = Inch.create(12);
        Measurement measurement = new Measurement(inch);
        assertEquals(false, measurement.compare(otherInch));
    }
    @Test
    public void compare_gives_true_for_same_unit_value_of_diffrent_unit() throws Exception {
        Scale feet =  Feet.create(1);
        Scale otherInch = Inch.create(12);
        Measurement measurement = new Measurement(feet);
        assertEquals(false, measurement.compare(otherInch));
    }

    @Test
    public void compare_gives_true_for_same_values_for_same_unit() throws Exception {
        Scale liter = Liter.create(1);
        Scale otherLiter = Liter.create(1);
        Measurement measurement = new Measurement(liter);
        assertEquals(true, measurement.compare(otherLiter));

    }
    @Test
    public void compare_gives_true_for_1_gallon_equals_to_3Point78_gallon() throws Exception {
        Scale liter = Gallon.create(1);
        Scale otherLiter = Liter.create(3.78);
        Measurement measurement = new Measurement(liter);
        assertEquals(true, measurement.compare(otherLiter));

    }
}