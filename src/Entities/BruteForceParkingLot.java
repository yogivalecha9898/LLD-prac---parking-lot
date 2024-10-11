package Entities;

import Constants.Constants;
import Enums.VehicleType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BruteForceParkingLot extends ParkingLot {
    private final String[][] aMap;
    private final Map<String, String> map;

    public BruteForceParkingLot(String id, Integer floors, Integer lots) {
        super(id, floors, lots);

        this.aMap = new String[floors][lots];
        this.map = new HashMap<>();

        for(int i = 0; i < floors; i++) Arrays.fill(aMap[i], Constants.SINGLE_SPACE.trim());
    }

    public String[][] getAMap() {
        return this.aMap;
    }

    private void parkVehicle(int floor, int lot, String regId) {
        aMap[floor][lot] = regId;
        map.put(regId, floor + " " + lot);
    }

    public void addVehicleToParking(String vehicle, String regId, String color) {
        int[] avaiParkingLot;

        if(VehicleType.CAR.name().equals(vehicle)) {
            avaiParkingLot = getParkingLot(3, super.getLots());
        } else if(VehicleType.BIKE.name().equals(vehicle)) {
            avaiParkingLot = getParkingLot(1, 3);
        } else {
            avaiParkingLot = getParkingLot(0, 1);
        }

    }

    private int[] getParkingLot(int start, int end) {
        int floor = -1, lot = -1;

        for(int i = 0; i < super.getFloors(); i++) {
            for(int j = start; j < end; j++) {
                if(Constants.SINGLE_SPACE.trim().equals(this.aMap[i][j])) {
                    floor = i;
                    lot = j;

                    break;
                }
            }
            if(floor != -1) break;
        }

        return new int[] {floor, lot};
    }
}
