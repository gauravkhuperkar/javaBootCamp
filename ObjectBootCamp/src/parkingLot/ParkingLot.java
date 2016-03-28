package parkingLot;
/*
    Job :-
        park vechicles and provide status
*/

import parkingLot.ParkingLotObservor.ParkingLotObserver;

import java.util.HashSet;

public class ParkingLot {
    private ParkingLotObserver observers = new ParkingLotObserver(new ParkingLots());
    private final HashSet<Object> parkedVehicle;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedVehicle = new HashSet<>();
    }

    public boolean park(Object vehicle) {
        observers.report(this);
        return parkedVehicle.add(vehicle);
    }

    public boolean isFull() {
        return parkedVehicle.size() == capacity;
    }

    public boolean isCapacityGreaterThanOrAbove(double threshould) {
        return (parkedVehicle.size() >= (int)capacity*threshould);
    }

    public boolean isCapacityLessThanOrBelow(double threshould) {
        return (parkedVehicle.size() <= (int)capacity*threshould);
    }

}
