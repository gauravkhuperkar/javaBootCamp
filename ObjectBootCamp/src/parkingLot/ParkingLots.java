package parkingLot;
/*
    Job :-
        holds collection of parkingLot and give answer related to that
*/

import java.util.HashMap;

public class ParkingLots {
    private final HashMap<ParkingLot,Integer> parkingLots;

    public ParkingLots() {
        this.parkingLots = new HashMap();
    }

    public void add(ParkingLot parkingLot){
        parkingLots.put(parkingLot,0);
    }

    public int size(){
        return parkingLots.size();
    }

    public boolean isAvailable(ParkingLot parkingLot) {
        return parkingLots.containsKey(parkingLot);
    }

    public void park(ParkingLot parkingLot) {
        parkingLots.replace(parkingLot, parkingLots.get(parkingLot)+1);
    }
}
