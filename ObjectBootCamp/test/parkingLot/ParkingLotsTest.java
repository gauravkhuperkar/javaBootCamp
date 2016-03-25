package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingLotsTest {
    @Test
    public void parkingLots_should_be_empty_initially() {
        ParkingLots parkingLots = new ParkingLots();

        assertEquals(0,parkingLots.size());
    }
    @Test
    public void parkingLots_should_add_a_parking_lot() {
        ParkingLots parkingLots = new ParkingLots();
        ParkingLot parkingLotFor5 = new ParkingLot(5);

        parkingLots.add(parkingLotFor5);

        assertEquals(1,parkingLots.size());
    }

    @Test
    public void parkingLots_should_add_more_than_1_parking_lot() {
        ParkingLots parkingLots = new ParkingLots();

        ParkingLot parkingLotFor5 = new ParkingLot(5);
        ParkingLot parkingLotFor2 = new ParkingLot(2);
        ParkingLot parkingLotFor10 = new ParkingLot(10);
        ParkingLot parkingLotFor12 = new ParkingLot(12);

        parkingLots.add(parkingLotFor5);
        parkingLots.add(parkingLotFor2);
        parkingLots.add(parkingLotFor10);
        parkingLots.add(parkingLotFor12);

        assertEquals(4,parkingLots.size());
    }

}
