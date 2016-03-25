package parkingLot;
/*
    Job :-
        holds collection of parkingLot and give answer related to that
*/

import java.util.HashMap;

public class ParkingLots extends HashMap<ParkingLot, Integer>{
    private final HashMap<ParkingLot,Integer> parkingLots;

    public ParkingLots() {
        this.parkingLots = new HashMap();
    }

    public Integer add(ParkingLot parkingLot){
        return parkingLots.put(parkingLot,0);
    }
}
