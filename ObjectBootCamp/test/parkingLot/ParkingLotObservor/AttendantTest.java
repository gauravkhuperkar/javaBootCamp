package parkingLot.ParkingLotObservor;

import org.junit.Test;
import parkingLot.ParkingLot;
import parkingLot.ParkingLots;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AttendantTest {
    @Test
    public void attendant_should_say_true_if_particular_parking_lot_capacity_is_less_or_equal_to_20_percent() {
        ParkingLot parkingLotFor5 = new ParkingLot(5);
        ParkingLot parkingLotFor1 = new ParkingLot(1);
        ParkingLots parkingLots = new ParkingLots();

        parkingLots.add(parkingLotFor5);
        parkingLots.add(parkingLotFor1);
        Attendant attendant = new Attendant(parkingLots);

        assertTrue(attendant.isTwentyPercentOrBelow(parkingLotFor5));

    }

    @Test
    public void attendant_should_say_false_if_particular_parking_lot_capacity_is_greater_than_20_percent() {
        ParkingLot parkingLotFor5 = new ParkingLot(5);
        ParkingLots parkingLots = new ParkingLots();

        parkingLotFor5.park(new Object());
        parkingLotFor5.park(new Object());
        parkingLotFor5.park(new Object());
        parkingLots.add(parkingLotFor5);

        Attendant attendant = new Attendant(parkingLots);

        assertFalse(attendant.isTwentyPercentOrBelow(parkingLotFor5));
    }
}