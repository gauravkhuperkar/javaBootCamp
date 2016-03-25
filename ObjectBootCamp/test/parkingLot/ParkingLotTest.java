package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void parking_lot_should_park_the_vehicle() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object vehicle = new Object();

        assertTrue(parkingLot.park(vehicle));

    }

    @Test
    public void parking_lot_should_tell_if_parking_lot_is_full_or_not() {
        ParkingLot parkingLot = new ParkingLot(1);
        Object vehicle = new Object();

        parkingLot.park(vehicle);

        assertTrue(parkingLot.isFull());

    }
}