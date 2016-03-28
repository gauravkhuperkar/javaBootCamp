package parkingLot.ParkingLotObservor;

/*
    Job :-
        
*/

import parkingLot.ParkingLot;
import parkingLot.ParkingLots;

import java.util.ArrayList;

public class ParkingLotObserver {
    private final ArrayList<ParkingLotObserver> observers;
    protected ParkingLots parkingLots;

    public ParkingLotObserver(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
        this.observers = new ArrayList<>();
    }

    public void addObserver(ParkingLotObserver observer){
        observers.add(observer);
    }

    public void report(ParkingLot parkingLot){
        if(parkingLots.isAvailable(parkingLot))
            parkingLots.park(parkingLot);
    }

    @Override
    public String toString() {
        return "ParkingLotObserver{" +
                "observers=" + observers +
                ", parkingLots=" + parkingLots +
                '}';
    }
}
