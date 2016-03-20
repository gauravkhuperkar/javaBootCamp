package measurements;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnitTest {
    @Test
    public void compare_gives_true_for_12inch_is_equal_to_12Inch() throws Exception {
        Unit inch =  Inch.create(12);
        Unit otherInch = Inch.create(12);
        assertTrue(inch.equalsTo(otherInch));
    }

    @Test
    public void compare_gives_true_for_same_unit_value_of_different_unit() throws Exception {
        Unit feet =  Feet.create(1);
        Unit otherInch = Inch.create(12);
        assertEquals(true, feet.equalsTo(otherInch));
    }

    @Test
    public void compare_gives_true_for_2inch_is_equal_to_5centimeter() throws Exception {
        Unit inch =  Inch.create(2);
        Unit cm = Centimeter.create(5);
        assertTrue(inch.equalsTo(cm));
    }

//    @Test
//    public void compare_gives_true_for_1centimeter_is_equal_to_10millimeter() throws Exception {
//        Unit cm = Centimeter.create(1);
//        Unit mm = Millimeter.create(10);
//        assertTrue(cm.equalsTo(mm));
//    }

    @Test
    public void compare_gives_false_for_difrent_value_of_same_unit() throws Exception {
        Unit inch =  Inch.create(2);
        Unit otherInch = Inch.create(10);
        assertEquals(false, inch.equalsTo(otherInch));
    }

    @Test
    public void add_can_add_two_diff_length_unit() throws Exception {
        Unit inch =  Inch.create(2);
        Unit centimeter = Centimeter.create(2.5);
        Unit expected = Inch.create(3);
        assertEquals(true, expected.equalsTo(inch.add(centimeter)));
    }

    @Test
    public void add_can_add_two_diff_volume_unit() throws Exception {
        Unit litre = Litre.create(1);
        Unit gallon = Gallon.create(1);
        Unit expected = Litre.create(4.78);
        Unit actual = litre.add(gallon);
        assertEquals(true, expected.equalsTo(actual));
    }

    @Test
    public void compare_gives_true_for_same_values_for_volume_unit() throws Exception {
        Unit liter = Litre.create(1);
        Unit otherLiter = Litre.create(1);
        assertEquals(true,liter.equalsTo(otherLiter));
    }

    @Test
    public void compare_gives_true_for_1_gallon_equals_to_3Point78_gallon() throws Exception {
        Unit gallon = Gallon.create(1);
        Unit otherLiter = Litre.create(3.78);
        assertEquals(true,gallon.equalsTo(otherLiter));

    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void add_throws_exception_for_different_measurement_unit() throws Exception {
        Unit inch = Inch.create(1);
        Unit litre = Litre.create(1);
        thrown.expect(NotOfSameMeasurementException.class);
        litre.add(inch);
    }
    @Test
    public void equal_throws_exception_for_different_measurement_unit() throws Exception {
        Unit inch = Inch.create(1);
        Unit litre = Litre.create(1);
        thrown.expect(NotOfSameMeasurementException.class);
        litre.equalsTo(inch);
    }
}