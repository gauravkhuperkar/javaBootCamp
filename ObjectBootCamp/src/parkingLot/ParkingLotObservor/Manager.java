package parkingLot.ParkingLotObservor;
/*
    Job :-
        get status and give bahaviour with that
*/

import parkingLot.ParkingLot;
import parkingLot.ParkingLots;

public class Manager extends ParkingLotObserver {
    public Manager(ParkingLots parkingLots) {
        super(parkingLots);
    }

    public boolean isEightyPercentOrAbove(ParkingLot parkingLot){
        return (parkingLots.isAvailable(parkingLot) && parkingLot.isCapacityGreaterThanOrAbove(0.8));
    }
}
