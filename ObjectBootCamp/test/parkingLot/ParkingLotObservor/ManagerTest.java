package parkingLot.ParkingLotObservor;

import org.junit.Test;
import parkingLot.ParkingLot;
import parkingLot.ParkingLots;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ManagerTest {
    @Test
    public void manager_should_say_true_if_particular_parking_lot_capacity_is_greater_than_or_equal_to_80_percent() {
        ParkingLot parkingLotFor1 = new ParkingLot(1);
        ParkingLot parkingLotFor2 = new ParkingLot(2);
        ParkingLots parkingLots = new ParkingLots();

        parkingLotFor1.park(new Object());
        parkingLots.add(parkingLotFor1);
        parkingLots.add(parkingLotFor2);

        Manager manager = new Manager(parkingLots);

        assertTrue(manager.isEightyPercentOrAbove(parkingLotFor1));
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
