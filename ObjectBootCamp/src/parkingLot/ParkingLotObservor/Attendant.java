package parkingLot.ParkingLotObservor;
/*
    Job :-
        observer the parking lot and take actions relativly
*/

import parkingLot.ParkingLot;
import parkingLot.ParkingLots;

public class Attendant extends ParkingLotObserver {

    public Attendant(ParkingLots parkingLots) {
        super(parkingLots);
    }

    public boolean isTwentyPercentOrBelow(ParkingLot parkingLot){
        return (parkingLots.isAvailable(parkingLot) && parkingLot.isCapacityLessThanOrBelow(0.2));
    }
}
