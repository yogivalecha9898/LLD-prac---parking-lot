package Entities;

import java.util.ArrayList;
import java.util.List;

public class ParkingLots {
    private List<ParkingLot> list;

    public List<ParkingLot> getParkingLots() {
        return this.list;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        if(list == null) {
            list = new ArrayList<>();
        }

        this.list.add(parkingLot);
    }

    @Override
    public String toString() {
        return "ParkingLots{" +
                "list=" + list +
                '}';
    }
}
