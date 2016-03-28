package measurements;

import measurements.scale.VolumeMeasurement;
import measurements.unit.VolumeUnits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeMeasurementTest {

    @Test
    public void volumeMeasurement_knows_1_litre_is_equal_1_litre() {
        VolumeMeasurement _1_liter = new VolumeMeasurement(1,VolumeUnits.LITRE);
        VolumeMeasurement other_1_litre = new VolumeMeasurement(1,VolumeUnits.LITRE);

        assertEquals(true,_1_liter.equalTo(other_1_litre));
    }

    @Test
    public void volumeMeasurement_knows_addition_of_1_litre_and_1_gallon_is_4point18_litre() {
        VolumeMeasurement _1_litre = new VolumeMeasurement(1,VolumeUnits.LITRE);
        VolumeMeasurement _1_gallon = new VolumeMeasurement(1,VolumeUnits.GALLON);
        VolumeMeasurement expected = new VolumeMeasurement(4.78,VolumeUnits.LITRE);

        assertEquals(true, expected.equalTo(_1_litre.add(_1_gallon)));
    }

    @Test
    public void volumeMeasurement_knows_1_gallon_is_equal_to_3point78_litre() {
        VolumeMeasurement _3point78_litre = new VolumeMeasurement(3.78,VolumeUnits.LITRE);
        VolumeMeasurement  _1_gallon = new VolumeMeasurement(1,VolumeUnits.GALLON);

        assertEquals(true,_3point78_litre.equalTo(_1_gallon));
    }
}
