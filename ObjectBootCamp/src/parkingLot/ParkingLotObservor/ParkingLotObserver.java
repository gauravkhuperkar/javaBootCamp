package parkingLot.ParkingLotObservor;

/*
    Job :-
        
*/

import parkingLot.ParkingLot;
import parkingLot.ParkingLots;

public class ParkingLotObserver {
    protected ParkingLots parkingLots;

    public ParkingLotObserver(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void report(ParkingLot parkingLot){
        if(parkingLots.containsKey(parkingLot))
            parkingLots.replace(parkingLot,(parkingLots.get(parkingLot)+1));
    }
}
