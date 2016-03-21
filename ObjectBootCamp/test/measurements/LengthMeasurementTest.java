package measurements;

import measurements.scale.LengthMeasurement;
import measurements.unit.LengthUnits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthMeasurementTest {
    @Test
    public void LengthMeasurement_knows_12inch_is_equal_to_12inch() {

        LengthMeasurement _1_inch = new LengthMeasurement(12, LengthUnits.INCH);
        LengthMeasurement other_1_inch = new LengthMeasurement(12, LengthUnits.INCH);

        assertEquals(true,_1_inch.equalTo(other_1_inch));
    }

    @Test
    public void LengthMeasurement_knows_1Feet_is_equal_to_12inch() {

        LengthMeasurement _1ft = new LengthMeasurement(1,LengthUnits.FEET);
        LengthMeasurement _12_inch = new LengthMeasurement(12,LengthUnits.INCH);

        assertEquals(true, _1ft.equalTo(_12_inch));
    }

    @Test
    public void LengthMeasurement_knows_2_inch_is_equal_to_5_cm() {

        LengthMeasurement _2_inch = new LengthMeasurement(2,LengthUnits.INCH);
        LengthMeasurement _5_cm = new LengthMeasurement(5,LengthUnits.CM);

        assertEquals(true, _2_inch.equalTo(_5_cm));
    }

    @Test
    public void LengthMeasurement_knows_1_cm_is_equal_to_10_mm() {

        LengthMeasurement _1_cm = new LengthMeasurement(1,LengthUnits.CM);
        LengthMeasurement _10_mm = new LengthMeasurement(10,LengthUnits.MM);

        assertEquals(true, _1_cm.equalTo(_10_mm));
    }

    @Test
    public void LengthMeasurement_knows_1_inch_is_not_equal_to_10_mm() {

        LengthMeasurement _1_inch = new LengthMeasurement(2,LengthUnits.INCH);
        LengthMeasurement _10_cm = new LengthMeasurement(10,LengthUnits.CM);

        assertEquals(false, _1_inch.equalTo(_10_cm));
    }

    @Test
    public void LengthMeasurement_knows_2_inches_are_not_equal_to_10_inches() throws Exception {

        LengthMeasurement _1_inch = new LengthMeasurement(2,LengthUnits.INCH);
        LengthMeasurement other_1_inch = new LengthMeasurement(10,LengthUnits.INCH);

        assertEquals(false, _1_inch.equalTo(other_1_inch));
    }

    @Test
    public void LengthMeasurement_knows_how_to_add_2_inches_with_2point5_cm() throws Exception {

        LengthMeasurement _2_inch = new LengthMeasurement(2,LengthUnits.INCH);
        LengthMeasurement _2point5_cm = new LengthMeasurement(2.5,LengthUnits.CM);
        LengthMeasurement _3_inch = new LengthMeasurement(3,LengthUnits.INCH);
        LengthMeasurement actual = _2_inch.add(_2point5_cm);

        assertEquals(true, _3_inch.equalTo(actual));
    }
}
