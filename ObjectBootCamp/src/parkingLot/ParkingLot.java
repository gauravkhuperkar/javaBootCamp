package parkingLot;
/*
    Job :-
        park vechicles and provide status
*/

import java.util.HashSet;

public class ParkingLot {
    private final HashSet<Object> parkedVehicle;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedVehicle = new HashSet<Object>();
    }

    public boolean park(Object vehicle) {
        return parkedVehicle.add(vehicle);
    }

    public boolean isFull() {
        return parkedVehicle.size() == capacity;
    }
}
